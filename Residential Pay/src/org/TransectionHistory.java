package org;

import java.awt.EventQueue;

import org.BillDetails;
import org.SignIn;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import java.awt.Toolkit;

public class TransectionHistory extends SignIn{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransectionHistory window = new TransectionHistory();
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
	public TransectionHistory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(450, 125, 718, 533);
		frame.setTitle("Residential Pay");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Transection History");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(262, 49, 208, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BillDetails.main(null);
				frame.dispose();
			}
		});
		button.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\back.png"));
		button.setBounds(10, 10, 65, 31);
		frame.getContentPane().add(button);
		String text="";
        FileReader fr = null;
        BufferedReader br = null;
        File f = new File("C:\\Residential Pay\\src\\org\\database\\billDetails\\"+SignIn.userID+".txt");
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String st=" ";
            while((st=br.readLine())!=null){
              
                text=text+"\r\n"+st;
            }
        }
        catch(Exception e){
            e.printStackTrace();
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
		
		JTextArea txtrSomeText = new JTextArea();
		txtrSomeText.setBackground(Color.ORANGE);
		txtrSomeText.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtrSomeText.setText(text);
		txtrSomeText.setEditable(false);
		txtrSomeText.setBounds(62, 127, 372, 340);
		frame.getContentPane().add(txtrSomeText);
		
		JScrollPane scrollPane = new JScrollPane(txtrSomeText);
		scrollPane.setBounds(50,110,600,340);
		frame.getContentPane().add(scrollPane);
	}
}
