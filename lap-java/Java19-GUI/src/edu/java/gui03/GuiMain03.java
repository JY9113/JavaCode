package edu.java.gui03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JScrollPane;

public class GuiMain03 {

	private JFrame frame;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextArea textArea;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain03 window = new GuiMain03();
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
	public GuiMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 925, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("이름");
		lblName.setOpaque(true);
		lblName.setBackground(Color.PINK);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.BOLD, 48));
		lblName.setBounds(12, 10, 245, 76);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setOpaque(true);
		lblPhone.setBackground(Color.ORANGE);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("굴림", Font.BOLD, 48));
		lblPhone.setBounds(12, 96, 245, 76);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setBackground(Color.CYAN);
		lblEmail.setOpaque(true);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("굴림", Font.BOLD, 48));
		lblEmail.setBounds(12, 182, 245, 76);
		frame.getContentPane().add(lblEmail);
		
		textName = new JTextField();
		textName.setFont(new Font("굴림", Font.PLAIN, 48));
		textName.setBounds(269, 10, 628, 76);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("굴림", Font.PLAIN, 48));
		textPhone.setColumns(10);
		textPhone.setBounds(269, 96, 628, 76);
		frame.getContentPane().add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("굴림", Font.PLAIN, 48));
		textEmail.setColumns(10);
		textEmail.setBounds(269, 182, 628, 76);
		frame.getContentPane().add(textEmail);
		
		JButton btnInsert = new JButton("입력");
		btnInsert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 마우스 클릭했을 때 동작할 기능 구현
				String name = textName.getText();
				String phone = textPhone.getText();
				String email = textEmail.getText();
				String result = "이름: " + name + "\n"
						+ "전화번호: " + phone + "\n"
						+ "이메일: " + email;
				textArea.setText(result);
				textArea_1.setText(result);
			}
		});
		btnInsert.setFont(new Font("굴림", Font.PLAIN, 48));
		btnInsert.setBounds(12, 268, 245, 76);
		frame.getContentPane().add(btnInsert);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 48));
		textArea.setBounds(12, 354, 885, 76);
		frame.getContentPane().add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 440, 885, 91);
		frame.getContentPane().add(scrollPane);
		
		textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 48));
		scrollPane.setViewportView(textArea_1);
	} // end initialize()
} // end class GuiMain03














