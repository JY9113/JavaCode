package edu.java.Project01;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class EditPanel extends JPanel{


	public JTextField editWineNameField,	 editGrapeField, editRegionField, editAlcoholField;
	private JLabel lblEditAlcohol, lblEditSugar, lblEditBody, lblEditName, lblEditGrapes, lblEditRegion, lblEditColor;
	public JComboBox sugarComboBox, bodyComboBox, typeComboBox;
	public JButton insertWineBtn;

	public EditPanel() {
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 70, 695, 375);
		
		lblEditName = new JLabel("이름");
		lblEditName.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditName.setBounds(135, 65, 35, 35);
		add(lblEditName);
		
		editWineNameField = new JTextField();
		editWineNameField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		editWineNameField.setBounds(180, 65, 370, 35);
		add(editWineNameField);
		editWineNameField.setColumns(10);
		
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
		
		editGrapeField = new JTextField();
		editGrapeField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		editGrapeField.setColumns(10);
		editGrapeField.setBounds(180, 130, 370, 35);
		add(editGrapeField);
		
		editRegionField = new JTextField();
		editRegionField.setBackground(Color.WHITE);
		editRegionField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		editRegionField.setColumns(10);
		editRegionField.setBounds(180, 195, 155, 35);
		add(editRegionField);
		
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
		
		editAlcoholField = new JTextField();
		editAlcoholField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		editAlcoholField.setColumns(10);
		editAlcoholField.setBounds(185, 260, 55, 35);
		add(editAlcoholField);
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		sugarComboBox = new JComboBox(sugarContent);
		sugarComboBox.setBounds(295, 260, 91, 35);
		add(sugarComboBox);
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		bodyComboBox = new JComboBox(body);
		bodyComboBox.setBounds(445, 260, 105, 35);
		add(bodyComboBox);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		typeComboBox = new JComboBox(type);
		typeComboBox.setBounds(400, 195, 150, 35);
		add(typeComboBox);
		
		insertWineBtn = new JButton("등록");
		insertWineBtn.setBounds(295, 323, 95, 30);
		add(insertWineBtn);
	}

}
