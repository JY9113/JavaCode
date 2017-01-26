package edu.java.testPackage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;

public class existPersonPanel {

	private JFrame frame;
	private JPanel existPersonPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					existPersonPanel window = new existPersonPanel();
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
	public existPersonPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(700, 200, 710, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		existPersonPanel = new JPanel();
		existPersonPanel.setBackground(Color.PINK);
		existPersonPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(existPersonPanel);
		existPersonPanel.setLayout(null);
		
		JButton bestWine1 = new JButton("1");
		bestWine1.setBounds(30, 50, 60, 60);
		existPersonPanel.add(bestWine1);
		
		JButton bestWine2 = new JButton("2");
		bestWine2.setBounds(30, 160, 60, 60);
		existPersonPanel.add(bestWine2);
		
		JButton bestWine3 = new JButton("3");
		bestWine3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bestWine3.setBounds(30, 260, 60, 60);
		existPersonPanel.add(bestWine3);
		
		JPanel panel = new JPanel();
		panel.setBounds(120, 0, 572, 375);
		existPersonPanel.add(panel);
		panel.setLayout(null);
		
		JTextArea suggestedWinePic = new JTextArea();
		suggestedWinePic.setBounds(10, 70, 157, 223);
		suggestedWinePic.setText("IMAGE");
		panel.add(suggestedWinePic);
		
		JTextArea suggestedWineName = new JTextArea();
		suggestedWineName.setText(" San Pedro 1865 Single Vineyard Cabernet Sauvignon");
		suggestedWineName.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedWineName.setBounds(171, 70, 401, 33);
		panel.add(suggestedWineName);
		
		JLabel suggestMsg = new JLabel("추천하는 와인");
		suggestMsg.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		suggestMsg.setBounds(228, 10, 118, 35);
		panel.add(suggestMsg);
		
		JTextArea suggestedWineType = new JTextArea();
		suggestedWineType.setText("Sparkling Wine");
		suggestedWineType.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedWineType.setBounds(171, 113, 401, 33);
		panel.add(suggestedWineType);
		
		JTextArea suggestedWineGrape = new JTextArea();
		suggestedWineGrape.setText("Cabernet Sauvignon");
		suggestedWineGrape.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedWineGrape.setBounds(171, 157, 401, 33);
		panel.add(suggestedWineGrape);
		
		JTextArea suggestedWineRegion = new JTextArea();
		suggestedWineRegion.setText("New Zealand");
		suggestedWineRegion.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedWineRegion.setBounds(171, 200, 401, 33);
		panel.add(suggestedWineRegion);
		
		JLabel label_1 = new JLabel("도수");
		label_1.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		label_1.setBounds(180, 245, 31, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("당도");
		label_2.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		label_2.setBounds(270, 243, 31, 35);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("바디");
		label_3.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		label_3.setBounds(421, 243, 31, 35);
		panel.add(label_3);
		
		JTextArea suggestedAlcohol = new JTextArea();
		suggestedAlcohol.setText("12.5");
		suggestedAlcohol.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedAlcohol.setBounds(210, 243, 51, 33);
		panel.add(suggestedAlcohol);
		
		JTextArea suggestedSugar = new JTextArea();
		suggestedSugar.setText("Very Sweet");
		suggestedSugar.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedSugar.setBounds(313, 243, 96, 33);
		panel.add(suggestedSugar);
		
		JTextArea suggestedBody = new JTextArea();
		suggestedBody.setText("Medium");
		suggestedBody.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedBody.setBounds(464, 243, 76, 33);
		panel.add(suggestedBody);
		
		
	}
}
