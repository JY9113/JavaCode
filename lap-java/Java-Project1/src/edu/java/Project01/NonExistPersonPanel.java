package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class NonExistPersonPanel extends JPanel {


	public JTextField nameField;
	public JButton submitBtn;
	public JComboBox bestTypeBox, bestBodyBox, bestSugarBox, bestRegionBox;


	public NonExistPersonPanel() {

		setLayout(null);
		setBackground(Color.PINK);
		setBounds(0, 70, 400, 430);
		
		
		
		JLabel lblName = new JLabel("회원 이름");
		lblName.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblName.setBounds(38, 39, 76, 35);
		add(lblName);
		
		nameField = new JTextField();
		nameField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		nameField.setColumns(10);
		nameField.setBounds(168, 42, 214, 35);
		add(nameField);
		
		JLabel lblBestRegion = new JLabel("선호하는 지역");
		lblBestRegion.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestRegion.setBounds(12, 101, 110, 35);
		add(lblBestRegion);
		
		String[] region = {"Australia", "Canada", "Chile", "France", "Germany", "Italy", "New Zealand", "Portugal", "Spain", "USA"};
		bestRegionBox = new JComboBox(region);
		bestRegionBox.setBounds(172, 101, 210, 35);
		add(bestRegionBox);
		
		JLabel lblBestType = new JLabel("선호하는 타입");
		lblBestType.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestType.setBounds(12, 161, 110, 35);
		add(lblBestType);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		bestTypeBox = new JComboBox(type);
		bestTypeBox.setBounds(172, 161, 210, 35);
		add(bestTypeBox);
		
		JLabel lblBestBody = new JLabel("바디");
		lblBestBody.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestBody.setBounds(87, 221, 35, 35);
		add(lblBestBody);
		
		String[] body = {"Medium Body", "Light Body", "Full Body"};
		bestBodyBox = new JComboBox(body);
		bestBodyBox.setBounds(173, 221, 105, 35);
		add(bestBodyBox);
				
		
		JLabel lblBestSugar = new JLabel("당도");
		lblBestSugar.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestSugar.setBounds(87, 281, 35, 35);
		add(lblBestSugar);
		
		String[] sugar = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		bestSugarBox = new JComboBox(sugar);
		bestSugarBox.setBounds(173, 281, 91, 35);
		add(bestSugarBox);		
		
		submitBtn = new JButton("등록");
		submitBtn.setBounds(140, 338, 97, 23);
		add(submitBtn);
	}

}
