package edu.java.testPackage;

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

public class editPanel {

	private JFrame frame;
	private JPanel editPanel;
	private JTextField editNameField;
	private JTextField editGrapeField;
	private JTextField editRegionField;
	private JLabel lblEditAlcohol;
	private JLabel lblEditSugar;
	private JLabel lblEditBody;
	private JTextField editAlcoholField;
	private JComboBox sugarComboBox;
	private JComboBox bodyComboBox;
	private JComboBox typeComboBox;
	private JButton updateWineBtn;
	private JButton insertWineBtn;
	private JLabel cautionMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editPanel window = new editPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public editPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(700, 200, 710, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		editPanel = new JPanel();
		editPanel.setBackground(Color.PINK);
		editPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(editPanel);
		editPanel.setLayout(null);
		
		JLabel lblEditName = new JLabel("이름");
		lblEditName.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditName.setBounds(135, 65, 35, 35);
		editPanel.add(lblEditName);
		
		editNameField = new JTextField();
		editNameField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		editNameField.setBounds(180, 65, 270, 35);
		editPanel.add(editNameField);
		editNameField.setColumns(10);
		
		JButton nameFindBtn = new JButton("찾기");
		nameFindBtn.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 18));
		nameFindBtn.setBounds(455, 65, 95, 35);
		editPanel.add(nameFindBtn);
		
		JLabel lblEditGrapes = new JLabel("품종");
		lblEditGrapes.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditGrapes.setBounds(135, 130, 35, 35);
		editPanel.add(lblEditGrapes);
		
		JLabel lblEditRegion = new JLabel("지역");
		lblEditRegion.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditRegion.setBounds(135, 195, 35, 35);
		editPanel.add(lblEditRegion);
		
		JLabel lblEditColor = new JLabel("타입");
		lblEditColor.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditColor.setBounds(350, 195, 35, 35);
		editPanel.add(lblEditColor);
		
		editGrapeField = new JTextField();
		editGrapeField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		editGrapeField.setColumns(10);
		editGrapeField.setBounds(180, 130, 370, 35);
		editPanel.add(editGrapeField);
		
		editRegionField = new JTextField();
		editRegionField.setBackground(Color.WHITE);
		editRegionField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		editRegionField.setColumns(10);
		editRegionField.setBounds(180, 195, 155, 35);
		editPanel.add(editRegionField);
		
		lblEditAlcohol = new JLabel("도수");
		lblEditAlcohol.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditAlcohol.setBounds(135, 260, 35, 35);
		editPanel.add(lblEditAlcohol);
		
		lblEditSugar = new JLabel("당도");
		lblEditSugar.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditSugar.setBounds(255, 260, 35, 35);
		editPanel.add(lblEditSugar);
		
		lblEditBody = new JLabel("바디");
		lblEditBody.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblEditBody.setBounds(400, 260, 35, 35);
		editPanel.add(lblEditBody);
		
		editAlcoholField = new JTextField();
		editAlcoholField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		editAlcoholField.setColumns(10);
		editAlcoholField.setBounds(185, 260, 55, 35);
		editPanel.add(editAlcoholField);
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		sugarComboBox = new JComboBox(sugarContent);
		sugarComboBox.setBounds(295, 260, 91, 35);
		editPanel.add(sugarComboBox);
		
		String[] body = {"Medium Body", "Light Body", "Full Body"};
		bodyComboBox = new JComboBox(body);
		bodyComboBox.setBounds(445, 260, 105, 35);
		editPanel.add(bodyComboBox);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		typeComboBox = new JComboBox(type);
		typeComboBox.setBounds(400, 195, 150, 35);
		editPanel.add(typeComboBox);
		
		updateWineBtn = new JButton("수정");
		updateWineBtn.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 18));
		updateWineBtn.setBounds(216, 320, 95, 30);
		editPanel.add(updateWineBtn);
		
		insertWineBtn = new JButton("등록");
		insertWineBtn.setBounds(375, 321, 95, 30);
		editPanel.add(insertWineBtn);
		
		cautionMsg = new JLabel("\"수정을 원하시면 먼저 이름으로 검색해 주세요\"");
		cautionMsg.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		cautionMsg.setBounds(165, 20, 361, 35);
		editPanel.add(cautionMsg);
	}
}
