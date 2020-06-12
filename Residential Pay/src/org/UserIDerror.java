package org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

public class UserIDerror {

	private JFrame frmResidentialPay;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserIDerror window = new UserIDerror();
					window.frmResidentialPay.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserIDerror() {
		initialize();
	}

	private void initialize() {
		frmResidentialPay = new JFrame();
		frmResidentialPay.setTitle("Residential Pay");
		frmResidentialPay.getContentPane().setBackground(Color.RED);
		frmResidentialPay.setResizable(false);
		frmResidentialPay.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frmResidentialPay.setBounds(510, 290, 537, 91);
		frmResidentialPay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmResidentialPay.getContentPane().setLayout(null);
		
		JLabel lblUserIdAlready = new JLabel("User ID Already Existed Give Different User ID!");
		lblUserIdAlready.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserIdAlready.setForeground(Color.ORANGE);
		lblUserIdAlready.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblUserIdAlready.setBounds(71, 10, 410, 38);
		frmResidentialPay.getContentPane().add(lblUserIdAlready);
	}

}
