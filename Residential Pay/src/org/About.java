package org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class About {

	private JFrame frmAbout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
					window.frmAbout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAbout = new JFrame();
		frmAbout.getContentPane().setBackground(Color.ORANGE);
		frmAbout.setResizable(false);
		frmAbout.setBounds(570, 350, 481, 130);
		frmAbout.setTitle("About");
		frmAbout.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Residential Pay\\src\\org\\icon.png"));
		frmAbout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAbout.getContentPane().setLayout(null);
		
		JTextArea txtrFhhfh = new JTextArea();
		txtrFhhfh.setForeground(Color.BLUE);
		txtrFhhfh.setEditable(false);
		txtrFhhfh.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		txtrFhhfh.setBackground(Color.ORANGE);
		txtrFhhfh.setText(" This Is An App Where Almost All Payments Of A Resident \n Can Be Payed Through Mobile Banking Or Cards.This Is \n A GUI Based Java Project & Database On Java File System");
		txtrFhhfh.setBounds(10, 10, 468, 93);
		frmAbout.getContentPane().add(txtrFhhfh);
	}
}
