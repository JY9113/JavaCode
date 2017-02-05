package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

class BestPanel extends JPanel {
	
	public JButton bestWine1, bestWine2, bestWine3;
	public JTextArea wineNameArea, wineAlcoholArea, wineRegionArea, wineGrapeArea, wineTypeArea, wineBodyArea, wineSugarArea;
	public BufferedImage bi;
	public JPanel winePicArea;

	public BestPanel() {
		setLayout(null);
		setBackground(new Color(128, 0, 0));
		setBounds(0, 70, 695, 375);
		
				
		bestWine1 = new JButton();
		bestWine1.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/one.png")));
		bestWine1.setBorderPainted(false);
		bestWine1.setContentAreaFilled(false);
		bestWine1.setFocusPainted(false);
		bestWine1.setBounds(30, 50, 60, 60);
		add(bestWine1);
		
		bestWine2 = new JButton();
		bestWine2.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/two.png")));
		bestWine2.setBorderPainted(false);
		bestWine2.setContentAreaFilled(false);
		bestWine2.setFocusPainted(false);
		bestWine2.setBounds(30, 155, 60, 60);
		add(bestWine2);
		
		bestWine3 = new JButton();
		bestWine3.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/three.png")));
		bestWine3.setBorderPainted(false);
		bestWine3.setContentAreaFilled(false);
		bestWine3.setFocusPainted(false);
		bestWine3.setBounds(30, 260, 60, 60);
		add(bestWine3);
		
		winePicArea = new JPanel(){
			@Override
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				g2d.drawImage(bi, null, 0, 0);
			}
		};
		winePicArea.setBorder(new LineBorder(new Color(255, 255, 255)));
		winePicArea.setBackground(new Color(128, 0, 0));
		
		winePicArea.setBounds(110, 68, 150, 215);
		add(winePicArea);
		
		wineNameArea = new JTextArea();
		wineNameArea.setForeground(new Color(255, 255, 255));
		wineNameArea.setBackground(new Color(128, 0, 0));
		wineNameArea.setBounds(274, 79, 401, 43);
		add(wineNameArea);
		wineNameArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		
		JLabel suggestMsg = new JLabel("추천하는 와인");
		suggestMsg.setForeground(new Color(255, 255, 255));
		suggestMsg.setBounds(278, 22, 209, 35);
		add(suggestMsg);
		suggestMsg.setFont(new Font("1훈막대연필 R", Font.BOLD, 25));
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		wineTypeArea = new JTextArea();
		wineTypeArea.setBackground(new Color(128, 0, 0));
		wineTypeArea.setForeground(new Color(255, 255, 255));
		wineTypeArea.setBounds(274, 122, 401, 43);
		add(wineTypeArea);
		wineTypeArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		
		wineGrapeArea = new JTextArea();
		wineGrapeArea.setForeground(new Color(255, 255, 255));
		wineGrapeArea.setBackground(new Color(128, 0, 0));
		wineGrapeArea.setBounds(274, 167, 401, 43);
		add(wineGrapeArea);
		wineGrapeArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		
		wineRegionArea = new JTextArea();
		wineRegionArea.setForeground(new Color(255, 255, 255));
		wineRegionArea.setBackground(new Color(128, 0, 0));
		wineRegionArea.setBounds(274, 214, 401, 43);
		add(wineRegionArea);
		wineRegionArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		
		JLabel lblalcohol = new JLabel("도수");
		lblalcohol.setForeground(new Color(255, 255, 255));
		lblalcohol.setBounds(431, 259, 42, 35);
		add(lblalcohol);
		lblalcohol.setFont(new Font("1훈막대연필 R", Font.BOLD, 20));
		
		JLabel lblsugar = new JLabel("당도");
		lblsugar.setForeground(new Color(255, 255, 255));
		lblsugar.setBounds(274, 259, 37, 35);
		add(lblsugar);
		lblsugar.setFont(new Font("1훈막대연필 R", Font.BOLD, 20));
		
		JLabel lblbody = new JLabel("바디");
		lblbody.setForeground(new Color(255, 255, 255));
		lblbody.setBounds(519, 259, 42, 35);
		add(lblbody);
		lblbody.setFont(new Font("1훈막대연필 R", Font.BOLD, 20));
		
		wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setBackground(new Color(128, 0, 0));
		wineAlcoholArea.setForeground(new Color(255, 255, 255));
		wineAlcoholArea.setBounds(469, 261, 42, 33);
		add(wineAlcoholArea);
		wineAlcoholArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		wineSugarArea = new JTextArea();
		wineSugarArea.setBackground(new Color(128, 0, 0));
		wineSugarArea.setForeground(new Color(255, 255, 255));
		wineSugarArea.setBounds(314, 261, 120, 33);
		add(wineSugarArea);
		wineSugarArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		wineBodyArea = new JTextArea();
		wineBodyArea.setBackground(new Color(128, 0, 0));
		wineBodyArea.setForeground(new Color(255, 255, 255));
		wineBodyArea.setBounds(559, 261, 136, 33);
		add(wineBodyArea);
		wineBodyArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		
		
	}
}
