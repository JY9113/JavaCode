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


	private JTextField nameField;


	public NonExistPersonPanel() {

		setLayout(null);
		setBackground(Color.PINK);
		setBounds(0, 70, 695, 375);
		
		nameField = new JTextField();
		nameField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		nameField.setColumns(10);
		nameField.setBounds(317, 32, 214, 35);
		add(nameField);
		
		JLabel lblName = new JLabel("회원 이름");
		lblName.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblName.setBounds(187, 29, 76, 35);
		add(lblName);
		
		JLabel lblBestGrape = new JLabel("선호하는 품종");
		lblBestGrape.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestGrape.setBounds(161, 91, 110, 35);
		add(lblBestGrape);
		
		JLabel lblBestRegion = new JLabel("선호하는 지역");
		lblBestRegion.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestRegion.setBounds(161, 151, 110, 35);
		add(lblBestRegion);
		
		JLabel lblBestBody = new JLabel("바디");
		lblBestBody.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestBody.setBounds(236, 211, 35, 35);
		add(lblBestBody);
		
		String[] sugar = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		JComboBox bestSugarBox = new JComboBox(sugar);
		bestSugarBox.setBounds(322, 271, 91, 35);
		add(bestSugarBox);
		
		JLabel lblBestSugar = new JLabel("당도");
		lblBestSugar.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestSugar.setBounds(236, 271, 35, 35);
		add(lblBestSugar);
		
		
		String[] body = {"Medium Body", "Light Body", "Full Body"};
		JComboBox bestBodyBox = new JComboBox(body);
		bestBodyBox.setBounds(322, 211, 105, 35);
		add(bestBodyBox);
		
		String[] grape = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		JComboBox bestGrapeBox = new JComboBox(grape);
		bestGrapeBox.setBounds(321, 91, 210, 35);
		add(bestGrapeBox);
		
		String[] region = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		JComboBox bestRegionBox = new JComboBox(region);
		bestRegionBox.setBounds(321, 151, 210, 35);
		add(bestRegionBox);
		
		JButton submitBtn = new JButton("등록");
		submitBtn.setBounds(289, 328, 97, 23);
		add(submitBtn);
	}

}
