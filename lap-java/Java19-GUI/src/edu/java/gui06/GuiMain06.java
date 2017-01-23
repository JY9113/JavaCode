package edu.java.gui06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain06 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rbtnMale;
	private JRadioButton rbtnFemale;
	private JTextArea textArea;
	private boolean isMale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain06 window = new GuiMain06();
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
	public GuiMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbtnMale = new JRadioButton("남자");
		rbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isMale = true;
			}
		});
		rbtnMale.setSelected(true);
		isMale = true;
		
		buttonGroup.add(rbtnMale);
		rbtnMale.setFont(new Font("굴림", Font.PLAIN, 48));
		rbtnMale.setBounds(8, 6, 172, 65);
		frame.getContentPane().add(rbtnMale);
		
		rbtnFemale = new JRadioButton("여자");
		rbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isMale = false;
			}
		});
		buttonGroup.add(rbtnFemale);
		rbtnFemale.setFont(new Font("굴림", Font.PLAIN, 48));
		rbtnFemale.setBounds(205, 6, 172, 65);
		frame.getContentPane().add(rbtnFemale);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if (rbtnMale.isSelected()) {
//					// "남자" 라디오버튼이 선택되어 있으면
//					textArea.setText("성별: 남자");
//				} else {
//					textArea.setText("성별: 여자");
//				}
				if (isMale) {
					textArea.setText("성별: 남자");
				} else {
					textArea.setText("성별: 여자");
				}
			}
		});
		btnCheck.setFont(new Font("굴림", Font.PLAIN, 48));
		btnCheck.setBounds(8, 77, 172, 54);
		frame.getContentPane().add(btnCheck);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 48));
		textArea.setBounds(8, 152, 654, 195);
		frame.getContentPane().add(textArea);
	}

}
