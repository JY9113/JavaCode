package edu.java.gui05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain05 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain05 window = new GuiMain05();
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
	public GuiMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rbtn2 = new JRadioButton("동의");
		rbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("동의");
			}
		});
		// 라디오 버튼을 선택된 상태로 보임
		rbtn2.setSelected(true);
		buttonGroup.add(rbtn2);
		rbtn2.setFont(new Font("굴림", Font.PLAIN, 48));
		rbtn2.setBounds(8, 60, 153, 84);
		frame.getContentPane().add(rbtn2);
		
		JRadioButton rbtn1 = new JRadioButton("거부");
		rbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("거부");
			}
		});
		buttonGroup.add(rbtn1);
		rbtn1.setFont(new Font("굴림", Font.PLAIN, 48));
		rbtn1.setBounds(177, 60, 153, 84);
		frame.getContentPane().add(rbtn1);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 48));
		textArea.setBounds(8, 150, 630, 257);
		frame.getContentPane().add(textArea);
	}
}
