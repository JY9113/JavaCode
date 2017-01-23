package edu.java.gui07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain07 {

	private JFrame frame;
	private JLabel lblOutput;
	private static final String[] PROBLEMS = {
			"1. AAA",
			"2. BBB",
			"3. CCC",
			"4. DDD",
			"5. EEE"
	};
	private int index;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain07 window = new GuiMain07();
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
	public GuiMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblOutput = new JLabel("New label");
		// JLabel의 텍스트를 배열의 첫번째 원소로 세팅
		lblOutput.setText(PROBLEMS[index]);
		lblOutput.setFont(new Font("굴림", Font.BOLD, 48));
		lblOutput.setBounds(12, 10, 495, 63);
		frame.getContentPane().add(lblOutput);
		
		JButton btnPrev = new JButton("이전");
		// btnPrev 버튼이 해야 할 기능을 등록
		btnPrev.addActionListener(new ActionListener() {
			@Override // 버튼이 해야 할 기능 구현
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 인덱스 0보다 크면
					index--;
					lblOutput.setText(PROBLEMS[index]);
				}
			}
		});
		btnPrev.setFont(new Font("굴림", Font.PLAIN, 48));
		btnPrev.setBounds(12, 83, 181, 63);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음");
		// btnNext 버튼이 해야 할 기능을 등록
		btnNext.addActionListener(new ActionListener() {
			@Override // 버튼이 해야 할 기능 구현
			public void actionPerformed(ActionEvent e) {
				if (index < PROBLEMS.length - 1) {
					// 현재 인덱스가 배열의 마지막 인덱스보다 작으면
					index++;
					lblOutput.setText(PROBLEMS[index]);
				}
			}
		});
		btnNext.setFont(new Font("굴림", Font.PLAIN, 48));
		btnNext.setBounds(326, 83, 181, 63);
		frame.getContentPane().add(btnNext);
	} // end initialize()
	
} // end class GuiMain07










