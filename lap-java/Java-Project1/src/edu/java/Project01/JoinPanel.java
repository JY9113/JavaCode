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
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class JoinPanel extends JPanel {


	public JTextField nameField;
	public JButton submitBtn;
	public JComboBox bestTypeBox, bestBodyBox, bestSugarBox, bestRegionBox;


	public JoinPanel() {

		setLayout(null);
		setBackground(new Color(128, 0, 0));
		setBounds(0, 70, 695, 375);	
		
		JLabel lblName = new JLabel("회원 이름");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("1훈막대연필 R", Font.BOLD, 23));
		lblName.setBounds(180, 22, 105, 35);
		add(lblName);
		
		nameField = new JTextField();
		nameField.setForeground(Color.WHITE);
		nameField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		nameField.setBackground(new Color(128, 0, 0));
		nameField.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		nameField.setColumns(10);
		nameField.setBounds(310, 25, 214, 35);
		add(nameField);
		
		JLabel lblBestRegion = new JLabel("선호하는 지역");
		lblBestRegion.setForeground(new Color(255, 255, 255));
		lblBestRegion.setFont(new Font("1훈막대연필 R", Font.BOLD, 23));
		lblBestRegion.setBounds(154, 84, 131, 35);
		add(lblBestRegion);
		
		String[] region = {"Australia", "Canada", "Chile", "France", "Germany", "Italy", "New Zealand", "Portugal", "Spain", "USA"};
		bestRegionBox = new JComboBox(region);
		bestRegionBox.setBackground(new Color(128, 0, 0));
		bestRegionBox.setForeground(new Color(255, 255, 255));
		bestRegionBox.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		bestRegionBox.setBounds(314, 84, 148, 35);
		add(bestRegionBox);
		
		JLabel lblBestType = new JLabel("선호하는 타입");
		lblBestType.setForeground(new Color(255, 255, 255));
		lblBestType.setFont(new Font("1훈막대연필 R", Font.BOLD, 23));
		lblBestType.setBounds(154, 144, 131, 35);
		add(lblBestType);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		bestTypeBox = new JComboBox(type);
		bestTypeBox.setBackground(new Color(128, 0, 0));
		bestTypeBox.setForeground(new Color(255, 255, 255));
		bestTypeBox.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		bestTypeBox.setBounds(314, 144, 148, 35);
		add(bestTypeBox);
		
		JLabel lblBestBody = new JLabel("바디");
		lblBestBody.setForeground(new Color(255, 255, 255));
		lblBestBody.setFont(new Font("1훈막대연필 R", Font.BOLD, 23));
		lblBestBody.setBounds(229, 204, 56, 35);
		add(lblBestBody);
		
		String[] body = {"Medium Body", "Light Body", "Full Body"};
		bestBodyBox = new JComboBox(body);
		bestBodyBox.setBackground(new Color(128, 0, 0));
		bestBodyBox.setForeground(new Color(255, 255, 255));
		bestBodyBox.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		bestBodyBox.setBounds(315, 204, 147, 35);
		add(bestBodyBox);
				
		
		JLabel lblBestSugar = new JLabel("당도");
		lblBestSugar.setForeground(new Color(255, 255, 255));
		lblBestSugar.setFont(new Font("1훈막대연필 R", Font.BOLD, 23));
		lblBestSugar.setBounds(229, 264, 56, 35);
		add(lblBestSugar);
		
		String[] sugar = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		bestSugarBox = new JComboBox(sugar);
		bestSugarBox.setBackground(new Color(128, 0, 0));
		bestSugarBox.setForeground(new Color(255, 255, 255));
		bestSugarBox.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		bestSugarBox.setBounds(315, 264, 147, 35);
		add(bestSugarBox);		
		
		submitBtn = new JButton("등   록");
		submitBtn.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		submitBtn.setFont(new Font("1훈막대연필 R", Font.BOLD, 20));
		submitBtn.setForeground(new Color(255, 255, 255));
		submitBtn.setContentAreaFilled(false);
		submitBtn.setFocusPainted(false);
		submitBtn.setBounds(295, 329, 100, 35);
		add(submitBtn);
	}

}
