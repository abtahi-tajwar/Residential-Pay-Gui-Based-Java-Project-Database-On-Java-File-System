package org;

import java.awt.EventQueue;

import org.BillDetails;
import org.SignIn;
import org.MobilePaymentCheck;
import org.TransectionResult;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MobileBankingPayment extends BillDetails{

	private JFrame frame;
	private JTextField txtEnterMobileaccountNumber;
	private JTextField txtEnterMobileBanking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MobileBankingPayment window = new MobileBankingPayment();
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
	public MobileBankingPayment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(450, 125, 718, 533);
		frame.setTitle("Residential Pay");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mobile Banking Payment");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(177, 94, 312, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\mbicon.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(279, 10, 104, 92);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtEnterMobileaccountNumber = new JTextField();
		txtEnterMobileaccountNumber.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterMobileaccountNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterMobileaccountNumber.setText("Enter Mobile/Account Number");
		txtEnterMobileaccountNumber.setBounds(199, 261, 279, 41);
		frame.getContentPane().add(txtEnterMobileaccountNumber);
		txtEnterMobileaccountNumber.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\5.png"));
		label.setBounds(256, 159, 50, 23);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\3.png"));
		label_1.setBounds(256, 184, 50, 23);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\q1.png"));
		label_2.setBounds(256, 209, 50, 23);
		frame.getContentPane().add(label_2);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("bKash");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(304, 159, 103, 23);
		bg.add(rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2 = new JLabel("Select Your Mobile Banking");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(226, 132, 226, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnRocket = new JRadioButton("Rocket");
		rdbtnRocket.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRocket.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		rdbtnRocket.setBounds(304, 184, 103, 23);
		bg.add(rdbtnRocket);
		frame.getContentPane().add(rdbtnRocket);
		
		JRadioButton rdbtnNagad = new JRadioButton("Nagad");
		rdbtnNagad.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNagad.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		rdbtnNagad.setBounds(304, 209, 103, 23);
		bg.add(rdbtnNagad);
		frame.getContentPane().add(rdbtnNagad);
		
		JButton btnNewButton = new JButton("Pay "+BillDetails.amount+" BDT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileWriter fw=null;
		        File f = new File("C:\\Residential Pay\\src\\org\\database\\billDetails\\"+SignIn.userID+".txt");
				if(rdbtnNewRadioButton.isSelected() && !txtEnterMobileaccountNumber.getText().equals("Enter Mobile/Account Number") && !txtEnterMobileBanking.getText().equals("Enter Mobile Banking PIN")) {
					
					try{
                        fw = new FileWriter(f,true);
                        String st= "";
                        st= "Bill: "+BillDetails.bill+"\n";
                        fw.write(st);
                        st= "Payment Method: "+BillDetails.pMethod+": bKash"+"\n";
                        fw.write(st);
                        st= "Bill Period: "+BillDetails.bP+"\n";
                        fw.write(st);
                        st= "Bill No: "+BillDetails.bNo+"\n";
                        fw.write(st);
                        st= "Amount: "+BillDetails.amount+"\n";
                        fw.write(st);
                        st = "________________________\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                    	ie.printStackTrace();
                    }
                    }
					TransectionResult.main(null);
					frame.dispose();
				}
				else if(rdbtnRocket.isSelected() && !txtEnterMobileaccountNumber.getText().equals("Enter Mobile/Account Number") && !txtEnterMobileBanking.getText().equals("Enter Mobile Banking PIN")) {
					
					try{
                        fw = new FileWriter(f,true);
                        String st= "";
                        st= "Bill: "+BillDetails.bill+"\n";
                        fw.write(st);
                        st= "Payment Method: "+BillDetails.pMethod+": Rocket"+"\n";
                        fw.write(st);
                        st= "Bill Period: "+BillDetails.bP+"\n";
                        fw.write(st);
                        st= "Bill No: "+BillDetails.bNo+"\n";
                        fw.write(st);
                        st= "Amount: "+BillDetails.amount+"\n";
                        fw.write(st);
                        st = "________________________\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                    	ie.printStackTrace();
                    }
                    }
					TransectionResult.main(null);
					frame.dispose();
				}
				else if(rdbtnNagad.isSelected() && !txtEnterMobileaccountNumber.getText().equals("Enter Mobile/Account Number") && !txtEnterMobileBanking.getText().equals("Enter Mobile Banking PIN")) {
					
					try{
                        fw = new FileWriter(f,true);
                        String st= "";
                        st= "Bill: "+BillDetails.bill+"\n";
                        fw.write(st);
                        st= "Payment Method: "+BillDetails.pMethod+": Nagad"+"\n";
                        fw.write(st);
                        st= "Bill Period: "+BillDetails.bP+"\n";
                        fw.write(st);
                        st= "Bill No: "+BillDetails.bNo+"\n";
                        fw.write(st);
                        st= "Amount: "+BillDetails.amount+"\n";
                        fw.write(st);
                        st = "________________________\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                    	ie.printStackTrace();
                    }
                    }
					TransectionResult.main(null);
					frame.dispose();
				}
				else {
					System.out.println("Pls Select One");
					MobilePaymentCheck.main(null);
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(226, 381, 226, 41);
		frame.getContentPane().add(btnNewButton);
		
		txtEnterMobileBanking = new JTextField();
		txtEnterMobileBanking.setText("Enter Mobile Banking PIN");
		txtEnterMobileBanking.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterMobileBanking.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterMobileBanking.setColumns(10);
		txtEnterMobileBanking.setBounds(199, 312, 279, 41);
		frame.getContentPane().add(txtEnterMobileBanking);
		
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
		
		JButton button_1 = new JButton("Sign Out");
		button_1.setForeground(new Color(255, 228, 196));
		button_1.setBackground(Color.RED);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn.main(null);
				frame.dispose();
			}
		});
		button_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		button_1.setBounds(618, 10, 86, 31);
		frame.getContentPane().add(button_1);
	}
}
