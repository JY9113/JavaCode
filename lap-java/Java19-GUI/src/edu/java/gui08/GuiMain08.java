package edu.java.gui08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain08 {

	private JFrame frame;
	private JLabel lblImage;
	// 이미지들이 저장된 위치(경로)를 문자열로 저장
	private static final String[] IMAGES = {
			"res/flower1.png",
			"res/flower2.png",
			"res/flower3.png",
			"res/flower4.png",
			"res/flower5.png"
	};
	private static final ImageIcon[] IMAGE_ICONS = {
			new ImageIcon("res/flower1.png"),
			new ImageIcon("res/flower2.png"),
			new ImageIcon("res/flower3.png"),
			new ImageIcon("res/flower4.png"),
			new ImageIcon("res/flower5.png")
	};
	// 현재 인덱스 저장
	private int index;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain08 window = new GuiMain08();
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
	public GuiMain08() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblImage = new JLabel();
//		lblImage.setIcon(new ImageIcon(IMAGES[index]));
		lblImage.setIcon(IMAGE_ICONS[index]);
		lblImage.setBounds(131, 10, 256, 256);
		frame.getContentPane().add(lblImage);
		
		JButton btnPrev = new JButton("이전");
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					index--;
//					lblImage.setIcon(new ImageIcon(IMAGES[index]));
					lblImage.setIcon(IMAGE_ICONS[index]);
				}
			}
		});
		btnPrev.setFont(new Font("굴림", Font.PLAIN, 28));
		btnPrev.setBounds(131, 286, 97, 50);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < IMAGES.length - 1) {
					index++;
//					lblImage.setIcon(new ImageIcon(IMAGES[index]));
					lblImage.setIcon(IMAGE_ICONS[index]);
				}
			}
		});
		btnNext.setFont(new Font("굴림", Font.PLAIN, 28));
		btnNext.setBounds(290, 286, 97, 50);
		frame.getContentPane().add(btnNext);
	} // end initialize()

} // end class GuiMain








