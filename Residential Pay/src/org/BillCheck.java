package org;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class BillCheck {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillCheck window = new BillCheck();
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
	public BillCheck() {
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
		frame.setTitle("Residential Pay");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPlsSelectA = new JLabel("Please Select A Bill & Fillup All The Boxes");
		lblPlsSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlsSelectA.setForeground(Color.ORANGE);
		lblPlsSelectA.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblPlsSelectA.setBounds(62, 10, 410, 38);
		frame.getContentPane().add(lblPlsSelectA);
	}

}
