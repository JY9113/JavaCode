package edu.java.gui10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain10 implements ActionListener {

	private JFrame frame;
	private JLabel lblOutput;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;

	@Override
	public void actionPerformed(ActionEvent e) {
		lblOutput.setText("GuiMain10 메소드");
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain10 window = new GuiMain10();
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
	public GuiMain10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 770, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblOutput = new JLabel("New label");
		lblOutput.setFont(new Font("굴림", Font.BOLD, 48));
		lblOutput.setBounds(12, 10, 730, 60);
		frame.getContentPane().add(lblOutput);
		
		JButton btn1 = new JButton("버튼 1");
		// 익명 클래스를 사용한 이벤트 핸들러 등록
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOutput.setText("버튼 1 클릭");
			}
		});
		btn1.setFont(new Font("굴림", Font.PLAIN, 32));
		btn1.setBounds(12, 80, 143, 48);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("버튼 2");
		// 람다(Lambda) 표현식을 사용한 이벤트 핸들러 등록
		btn2.addActionListener((event) -> {
			lblOutput.setText("버튼 2 Clicked");
		});
		btn2.setFont(new Font("굴림", Font.PLAIN, 32));
		btn2.setBounds(183, 80, 143, 48);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("버튼 3");

		// MyListener 클래스의 인스턴스 생성
		ActionListener l = new MyListener(); // 다형성
		// btn3에 이벤트 핸들러 등록
		btn3.addActionListener(l);
		
		btn3.setFont(new Font("굴림", Font.PLAIN, 32));
		btn3.setBounds(12, 138, 143, 48);
		frame.getContentPane().add(btn3);
		
		btn4 = new JButton("버튼 4");

		// btn4에 위에서 생성한 ActionListener 객체를 등록
		btn4.addActionListener(l);
		
		btn4.setFont(new Font("굴림", Font.PLAIN, 32));
		btn4.setBounds(183, 138, 143, 48);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("버튼 5");
		btn5.addActionListener(this);
		btn5.setFont(new Font("굴림", Font.PLAIN, 32));
		btn5.setBounds(12, 196, 143, 48);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("버튼 6");
		btn6.addActionListener(this);
		btn6.setFont(new Font("굴림", Font.PLAIN, 32));
		btn6.setBounds(183, 196, 143, 48);
		frame.getContentPane().add(btn6);
	} // end initailize()

	// ActionListener 인터페이스를 구현하는 내부 클래스 정의
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// actionPerformed()의 매개변수 e를 통해서 
			// 어떤 객체가 클릭된 것인 지 찾을 수 있음.
			Object src = e.getSource();
			if (src instanceof JButton) {
				// 이벤트의 소스가 JButton 타입이면
				if ((JButton) src == btn3) {
					lblOutput.setText("btn3: MyListener 객체");
				} else if ((JButton) src == btn4) {
					lblOutput.setText("btn4: MyListener 객체");
				}
			}
			
		} // end actionPerformed()
		
	} // end class MyListener
	
} // end GuiMain10





















