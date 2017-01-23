package edu.java.gui02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiMain02 {

	// 멤버 변수
	private JFrame frame;
	private JLabel lblOutput;
	private JTextField textInput;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain02 window = new GuiMain02();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	/**
	 * Create the application.
	 */
	public GuiMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 854, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblOutput = new JLabel("안녕하세요...");
		lblOutput.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 48));
		lblOutput.setBounds(12, 10, 814, 100);
		frame.getContentPane().add(lblOutput);
		
		textInput = new JTextField();
		textInput.setFont(new Font("굴림", Font.PLAIN, 48));
		textInput.setBounds(12, 120, 814, 100);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		JButton btnInput = new JButton("입력");
		btnInput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 버튼을 클릭했을 때 해야 할 기능 구현
				// JTextField에 입력된 내용을 읽어서 JLabel에 씀
				String msg = textInput.getText();
				lblOutput.setText(msg);
			}
		});
		btnInput.setFont(new Font("굴림", Font.PLAIN, 48));
		btnInput.setBounds(12, 230, 814, 100);
		frame.getContentPane().add(btnInput);
	} // end initialize()
} // end class GuiMain02












