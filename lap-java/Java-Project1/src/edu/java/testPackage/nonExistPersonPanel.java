package edu.java.testPackage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class nonExistPersonPanel {

	private JFrame frame;
	private JPanel nonExistPersonPanel;
	private JTextField nameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nonExistPersonPanel window = new nonExistPersonPanel();
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
	public nonExistPersonPanel() {
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
		
		nonExistPersonPanel = new JPanel();
		nonExistPersonPanel.setBackground(Color.PINK);
		nonExistPersonPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(nonExistPersonPanel);
		nonExistPersonPanel.setLayout(null);
		
		nameField = new JTextField();
		nameField.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 17));
		nameField.setColumns(10);
		nameField.setBounds(317, 32, 214, 35);
		nonExistPersonPanel.add(nameField);
		
		JLabel lblName = new JLabel("회원 이름");
		lblName.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblName.setBounds(187, 29, 76, 35);
		nonExistPersonPanel.add(lblName);
		
		JLabel lblBestGrape = new JLabel("선호하는 품종");
		lblBestGrape.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestGrape.setBounds(161, 91, 110, 35);
		nonExistPersonPanel.add(lblBestGrape);
		
		JLabel lblBestRegion = new JLabel("선호하는 지역");
		lblBestRegion.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestRegion.setBounds(161, 151, 110, 35);
		nonExistPersonPanel.add(lblBestRegion);
		
		JLabel lblBestBody = new JLabel("바디");
		lblBestBody.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestBody.setBounds(236, 211, 35, 35);
		nonExistPersonPanel.add(lblBestBody);
		
		JComboBox bestSugarComboBox = new JComboBox(new Object[]{});
		bestSugarComboBox.setBounds(322, 271, 91, 35);
		nonExistPersonPanel.add(bestSugarComboBox);
		
		JLabel lblBestSugar = new JLabel("당도");
		lblBestSugar.setFont(new Font("1훈하얀고양이 R", Font.BOLD, 25));
		lblBestSugar.setBounds(236, 271, 35, 35);
		nonExistPersonPanel.add(lblBestSugar);
		
		JComboBox bestBodyBox = new JComboBox(new Object[]{});
		bestBodyBox.setBounds(322, 211, 105, 35);
		nonExistPersonPanel.add(bestBodyBox);
		
		JComboBox bestGrapeBox = new JComboBox(new Object[]{});
		bestGrapeBox.setBounds(321, 91, 210, 35);
		nonExistPersonPanel.add(bestGrapeBox);
		
		JComboBox bestRegionBox = new JComboBox(new Object[]{});
		bestRegionBox.setBounds(321, 151, 210, 35);
		nonExistPersonPanel.add(bestRegionBox);
		
		JButton joinBtn = new JButton("등록");
		joinBtn.setBounds(289, 328, 97, 23);
		nonExistPersonPanel.add(joinBtn);
	}

}
