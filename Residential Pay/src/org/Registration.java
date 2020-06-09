package org;

import java.awt.EventQueue;

import org.SignIn;
import org.PopupError;
import org.SuccesPopup;
import org.UserIDerror;

import java.util.Scanner;

import java.io.File;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class Registration{

	private JFrame frmResidentialPay;
	private JTextField txtEnterFirstName;
	private JTextField txtEnterLastName;
	private JTextField txtEnterEmail;
	private JButton backbutton;
	private JTextField txtEnterUserId;
	private JTextField txtEnterPassword;
	private JTextField txtEnterMobileNumber;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frmResidentialPay.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResidentialPay = new JFrame();
		frmResidentialPay.setBackground(Color.BLUE);
		frmResidentialPay.setForeground(Color.BLUE);
		frmResidentialPay.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frmResidentialPay.setTitle("Residential Pay");
		frmResidentialPay.setResizable(false);
		frmResidentialPay.getContentPane().setBackground(Color.DARK_GRAY);
		frmResidentialPay.getContentPane().setLayout(null);
		
		txtEnterFirstName = new JTextField();
		txtEnterFirstName.setBackground(new Color(0, 204, 204));
		txtEnterFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterFirstName.setText("Enter First Name");
		txtEnterFirstName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterFirstName.setBounds(122, 90, 205, 30);
		frmResidentialPay.getContentPane().add(txtEnterFirstName);
		txtEnterFirstName.setColumns(10);
		
		txtEnterLastName = new JTextField();
		txtEnterLastName.setBackground(new Color(0, 204, 204));
		txtEnterLastName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterLastName.setText("Enter Last Name");
		txtEnterLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterLastName.setColumns(10);
		txtEnterLastName.setBounds(345, 90, 205, 30);
		frmResidentialPay.getContentPane().add(txtEnterLastName);
		
		txtEnterEmail = new JTextField();
		txtEnterEmail.setBackground(new Color(0, 204, 204));
		txtEnterEmail.setText("Enter Email");
		txtEnterEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterEmail.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterEmail.setColumns(10);
		txtEnterEmail.setBounds(122, 149, 428, 30);
		frmResidentialPay.getContentPane().add(txtEnterEmail);
		
		backbutton = new JButton("");
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn.main(null);
				frmResidentialPay.dispose();
			}
		});
		backbutton.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\back.png"));
		backbutton.setBounds(0, 0, 65, 31);
		frmResidentialPay.getContentPane().add(backbutton);
		
		txtEnterUserId = new JTextField();
		txtEnterUserId.setForeground(new Color(238, 232, 170));
		txtEnterUserId.setBackground(Color.BLUE);
		txtEnterUserId.setText("Enter User ID");
		txtEnterUserId.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterUserId.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterUserId.setColumns(10);
		txtEnterUserId.setBounds(122, 206, 428, 30);
		frmResidentialPay.getContentPane().add(txtEnterUserId);
		
		txtEnterPassword = new JTextField();
		txtEnterPassword.setForeground(new Color(238, 232, 170));
		txtEnterPassword.setBackground(Color.BLUE);
		txtEnterPassword.setText("Enter Password");
		txtEnterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterPassword.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterPassword.setColumns(10);
		txtEnterPassword.setBounds(122, 266, 428, 30);
		frmResidentialPay.getContentPane().add(txtEnterPassword);
		
		txtEnterMobileNumber = new JTextField();
		txtEnterMobileNumber.setBackground(new Color(0, 204, 204));
		txtEnterMobileNumber.setText("Enter Mobile Number");
		txtEnterMobileNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterMobileNumber.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterMobileNumber.setColumns(10);
		txtEnterMobileNumber.setBounds(122, 329, 428, 30);
		frmResidentialPay.getContentPane().add(txtEnterMobileNumber);
		
		lblNewLabel = new JLabel("Registration");
		lblNewLabel.setForeground(new Color(153, 255, 102));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(271, 27, 134, 41);
		frmResidentialPay.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtEnterFirstName.getText() + " " + txtEnterLastName.getText();
				String email = txtEnterEmail.getText();
				String userID = txtEnterUserId.getText();
				String password = txtEnterPassword.getText();
				String mobileNo = txtEnterMobileNumber.getText();
				FileWriter fw=null;
		        FileReader fr = null;
		        BufferedReader br = null;
		        File f = new File("C:\\Residential Pay\\src\\org\\database\\registration.txt");
		        File f2 = new File("C:\\Residential Pay\\src\\org\\database\\billDetails\\"+txtEnterUserId.getText()+".txt");
				if(userName.equals("Enter First Name Enter Last Name") || email.equals("Enter Email") || userID.equals("Enter User ID") || password.equals("Enter Password") || mobileNo.equals("Enter Mobile Number"))
				{
					PopupError.main(null);
				}
				else {
					
					int flag=1;
			        try{
			            fr = new FileReader(f);
			            br = new BufferedReader(fr);
			            String st=" ";
			            String []words=null;
			            while((st=br.readLine()) !=null){ 
							words=st.split(" ");
			            for (String word : words){
			                if(word.equals(userID)){ 
			                     flag=0;}
			        }
						   }
			        }
			        catch(Exception es){
			            System.out.println("Exception Caught");
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
					try{
						f2.createNewFile();
			            fw = new FileWriter(f,true);
			            String st= "";
			            st= "UserID+Pass: "+userID+password+" ";
			            fw.write(st);
			            st= "Mobile No: "+mobileNo+" ";
			            fw.write(st);
			            st= "Email : "+email+" ";
			            fw.write(st);
			            st= "Username: "+userName+" \n";
			            fw.write(st);
			        }
			        catch(IOException ie){
			            System.out.println("!!!!Error Caught!!!!");
			        }
			        finally{
			            try{
			            fw.close();
			        }
			        catch(IOException ie){
			        	 ie.printStackTrace();
			        }
			        catch(NullPointerException ie){
			        	 ie.printStackTrace();
			        }
			        }
					SignIn.main(null);
					SuccesPopup.main(null);
					frmResidentialPay.dispose();
				}
					else if(flag==0){
						UserIDerror.main(null);
					}
				}
				
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(292, 406, 113, 41);
		frmResidentialPay.getContentPane().add(btnNewButton);
		frmResidentialPay.setBounds(450, 125, 718, 533);
		frmResidentialPay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
