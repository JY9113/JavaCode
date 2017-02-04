package edu.java.gui13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain13 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain13 window = new GuiMain13();
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
	public GuiMain13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("New Frame");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyFrame myframe = new MyFrame();
				myframe.setVisible(true);
			}
		});
		btn1.setFont(new Font("굴림", Font.PLAIN, 48));
		btn1.setBounds(12, 32, 410, 65);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("New Dialog");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyDialog dialog = new MyDialog();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		btn2.setFont(new Font("굴림", Font.PLAIN, 48));
		btn2.setBounds(12, 107, 410, 65);
		frame.getContentPane().add(btn2);
	} // end initialize()
} // end class GuiMain











