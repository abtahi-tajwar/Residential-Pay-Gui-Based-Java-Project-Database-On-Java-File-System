package org;

import org.Registration;
import org.BillDetails;
import org.About;
import org.BillDetails;
import org.ErrorSignIn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class SignIn {
	public static String userID;
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn window = new SignIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frame.setTitle("Residential Pay");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("User Name");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(274, 93, 154, 37);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(228, 140, 236, 39);
		frame.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.YELLOW);
		label_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		label_1.setBounds(274, 189, 154, 37);
		frame.getContentPane().add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(228, 232, 236, 39);
		frame.getContentPane().add(passwordField);
		
		JButton button = new JButton("LOG IN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userID = textField.getText();
				String password = String.valueOf(passwordField.getPassword());
				String up = userID+password;
				int flag=0;
				FileWriter fw=null;
		        FileReader fr = null;
		        BufferedReader br = null;
		        File f = new File("C:\\Residential Pay\\src\\org\\database\\registration.txt");
		        try{
		            fr = new FileReader(f);
		            br = new BufferedReader(fr);
		            String st=" ";
		            String []words=null;
		            while((st=br.readLine()) !=null){ 
						words=st.split(" ");
		            for (String word : words){
		                if(word.equals(up)){ 
		                     flag=1;}
		        }
					   }
		        }
		        catch(Exception es){
		        	es.printStackTrace();
		        }
		        finally{
		            try{
		                fr.close();
		            }
		            catch(IOException ie){
		                ie.printStackTrace();
		            }
		            catch(NullPointerException ie){
		            	ie.printStackTrace();
		            }
		        }
				if(flag==1) {
					BillDetails.main(null);
					frame.dispose();
				}
				else {
					ErrorSignIn.main(null);
				}
			}
		});
		button.setForeground(Color.BLACK);
		button.setBackground(Color.RED);
		button.setBounds(303, 299, 101, 33);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("New User?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.CYAN);
		label_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		label_2.setBounds(228, 347, 128, 37);
		frame.getContentPane().add(label_2);
		
		JButton button_1 = new JButton("Sign Up Now");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration.main(null);
				frame.dispose();
			}
		});
		button_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(350, 347, 114, 31);
		frame.getContentPane().add(button_1);
		
		JLabel usericon = new JLabel("");
		usericon.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\uidicon.png"));
		usericon.setHorizontalAlignment(SwingConstants.CENTER);
		usericon.setBounds(178, 140, 40, 40);
		frame.getContentPane().add(usericon);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\passicon.png"));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(178, 231, 40, 40);
		frame.getContentPane().add(label_3);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About.main(null);
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\1200px-Info_icon_002.svg[1].png"));
		button_2.setBounds(654, 439, 50, 45);
		frame.getContentPane().add(button_2);
		frame.setResizable(false);
		frame.setBounds(450, 125, 718, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
