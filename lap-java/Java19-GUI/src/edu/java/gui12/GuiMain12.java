package edu.java.gui12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Panel;

public class GuiMain12 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain12 window = new GuiMain12();
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
	public GuiMain12() {
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel1, null);
		panel1.setLayout(null);
		
		Label label = new Label("Panel 1");
		label.setFont(new Font("Dialog", Font.PLAIN, 17));
		label.setBounds(0, 0, 429, 55);
		panel1.add(label);
		
		Panel panel2 = new Panel();
		tabbedPane.addTab("New tab", null, panel2, null);
		panel2.setLayout(null);
		
		Label label_1 = new Label("Panel 2");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(0, 177, 429, 55);
		panel2.add(label_1);
	}
}
