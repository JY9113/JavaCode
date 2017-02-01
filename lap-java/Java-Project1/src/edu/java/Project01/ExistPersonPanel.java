package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.JLabel;

class ExistPersonPanel extends JPanel {
	
	private JButton bestWine1, bestWine2, bestWine3;
	private JPanel resultPanel;
	private JTextArea suggestedWinePic, suggestedWineName, suggestedWineType, 
		     suggestedWineGrape, suggestedWineRegion, suggestedAlcohol, suggestedSugar, suggestedBody;


	public ExistPersonPanel() {
		setLayout(null);
		setBackground(Color.BLUE);
		setBounds(0, 70, 695, 375);
		
				
		bestWine1 = new JButton("1");
		bestWine1.setBounds(30, 50, 60, 60);
		add(bestWine1);
		
		bestWine2 = new JButton("2");
		bestWine2.setBounds(30, 160, 60, 60);
		add(bestWine2);
		
		bestWine3 = new JButton("3");
		bestWine3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bestWine3.setBounds(30, 260, 60, 60);
		add(bestWine3);
		
		resultPanel = new JPanel();
		resultPanel.setBounds(120, 0, 572, 375);
		add(resultPanel);
		resultPanel.setLayout(null);
		
		suggestedWinePic = new JTextArea();
		suggestedWinePic.setBounds(10, 70, 157, 223);
		suggestedWinePic.setText("IMAGE");
		resultPanel.add(suggestedWinePic);
		
		suggestedWineName = new JTextArea();
		suggestedWineName.setText(" San Pedro 1865 Single Vineyard Cabernet Sauvignon");
		suggestedWineName.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedWineName.setBounds(171, 70, 401, 33);
		resultPanel.add(suggestedWineName);
		
		JLabel suggestMsg = new JLabel("추천하는 와인");
		suggestMsg.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		suggestMsg.setBounds(228, 10, 118, 35);
		resultPanel.add(suggestMsg);
		
		suggestedWineType = new JTextArea();
		suggestedWineType.setText("Sparkling Wine");
		suggestedWineType.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedWineType.setBounds(171, 113, 401, 33);
		resultPanel.add(suggestedWineType);
		
		 suggestedWineGrape = new JTextArea();
		suggestedWineGrape.setText("Cabernet Sauvignon");
		suggestedWineGrape.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedWineGrape.setBounds(171, 157, 401, 33);
		resultPanel.add(suggestedWineGrape);
		
		suggestedWineRegion = new JTextArea();
		suggestedWineRegion.setText("New Zealand");
		suggestedWineRegion.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedWineRegion.setBounds(171, 200, 401, 33);
		resultPanel.add(suggestedWineRegion);
		
		JLabel alcohol = new JLabel("도수");
		alcohol.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		alcohol.setBounds(180, 245, 31, 35);
		resultPanel.add(alcohol);
		
		JLabel sugar = new JLabel("당도");
		sugar.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		sugar.setBounds(270, 243, 31, 35);
		resultPanel.add(sugar);
		
		JLabel body = new JLabel("바디");
		body.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		body.setBounds(421, 243, 31, 35);
		resultPanel.add(body);
		
		suggestedAlcohol = new JTextArea();
		suggestedAlcohol.setText("12.5");
		suggestedAlcohol.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedAlcohol.setBounds(210, 243, 51, 33);
		resultPanel.add(suggestedAlcohol);
		
		suggestedSugar = new JTextArea();
		suggestedSugar.setText("Very Sweet");
		suggestedSugar.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedSugar.setBounds(313, 243, 96, 33);
		resultPanel.add(suggestedSugar);
		
		suggestedBody = new JTextArea();
		suggestedBody.setText("Medium");
		suggestedBody.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		suggestedBody.setBounds(464, 243, 76, 33);
		resultPanel.add(suggestedBody);
		
		
	}
}
