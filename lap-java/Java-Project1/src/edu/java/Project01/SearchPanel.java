package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchPanel extends JPanel {

	private WineDAO dao;

	public JTextField nameSearchArea;
	public JTextArea wineNameArea, winePicArea, wineAlcoholArea, wineRegionArea, wineGrapeArea;
//	private JPanel searchPanel;
	public JComboBox wineTypeArea, wineBodyArea, wineSugarArea, ratingComboBox;
	public JButton searchBtn, updateBtn;

	public SearchPanel() {
		dao = WineDAOImple.getInstance();
		setLayout(null);
		setBackground(Color.PINK);
		setBounds(0, 70, 695, 375);

		
		nameSearchArea = new JTextField();
		nameSearchArea.setBounds(98, 10, 375, 34);
		add(nameSearchArea);
		nameSearchArea.setColumns(10);
		
		searchBtn = new JButton("입력");
		searchBtn.setBounds(509, 14, 80, 25);
		add(searchBtn);
		
		winePicArea = new JTextArea();
		winePicArea.setText("IMAGE");
		winePicArea.setBounds(113, 118, 178, 206);
		add(winePicArea);
		
		wineNameArea = new JTextArea();
		wineNameArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		wineNameArea.setBounds(100, 66, 494, 34);
		add(wineNameArea);
		
			
		JLabel lblWineGrape = new JLabel("품종");
		lblWineGrape.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineGrape.setBounds(360, 159, 39, 25);
		add(lblWineGrape);
		
		wineGrapeArea = new JTextArea();
		wineGrapeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineGrapeArea.setBounds(411, 159, 178, 25);
		add(wineGrapeArea);
		
		JLabel lblWineRegion = new JLabel("지역");
		lblWineRegion.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineRegion.setBounds(360, 194, 39, 25);
		add(lblWineRegion);
		
		wineRegionArea = new JTextArea();
		wineRegionArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineRegionArea.setBounds(411, 194, 136, 25);
		add(wineRegionArea);
		
			
		JLabel lblWineAlcohol = new JLabel("도수");
		lblWineAlcohol.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineAlcohol.setBounds(360, 264, 39, 25);
		add(lblWineAlcohol);
		
		wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineAlcoholArea.setBounds(411, 264, 136, 25);
		add(wineAlcoholArea);
		
		JLabel lblWineBody = new JLabel("바디감");
		lblWineBody.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineBody.setBounds(348, 299, 51, 25);
		add(lblWineBody);
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		wineBodyArea = new JComboBox(body);
		wineBodyArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineBodyArea.setBounds(411, 299, 136, 25);
		add(wineBodyArea);
		
		JLabel lblWineType = new JLabel("타입");
		lblWineType.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineType.setBounds(360, 124, 39, 25);
		add(lblWineType);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		wineTypeArea = new JComboBox(type);
		wineTypeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineTypeArea.setBounds(411, 124, 178, 25);
		add(wineTypeArea);
		
		JLabel lblWineSugar = new JLabel("당도");
		lblWineSugar.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineSugar.setBounds(360, 229, 39, 25);
		add(lblWineSugar);
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		wineSugarArea = new JComboBox(sugarContent);
		wineSugarArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineSugarArea.setBounds(411, 229, 136, 25);
		add(wineSugarArea);
		
		updateBtn = new JButton("수정");
		updateBtn.setBounds(603, 15, 80, 25);
		add(updateBtn);
		
		String[] ratingNum = {"1", "2", "3", "4", "5"};
		ratingComboBox = new JComboBox(ratingNum);
		ratingComboBox.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		ratingComboBox.setBounds(135, 334, 63, 25);
		add(ratingComboBox);
	}
}
