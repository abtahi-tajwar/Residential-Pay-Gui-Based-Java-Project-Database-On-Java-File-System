package org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MobilePaymentCheck {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MobilePaymentCheck window = new MobilePaymentCheck();
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
	public MobilePaymentCheck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 0, 0));
		frame.setResizable(false);
		frame.setBounds(510, 290, 537, 104);
		frame.setTitle("Residential Pay");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseSelectA = new JLabel("Please Select A Mobile Banking");
		lblPleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectA.setForeground(Color.YELLOW);
		lblPleaseSelectA.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblPleaseSelectA.setBounds(109, 0, 305, 37);
		frame.getContentPane().add(lblPleaseSelectA);
		
		JLabel lblFillupAll = new JLabel("& Fillup All The Boxes");
		lblFillupAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblFillupAll.setForeground(Color.YELLOW);
		lblFillupAll.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblFillupAll.setBounds(119, 29, 305, 37);
		frame.getContentPane().add(lblFillupAll);
	}

}
