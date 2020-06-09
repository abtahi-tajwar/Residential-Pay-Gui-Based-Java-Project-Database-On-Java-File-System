package org;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;

public class CardPayError {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardPayError window = new CardPayError();
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
	public CardPayError() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setResizable(false);
		frame.setBounds(510, 290, 537, 104);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frame.setTitle("Residential Pay");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseSelectA = new JLabel("Please Select A Card &");
		lblPleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectA.setForeground(Color.YELLOW);
		lblPleaseSelectA.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblPleaseSelectA.setBounds(109, 0, 305, 37);
		frame.getContentPane().add(lblPleaseSelectA);
		
		JLabel lblFillupAll = new JLabel("Fillup All The Boxes");
		lblFillupAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblFillupAll.setForeground(Color.YELLOW);
		lblFillupAll.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblFillupAll.setBounds(98, 29, 305, 37);
		frame.getContentPane().add(lblFillupAll);
	}

}
