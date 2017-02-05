package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class SearchPanel extends JPanel {

	private ProjectDAO dao;

	public JTextField nameSearchArea;
	public JTextArea wineNameArea, wineAlcoholArea, wineRegionArea, wineGrapeArea, wineTypeArea, wineBodyArea, wineSugarArea;
	public JPanel winePicArea;
	public JButton searchBtn, updateBtn, imgBtn, drawBtn;
	public BufferedImage bi;

	public SearchPanel() {
		dao = ProjectDAOImple.getInstance();
		setLayout(null);
		setBackground(new Color(128, 0, 0));
		setBounds(0, 70, 695, 375);

		
		nameSearchArea = new JTextField();
		nameSearchArea.setForeground(new Color(255, 255, 255));
		nameSearchArea.setBackground(new Color(128, 0, 0));
		nameSearchArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		nameSearchArea.setBounds(98, 10, 375, 34);
		add(nameSearchArea);
		nameSearchArea.setColumns(10);
		
		searchBtn = new JButton();
		searchBtn.setBorderPainted(false);
		searchBtn.setContentAreaFilled(false);
		searchBtn.setFocusPainted(false);
		searchBtn.setIcon(new ImageIcon(SearchPanel.class.getResource("/images/enter.png")));
		searchBtn.setBounds(503, 10, 80, 40);
		add(searchBtn);
		
		winePicArea = new JPanel(){
			@Override
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				g2d.drawImage(bi, null, 0, 0);
			}
		};
		winePicArea.setBackground(new Color(128, 0, 0));
		
		winePicArea.setBounds(98, 110, 150, 215);
		add(winePicArea);
		
		wineNameArea = new JTextArea();
		wineNameArea.setBackground(new Color(128, 0, 0));
		wineNameArea.setForeground(new Color(255, 255, 255));
		wineNameArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 25));
		wineNameArea.setBounds(100, 66, 494, 34);
		add(wineNameArea);
		
			
		JLabel lblWineGrape = new JLabel("품종");
		lblWineGrape.setForeground(new Color(255, 255, 255));
		lblWineGrape.setFont(new Font("1훈막대연필 R", Font.PLAIN, 25));
		lblWineGrape.setBounds(335, 159, 64, 25);
		add(lblWineGrape);
		
		wineGrapeArea = new JTextArea();
		wineGrapeArea.setBackground(new Color(128, 0, 0));
		wineGrapeArea.setForeground(new Color(255, 255, 255));
		wineGrapeArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		wineGrapeArea.setBounds(411, 159, 178, 25);
		add(wineGrapeArea);
		
		JLabel lblWineRegion = new JLabel("지역");
		lblWineRegion.setForeground(new Color(255, 255, 255));
		lblWineRegion.setFont(new Font("1훈막대연필 R", Font.PLAIN, 25));
		lblWineRegion.setBounds(335, 194, 64, 25);
		add(lblWineRegion);
		
		wineRegionArea = new JTextArea();
		wineRegionArea.setBackground(new Color(128, 0, 0));
		wineRegionArea.setForeground(new Color(255, 255, 255));
		wineRegionArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		wineRegionArea.setBounds(411, 194, 178, 25);
		add(wineRegionArea);
		
			
		JLabel lblWineAlcohol = new JLabel("도수");
		lblWineAlcohol.setForeground(new Color(255, 255, 255));
		lblWineAlcohol.setFont(new Font("1훈막대연필 R", Font.PLAIN, 25));
		lblWineAlcohol.setBounds(335, 264, 64, 25);
		add(lblWineAlcohol);
		
		wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setBackground(new Color(128, 0, 0));
		wineAlcoholArea.setForeground(new Color(255, 255, 255));
		wineAlcoholArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		wineAlcoholArea.setBounds(411, 264, 72, 25);
		add(wineAlcoholArea);
		
		JLabel lblWineBody = new JLabel("바디감");
		lblWineBody.setForeground(new Color(255, 255, 255));
		lblWineBody.setFont(new Font("1훈막대연필 R", Font.PLAIN, 25));
		lblWineBody.setBounds(335, 299, 64, 25);
		add(lblWineBody);
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		wineBodyArea = new JTextArea();
		wineBodyArea.setBackground(new Color(128, 0, 0));
		wineBodyArea.setForeground(new Color(255, 255, 255));
		wineBodyArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineBodyArea.setBounds(411, 299, 178, 25);
		add(wineBodyArea);
		
		JLabel lblWineType = new JLabel("타입");
		lblWineType.setForeground(new Color(255, 255, 255));
		lblWineType.setFont(new Font("1훈막대연필 R", Font.PLAIN, 25));
		lblWineType.setBounds(335, 124, 64, 25);
		add(lblWineType);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		wineTypeArea = new JTextArea();
		wineTypeArea.setBackground(new Color(128, 0, 0));
		wineTypeArea.setForeground(new Color(255, 255, 255));
		wineTypeArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineTypeArea.setBounds(411, 124, 178, 25);
		add(wineTypeArea);
		
		JLabel lblWineSugar = new JLabel("당도");
		lblWineSugar.setForeground(new Color(255, 255, 255));
		lblWineSugar.setFont(new Font("1훈막대연필 R", Font.PLAIN, 25));
		lblWineSugar.setBounds(335, 229, 64, 25);
		add(lblWineSugar);
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		wineSugarArea = new JTextArea();
		wineSugarArea.setBackground(new Color(128, 0, 0));
		wineSugarArea.setForeground(new Color(255, 255, 255));
		wineSugarArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineSugarArea.setBounds(411, 229, 178, 25);
		add(wineSugarArea);
		
		updateBtn = new JButton();
		updateBtn.setIcon(new ImageIcon(SearchPanel.class.getResource("/images/changebtn.png")));
		updateBtn.setBorderPainted(false);
		updateBtn.setContentAreaFilled(false);
		updateBtn.setFocusPainted(false);
		updateBtn.setBounds(590, 10, 80, 40);
		add(updateBtn);

	}
}
