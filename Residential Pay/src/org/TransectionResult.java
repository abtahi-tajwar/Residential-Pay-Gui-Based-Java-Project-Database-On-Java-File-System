package org;

import java.awt.EventQueue;

import org.SignIn;
import org.BillDetails;
import org.About;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class TransectionResult extends BillDetails{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransectionResult window = new TransectionResult();
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
	public TransectionResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 102, 204));
		frame.setResizable(false);
		frame.setBounds(450, 125, 718, 533);
		frame.setTitle("Residential Pay");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Transection Successful");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(182, 108, 270, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\1200px-SNice.svg[1].png"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(276, 10, 116, 94);
		frame.getContentPane().add(label);
		
		JLabel lblName = new JLabel("User ID: "+BillDetails.userID);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(new Color(255, 255, 102));
		lblName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblName.setBounds(227, 153, 295, 55);
		frame.getContentPane().add(lblName);
		
		JLabel lblBillTypeOf = new JLabel("Bill Type: "+BillDetails.bill+", Of Month:" +BillDetails.bP);
		lblBillTypeOf.setHorizontalAlignment(SwingConstants.LEFT);
		lblBillTypeOf.setForeground(new Color(0, 255, 51));
		lblBillTypeOf.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblBillTypeOf.setBounds(227, 199, 334, 55);
		frame.getContentPane().add(lblBillTypeOf);
		
		JLabel lblPaidTk = new JLabel("Paid TK: "+BillDetails.amount+", Through "+BillDetails.pMethod);
		lblPaidTk.setBackground(Color.WHITE);
		lblPaidTk.setHorizontalAlignment(SwingConstants.LEFT);
		lblPaidTk.setForeground(Color.WHITE);
		lblPaidTk.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblPaidTk.setBounds(227, 251, 334, 55);
		frame.getContentPane().add(lblPaidTk);
		
		JLabel lbljisunAurnob = new JLabel("©Jisun Aurnob");
		lbljisunAurnob.setHorizontalAlignment(SwingConstants.CENTER);
		lbljisunAurnob.setForeground(Color.ORANGE);
		lbljisunAurnob.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lbljisunAurnob.setBounds(144, 452, 334, 43);
		frame.getContentPane().add(lbljisunAurnob);
		
		JButton btnNewButton = new JButton("About This App");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setIcon(new ImageIcon("C:\\Residential Pay\\src\\org\\222.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About.main(null);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(227, 347, 199, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Sign Out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn.main(null);
				frame.dispose();
			}
		});
		button.setForeground(new Color(255, 228, 196));
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		button.setBackground(Color.RED);
		button.setBounds(618, 10, 86, 31);
		frame.getContentPane().add(button);
		
		JButton btnHome = new JButton("Home Page");
		btnHome.setForeground(Color.DARK_GRAY);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BillDetails.main(null);
				frame.dispose();
			}
		});
		btnHome.setBounds(10, 15, 101, 31);
		frame.getContentPane().add(btnHome);
	}

}
