package edu.java.gui09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class GuiMain09 {

	private JFrame frame;
	private JCheckBox chMusic;
	private JCheckBox chMovie;
	private JCheckBox chReading;
	private JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain09 window = new GuiMain09();
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
	public GuiMain09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 679, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		chMusic = new JCheckBox("음악");
		chMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printSelected();
			}
		});
		chMusic.setFont(new Font("굴림", Font.PLAIN, 32));
		chMusic.setBounds(8, 6, 105, 81);
		frame.getContentPane().add(chMusic);
		
		chMovie = new JCheckBox("영화");
		chMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printSelected();
			}
		});
		chMovie.setFont(new Font("굴림", Font.PLAIN, 32));
		chMovie.setBounds(132, 6, 105, 81);
		frame.getContentPane().add(chMovie);
		
		chReading = new JCheckBox("독서");
		chReading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printSelected();
			}
		});
		chReading.setFont(new Font("굴림", Font.PLAIN, 32));
		chReading.setBounds(255, 6, 105, 81);
		frame.getContentPane().add(chReading);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 32));
		textArea.setBounds(8, 92, 643, 282);
		frame.getContentPane().add(textArea);
	} // end initialize()

	private void printSelected() {
		String result =
				"음악: " + chMusic.isSelected() + "\n"
				+ "영화: " + chMovie.isSelected() + "\n"
				+ "독서: " + chReading.isSelected();
		textArea.setText(result);
	}
	
} // end class GuiMain09








