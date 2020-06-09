package org;

import java.awt.EventQueue;

import org.SignIn;
import org.BillDetails;
import org.TransectionResult;
import org.CardPayError;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class CardPay extends BillDetails{

	private JFrame frame;
	private JTextField txtEnterCardNumber;
	private JTextField txtCardHolderName;
	private JTextField txtMmyy;
	private JTextField txtCvccvv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardPay window = new CardPay();
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
	public CardPay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Residential Pay");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\Business__Fianance_3-21-512[1].png"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(278, 10, 134, 92);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\1.png"));
		label_1.setBounds(226, 166, 50, 31);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\2.png"));
		label_2.setBounds(379, 156, 50, 41);
		frame.getContentPane().add(label_2);
		
		txtEnterCardNumber = new JTextField();
		txtEnterCardNumber.setText("Enter Card Number");
		txtEnterCardNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterCardNumber.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtEnterCardNumber.setColumns(10);
		txtEnterCardNumber.setBounds(214, 208, 279, 41);
		frame.getContentPane().add(txtEnterCardNumber);
		
		txtCardHolderName = new JTextField();
		txtCardHolderName.setText("Card Holder Name");
		txtCardHolderName.setHorizontalAlignment(SwingConstants.CENTER);
		txtCardHolderName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtCardHolderName.setColumns(10);
		txtCardHolderName.setBounds(214, 338, 279, 41);
		frame.getContentPane().add(txtCardHolderName);
		
		txtMmyy = new JTextField();
		txtMmyy.setText("MM/YY");
		txtMmyy.setHorizontalAlignment(SwingConstants.CENTER);
		txtMmyy.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtMmyy.setColumns(10);
		txtMmyy.setBounds(214, 275, 104, 41);
		frame.getContentPane().add(txtMmyy);
		
		txtCvccvv = new JTextField();
		txtCvccvv.setText("CVC/CVV");
		txtCvccvv.setHorizontalAlignment(SwingConstants.CENTER);
		txtCvccvv.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		txtCvccvv.setColumns(10);
		txtCvccvv.setBounds(328, 275, 279, 41);
		frame.getContentPane().add(txtCvccvv);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton rdbtnVisa = new JRadioButton("VISA");
		rdbtnVisa.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnVisa.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		rdbtnVisa.setBounds(270, 166, 103, 23);
		bg.add(rdbtnVisa);
		frame.getContentPane().add(rdbtnVisa);
		
		JRadioButton rdbtnMastercard = new JRadioButton("Mastercard");
		rdbtnMastercard.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMastercard.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		rdbtnMastercard.setBounds(427, 166, 103, 23);
		bg.add(rdbtnMastercard);
		frame.getContentPane().add(rdbtnMastercard);
		
		JLabel lblCardPaymentSystem = new JLabel("Card Payment System");
		lblCardPaymentSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardPaymentSystem.setForeground(Color.RED);
		lblCardPaymentSystem.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		lblCardPaymentSystem.setBounds(206, 94, 312, 55);
		frame.getContentPane().add(lblCardPaymentSystem);
		
		JButton button = new JButton("Sign Out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn.main(null);
				frame.dispose();
			}
		});
		button.setForeground(new Color(255, 228, 196));
		button.setBackground(Color.RED);
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		button.setBounds(618, 10, 86, 31);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BillDetails.main(null);
				frame.dispose();
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\back.png"));
		button_1.setBounds(10, 10, 65, 31);
		frame.getContentPane().add(button_1);
		
		JButton btnPay = new JButton("Pay "+BillDetails.amount+" BDT");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileWriter fw=null;
		        File f = new File("C:\\Residential Pay\\src\\org\\database\\billDetails\\"+SignIn.userID+".txt");
				if(rdbtnVisa.isSelected() && !txtEnterCardNumber.getText().equals("Enter Card Number") && !txtCardHolderName.getText().equals("Card Holder Name")) {

					try{
                        fw = new FileWriter(f,true);
                        String st= "";
                        st= "Bill: "+BillDetails.bill+"\n";
                        fw.write(st);
                        st= "Payment Method: "+BillDetails.pMethod+": Visa"+"\n";
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
				else if(rdbtnMastercard.isSelected() && !txtEnterCardNumber.getText().equals("Enter Card Number") && !txtCardHolderName.getText().equals("Card Holder Name")) {
					try{
                        fw = new FileWriter(f,true);
                        String st= "";
                        st= "Bill: "+BillDetails.bill+"\n";
                        fw.write(st);
                        st= "Payment Method: "+BillDetails.pMethod+": Mastercard"+"\n";
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
					CardPayError.main(null);
				}
			}
		});
		btnPay.setForeground(Color.BLUE);
		btnPay.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnPay.setBackground(new Color(0, 206, 209));
		btnPay.setBounds(249, 408, 208, 41);
		frame.getContentPane().add(btnPay);
		frame.setResizable(false);
		frame.setBounds(450, 125, 718, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
