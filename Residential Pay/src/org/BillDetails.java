package org;

import java.awt.EventQueue;

import org.SignIn;
import org.TransectionHistory;
import org.About;
import org.MobileBankingPayment;
import org.CardPay;
import org.PaymentMethodCheck;
import org.BillCheck;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Choice;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class BillDetails extends SignIn{
	public static String amount="0.0";
	public static String bill,pMethod,bP,bNo;
	private JFrame frame;
	private JTextField txtDd;
	private JTextField txtMm;
	private JTextField txtBillNo;
	private JTextField txtBillAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillDetails window = new BillDetails();
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
	public BillDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setResizable(false);
		frame.setTitle("Residential Pay");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frame.setBounds(450, 125, 718, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		choice.setForeground(Color.DARK_GRAY);
		choice.setBackground(Color.ORANGE);
		choice.setBounds(224, 109, 206, 18);
		choice.add("Select Bill");
		choice.add("Electricity Bill");
		choice.add("Gas Bill");
		choice.add("Internet Bill");
		choice.add("Water Bill");
		frame.getContentPane().add(choice);
		
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To Residential Pay");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(176, 37, 294, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtDd = new JTextField();
		txtDd.setText("MM");
		txtDd.setHorizontalAlignment(SwingConstants.CENTER);
		txtDd.setBounds(347, 152, 29, 19);
		frame.getContentPane().add(txtDd);
		txtDd.setColumns(10);
		
		txtMm = new JTextField();
		txtMm.setHorizontalAlignment(SwingConstants.CENTER);
		txtMm.setText("YYYY");
		txtMm.setBounds(386, 152, 44, 19);
		frame.getContentPane().add(txtMm);
		txtMm.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bill Period :");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(229, 144, 108, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtBillNo = new JTextField();
		txtBillNo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtBillNo.setText("BIll NO/Biller ID");
		txtBillNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtBillNo.setBounds(224, 188, 206, 25);
		frame.getContentPane().add(txtBillNo);
		txtBillNo.setColumns(10);
		
		txtBillAmount = new JTextField();
		txtBillAmount.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtBillAmount.setText("Bill Amount");
		txtBillAmount.setHorizontalAlignment(SwingConstants.CENTER);
		txtBillAmount.setColumns(10);
		txtBillAmount.setBounds(224, 230, 206, 25);
		frame.getContentPane().add(txtBillAmount);
		
		Choice choice_1 = new Choice();
		choice_1.setBackground(new Color(255, 160, 122));
		choice_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		choice_1.setBounds(224, 267, 206, 52);
		choice_1.add("Select Payment Method");
		choice_1.add("Mobile Banking");
		choice_1.add("Card");
		
		frame.getContentPane().add(choice_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\1.png"));
		lblNewLabel_3.setBounds(165, 435, 50, 45);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\2.png"));
		label.setBounds(226, 435, 50, 45);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\5.png"));
		label_1.setBounds(286, 435, 50, 45);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\3.png"));
		label_2.setBounds(347, 435, 50, 45);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\6.png"));
		label_3.setBounds(407, 435, 50, 45);
		frame.getContentPane().add(label_3);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\q1.png"));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(467, 435, 50, 45);
		frame.getContentPane().add(label_5);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setForeground(new Color(250, 235, 215));
		btnSignOut.setBackground(new Color(255, 0, 0));
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn.main(null);
				frame.dispose();
			}
		});
		btnSignOut.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		btnSignOut.setBounds(618, 10, 86, 31);
		frame.getContentPane().add(btnSignOut);
		
		JButton btnNewButton_1 = new JButton("Transection History");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransectionHistory.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(25, 25, 112));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(552, 109, 152, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Next ");
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flag = 0;
				if(choice.getSelectedItem().equals("Electricity Bill") && !txtDd.getText().equals("MM") && !txtMm.getText().equals("YYYY") && !txtBillNo.getText().equals("BIll NO/Biller ID") && !txtBillAmount.getText().equals("Bill Amount")) {
					bill = "Electricity Bill";
					flag=1;
				}
				else if(choice.getSelectedItem().equals("Gas Bill") && !txtDd.getText().equals("MM") && !txtMm.getText().equals("YYYY") && !txtBillNo.getText().equals("BIll NO/Biller ID") && !txtBillAmount.getText().equals("Bill Amount")) {
					bill = "Gas Bill";
					flag=1;
				}
				else if(choice.getSelectedItem().equals("Internet Bill") && !txtDd.getText().equals("MM") && !txtMm.getText().equals("YYYY") && !txtBillNo.getText().equals("BIll NO/Biller ID") && !txtBillAmount.getText().equals("Bill Amount")) {
					bill = "Internet Bill";
					flag=1;
				}
				else if(choice.getSelectedItem().equals("Water Bill") && !txtDd.getText().equals("MM") && !txtMm.getText().equals("YYYY") && !txtBillNo.getText().equals("BIll NO/Biller ID") && !txtBillAmount.getText().equals("Bill Amount")) {
					bill = "Water Bill";
					flag=1;
				}
				else {
					BillCheck.main(null);
				}
				amount = txtBillAmount.getText();
				bP = txtDd.getText()+"-"+txtMm.getText();
				bNo = txtBillNo.getText();
		        
				if(flag==1 && choice_1.getSelectedItem().equals("Mobile Banking")) {
					pMethod = "Mobile Banking";					
					MobileBankingPayment.main(null);
					frame.dispose();
				}
				else if(flag==1 && choice_1.getSelectedItem().equals("Card")) {
					pMethod = "Card Payment";
					CardPay.main(null);
					frame.dispose();
				}
				else {
					PaymentMethodCheck.main(null);
				}
				
			}
		});
		btnNewButton.setBounds(266, 317, 121, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About.main(null);
			}
		});
		button.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\1200px-Info_icon_002.svg[1].png"));
		button.setBounds(640, 435, 50, 45);
		frame.getContentPane().add(button);
	}
}
