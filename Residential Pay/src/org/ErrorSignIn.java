package org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class ErrorSignIn {

	private JFrame frmResidentialPay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorSignIn window = new ErrorSignIn();
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
	public ErrorSignIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResidentialPay = new JFrame();
		frmResidentialPay.setTitle("Residential Pay");
		frmResidentialPay.getContentPane().setBackground(Color.RED);
		frmResidentialPay.getContentPane().setForeground(Color.RED);
		frmResidentialPay.setResizable(false);
		frmResidentialPay.setBounds(510, 290, 537, 104);
		frmResidentialPay.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frmResidentialPay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmResidentialPay.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User ID Or Password Wrong");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(76, 10, 364, 42);
		frmResidentialPay.getContentPane().add(lblNewLabel);
	}

}
