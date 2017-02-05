package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class EditPanel extends JPanel{


	public JTextArea wineNameArea, wineAlcoholArea, wineRegionArea, wineGrapeArea;
	private JLabel lblEditAlcohol, lblEditSugar, lblEditBody, lblEditName, lblEditGrapes, lblEditRegion, lblEditColor;
	public JComboBox wineTypeArea, wineBodyArea, wineSugarArea;
	public JButton insertWineBtn, imgBtn;
	public JPanel winePicArea;
	BufferedImage bi;

	public EditPanel() {
		setLayout(null);
		setBackground(new Color(128, 0, 0));
		setBounds(0, 70, 695, 375);
		
		lblEditName = new JLabel("이름");
		lblEditName.setForeground(new Color(255, 255, 255));
		lblEditName.setFont(new Font("1훈막대연필 R", Font.BOLD, 25));
		lblEditName.setBounds(207, 63, 60, 35);
		add(lblEditName);
		
		wineNameArea = new JTextArea();
		wineNameArea.setBackground(new Color(128, 0, 0));
		wineNameArea.setForeground(new Color(255, 255, 255));
		wineNameArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineNameArea.setBounds(278, 63, 370, 35);
		add(wineNameArea);
		wineNameArea.setColumns(10);
		
		lblEditGrapes = new JLabel("품종");
		lblEditGrapes.setForeground(new Color(255, 255, 255));
		lblEditGrapes.setFont(new Font("1훈막대연필 R", Font.BOLD, 25));
		lblEditGrapes.setBounds(207, 128, 60, 35);
		add(lblEditGrapes);
		
		lblEditRegion = new JLabel("지역");
		lblEditRegion.setForeground(new Color(255, 255, 255));
		lblEditRegion.setFont(new Font("1훈막대연필 R", Font.BOLD, 25));
		lblEditRegion.setBounds(207, 193, 61, 35);
		add(lblEditRegion);
		
		lblEditColor = new JLabel("타입");
		lblEditColor.setForeground(new Color(255, 255, 255));
		lblEditColor.setFont(new Font("1훈막대연필 R", Font.BOLD, 25));
		lblEditColor.setBounds(448, 193, 55, 35);
		add(lblEditColor);
		
		wineGrapeArea = new JTextArea();
		wineGrapeArea.setBackground(new Color(128, 0, 0));
		wineGrapeArea.setForeground(new Color(255, 255, 255));
		wineGrapeArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineGrapeArea.setColumns(10);
		wineGrapeArea.setBounds(278, 128, 370, 35);
		add(wineGrapeArea);
		
		wineRegionArea = new JTextArea();
		wineRegionArea.setForeground(new Color(255, 255, 255));
		wineRegionArea.setBackground(new Color(128, 0, 0));
		wineRegionArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineRegionArea.setColumns(10);
		wineRegionArea.setBounds(278, 193, 155, 35);
		add(wineRegionArea);
		
		lblEditAlcohol = new JLabel("도수");
		lblEditAlcohol.setForeground(new Color(255, 255, 255));
		lblEditAlcohol.setFont(new Font("1훈막대연필 R", Font.BOLD, 25));
		lblEditAlcohol.setBounds(207, 258, 61, 35);
		add(lblEditAlcohol);
		
		lblEditSugar = new JLabel("당도");
		lblEditSugar.setForeground(new Color(255, 255, 255));
		lblEditSugar.setFont(new Font("1훈막대연필 R", Font.BOLD, 25));
		lblEditSugar.setBounds(318, 258, 49, 35);
		add(lblEditSugar);
		
		lblEditBody = new JLabel("바디");
		lblEditBody.setForeground(new Color(255, 255, 255));
		lblEditBody.setFont(new Font("1훈막대연필 R", Font.BOLD, 25));
		lblEditBody.setBounds(483, 258, 49, 35);
		add(lblEditBody);
		
		wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setSelectedTextColor(new Color(128, 0, 0));
		wineAlcoholArea.setSelectionColor(new Color(255, 255, 255));
		wineAlcoholArea.setBackground(new Color(128, 0, 0));
		wineAlcoholArea.setForeground(new Color(255, 255, 255));
		wineAlcoholArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		wineAlcoholArea.setColumns(10);
		wineAlcoholArea.setBounds(264, 258, 49, 35);
		add(wineAlcoholArea);
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		wineSugarArea = new JComboBox(sugarContent);
		wineSugarArea.setBackground(new Color(128, 0, 0));
		wineSugarArea.setForeground(new Color(255, 255, 255));
		wineSugarArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		wineSugarArea.setBounds(363, 258, 120, 35);
		add(wineSugarArea);
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		wineBodyArea = new JComboBox(body);
		wineBodyArea.setBackground(new Color(128, 0, 0));
		wineBodyArea.setForeground(new Color(255, 255, 255));
		wineBodyArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		wineBodyArea.setBounds(535, 258, 115, 35);
		add(wineBodyArea);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		wineTypeArea = new JComboBox(type);
		wineTypeArea.setBackground(new Color(128, 0, 0));
		wineTypeArea.setForeground(new Color(255, 255, 255));
		wineTypeArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		wineTypeArea.setBounds(498, 193, 150, 35);
		add(wineTypeArea);
		
		insertWineBtn = new JButton("등   록");
		insertWineBtn.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		insertWineBtn.setFont(new Font("1훈막대연필 R", Font.BOLD, 20));
		insertWineBtn.setForeground(new Color(255, 255, 255));
		insertWineBtn.setContentAreaFilled(false);
		insertWineBtn.setFocusPainted(false);
		insertWineBtn.setBounds(295, 323, 110, 35);
		add(insertWineBtn);
		
		winePicArea = new JPanel(){
			@Override
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				g2d.drawImage(bi, null, 0, 0);
			}
		};
		winePicArea.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		winePicArea.setBackground(new Color(128, 0, 0));
		
		winePicArea.setBounds(35, 63, 150, 215);
		add(winePicArea);
		
		imgBtn = new JButton("");
		imgBtn.setIcon(new ImageIcon(EditPanel.class.getResource("/images/imgbtn.png")));
		imgBtn.setForeground(new Color(255, 255, 255));
		imgBtn.setBorderPainted(false);
		imgBtn.setContentAreaFilled(false);
		imgBtn.setFocusPainted(false);
		imgBtn.setBounds(63, 285, 95, 35);
		add(imgBtn);
	}
}
