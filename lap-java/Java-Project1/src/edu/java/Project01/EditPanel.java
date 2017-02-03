package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class EditPanel extends JPanel{


	public JTextArea wineNameArea, winePicArea, wineAlcoholArea, wineRegionArea, wineGrapeArea;
	private JLabel lblEditAlcohol, lblEditSugar, lblEditBody, lblEditName, lblEditGrapes, lblEditRegion, lblEditColor;
	public JComboBox wineTypeArea, wineBodyArea, wineSugarArea;
	public JButton insertWineBtn;

	public EditPanel() {
		setLayout(null);
		setBackground(Color.PINK);
		setBounds(0, 70, 695, 375);
		
		lblEditName = new JLabel("이름");
		lblEditName.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditName.setBounds(135, 65, 35, 35);
		add(lblEditName);
		
		wineNameArea = new JTextArea();
		wineNameArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		wineNameArea.setBounds(180, 65, 370, 35);
		add(wineNameArea);
		wineNameArea.setColumns(10);
		
		lblEditGrapes = new JLabel("품종");
		lblEditGrapes.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditGrapes.setBounds(135, 130, 35, 35);
		add(lblEditGrapes);
		
		lblEditRegion = new JLabel("지역");
		lblEditRegion.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditRegion.setBounds(135, 195, 35, 35);
		add(lblEditRegion);
		
		lblEditColor = new JLabel("타입");
		lblEditColor.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditColor.setBounds(350, 195, 35, 35);
		add(lblEditColor);
		
		wineGrapeArea = new JTextArea();
		wineGrapeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		wineGrapeArea.setColumns(10);
		wineGrapeArea.setBounds(180, 130, 370, 35);
		add(wineGrapeArea);
		
		wineRegionArea = new JTextArea();
		wineRegionArea.setBackground(Color.WHITE);
		wineRegionArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		wineRegionArea.setColumns(10);
		wineRegionArea.setBounds(180, 195, 155, 35);
		add(wineRegionArea);
		
		lblEditAlcohol = new JLabel("도수");
		lblEditAlcohol.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditAlcohol.setBounds(135, 260, 35, 35);
		add(lblEditAlcohol);
		
		lblEditSugar = new JLabel("당도");
		lblEditSugar.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditSugar.setBounds(255, 260, 35, 35);
		add(lblEditSugar);
		
		lblEditBody = new JLabel("바디");
		lblEditBody.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditBody.setBounds(400, 260, 35, 35);
		add(lblEditBody);
		
		wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		wineAlcoholArea.setColumns(10);
		wineAlcoholArea.setBounds(185, 260, 55, 35);
		add(wineAlcoholArea);
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		wineSugarArea = new JComboBox(sugarContent);
		wineSugarArea.setBounds(295, 260, 91, 35);
		add(wineSugarArea);
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		wineBodyArea = new JComboBox(body);
		wineBodyArea.setBounds(445, 260, 105, 35);
		add(wineBodyArea);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		wineTypeArea = new JComboBox(type);
		wineTypeArea.setBounds(400, 195, 150, 35);
		add(wineTypeArea);
		
		insertWineBtn = new JButton("등록");
		insertWineBtn.setBounds(295, 323, 95, 30);
		add(insertWineBtn);
	}

}
