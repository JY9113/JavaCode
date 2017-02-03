package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.JLabel;

class ExistPersonPanel extends JPanel {
	
	public JButton bestWine1, bestWine2, bestWine3;
	public JTextArea wineNameArea, winePicArea, wineAlcoholArea, wineRegionArea, wineGrapeArea;
	public JComboBox wineTypeArea, wineBodyArea, wineSugarArea;

	public ExistPersonPanel() {
		setLayout(null);
		setBackground(Color.PINK);
		setBounds(0, 70, 695, 375);
		
				
		bestWine1 = new JButton("1");
		bestWine1.setBounds(30, 50, 60, 60);
		add(bestWine1);
		
		bestWine2 = new JButton("2");
		bestWine2.setBounds(30, 155, 60, 60);
		add(bestWine2);
		
		bestWine3 = new JButton("3");
		bestWine3.setBounds(30, 260, 60, 60);
		add(bestWine3);
		
		winePicArea = new JTextArea();
		winePicArea.setBounds(117, 69, 157, 214);
		add(winePicArea);
		winePicArea.setText("IMAGE");
		
		wineNameArea = new JTextArea();
		wineNameArea.setBounds(282, 67, 401, 33);
		add(wineNameArea);
		wineNameArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		
		JLabel suggestMsg = new JLabel("추천하는 와인");
		suggestMsg.setBounds(278, 22, 209, 35);
		add(suggestMsg);
		suggestMsg.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		wineTypeArea = new JComboBox(type);
		wineTypeArea.setBounds(282, 110, 401, 33);
		add(wineTypeArea);
		wineTypeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		
		wineGrapeArea = new JTextArea();
		wineGrapeArea.setBounds(282, 155, 401, 33);
		add(wineGrapeArea);
		wineGrapeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		
		wineRegionArea = new JTextArea();
		wineRegionArea.setBounds(282, 202, 401, 33);
		add(wineRegionArea);
		wineRegionArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		
		JLabel lblalcohol = new JLabel("도수");
		lblalcohol.setBounds(433, 250, 31, 35);
		add(lblalcohol);
		lblalcohol.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		
		JLabel lblsugar = new JLabel("당도");
		lblsugar.setBounds(291, 250, 31, 35);
		add(lblsugar);
		lblsugar.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		
		JLabel lblbody = new JLabel("바디");
		lblbody.setBounds(542, 250, 31, 35);
		add(lblbody);
		lblbody.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 20));
		
		wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setBounds(469, 250, 51, 33);
		add(wineAlcoholArea);
		wineAlcoholArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		wineSugarArea = new JComboBox(sugarContent);
		wineSugarArea.setBounds(324, 250, 96, 33);
		add(wineSugarArea);
		wineSugarArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		wineBodyArea = new JComboBox(body);
		wineBodyArea.setBounds(590, 250, 76, 33);
		add(wineBodyArea);
		wineBodyArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		
		
	}
}
