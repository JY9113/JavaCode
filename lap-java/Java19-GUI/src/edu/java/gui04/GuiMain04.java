package edu.java.gui04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GuiMain04 {

	private JFrame frame;
	private JTextField textNumber1;
	private JTextField textNumber2;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain04 window = new GuiMain04();
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
	public GuiMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Number 1");
		lblNumber1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 48));
		lblNumber1.setBounds(12, 10, 280, 72);
		frame.getContentPane().add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Number 2");
		lblNumber2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 48));
		lblNumber2.setBounds(12, 92, 280, 72);
		frame.getContentPane().add(lblNumber2);
		
		textNumber1 = new JTextField();
		textNumber1.setFont(new Font("굴림", Font.PLAIN, 48));
		textNumber1.setBounds(307, 10, 361, 72);
		frame.getContentPane().add(textNumber1);
		textNumber1.setColumns(10);
		
		textNumber2 = new JTextField();
		textNumber2.setFont(new Font("굴림", Font.PLAIN, 48));
		textNumber2.setColumns(10);
		textNumber2.setBounds(307, 92, 361, 72);
		frame.getContentPane().add(textNumber2);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// JTextField에 입력된 문자열을 읽음
				String s1 = textNumber1.getText();
				String s2 = textNumber2.getText();
				
				// 문자열을 숫자(double)로 변환
				double x = Double.parseDouble(s1);
				double y = Double.parseDouble(s2);
				
				// 덧셈 결과
				String result = x + " + " + y + " = " + (x + y);
				textArea.setText(result);
			}
		});
		btnAdd.setFont(new Font("굴림", Font.BOLD, 48));
		btnAdd.setBounds(12, 174, 155, 72);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = textNumber1.getText();
				String s2 = textNumber2.getText();
				
				double x = Double.parseDouble(s1);
				double y = Double.parseDouble(s2);
				
				String result = x + " - " + y + " = " + (x - y);
				textArea.setText(result);
			}
		});
		btnSubtract.setFont(new Font("굴림", Font.BOLD, 48));
		btnSubtract.setBounds(179, 174, 155, 72);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("X");
		btnMultiply.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					// 엔터 키가 눌렸을 때
					double x = Double.parseDouble(textNumber1.getText());
					double y = Double.parseDouble(textNumber2.getText());
					String result = x + " X " + y + " = " + (x * y);
					textArea.setText(result);
				}
			}
		});
		btnMultiply.setFont(new Font("굴림", Font.BOLD, 48));
		btnMultiply.setBounds(346, 174, 155, 72);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					double x = Double.parseDouble(textNumber1.getText());
					double y = Double.parseDouble(textNumber2.getText());
					String result = x + " / " + y + " = " + (x / y);
					textArea.setText(result);
				}
			}
		});
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(textNumber1.getText());
				double y = Double.parseDouble(textNumber2.getText());
				String result = x + " / " + y + " = " + (x / y);
				textArea.setText(result);
			}
		});
		btnDivide.setFont(new Font("굴림", Font.BOLD, 48));
		btnDivide.setBounds(513, 174, 155, 72);
		frame.getContentPane().add(btnDivide);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 256, 656, 259);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 48));
		scrollPane.setViewportView(textArea);
	}

}
