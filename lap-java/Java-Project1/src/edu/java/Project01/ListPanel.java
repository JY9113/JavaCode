package edu.java.Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class ListPanel extends JPanel{

	public JButton regionBtn, grapesBtn, resultBtn;
	public String[] resultData;
	public JList wineList;
	public JScrollPane scrollPane;
	public JTextArea wineNameArea, winePicArea, wineAlcoholArea, wineRegionArea, wineGrapeArea, wineTypeArea, wineBodyArea, wineSugarArea;
	

	public ListPanel() {
		setLayout(null);
		setBackground(new Color(128, 0, 0));
		setBounds(0, 70, 695, 375);
		
		regionBtn = new JButton();
		regionBtn.setIcon(new ImageIcon(EditPanel.class.getResource("/images/regionbtn.png")));
		regionBtn.setBorderPainted(false);
		regionBtn.setContentAreaFilled(false);
		regionBtn.setFocusPainted(false);
		regionBtn.setBounds(60, 15, 100, 35);
		add(regionBtn);
		
		grapesBtn = new JButton("");
		grapesBtn.setIcon(new ImageIcon(EditPanel.class.getResource("/images/grapesbtn.png")));
		grapesBtn.setBorderPainted(false);
		grapesBtn.setContentAreaFilled(false);
		grapesBtn.setFocusPainted(false);
		grapesBtn.setBounds(220, 15, 100, 35);
		add(grapesBtn);
		
		
		wineList = new JList();
		wineList.setForeground(new Color(255, 255, 255));
		wineList.setBorder(new LineBorder(new Color(255, 255, 255)));
		wineList.setBackground(new Color(128, 0, 0));
		wineList.setFont(new Font("1훈막대연필 R", Font.PLAIN, 20));
		wineList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		wineList.setBounds(20, 60, 350, 300);


		String[] ex = {" ", "", ""};
		DefaultListModel<String> listModel;
		listModel = new DefaultListModel<String>();
		for(String item :ex) {
			listModel.addElement(item);
		}
		wineList.setListData(ex);
		
		scrollPane = new JScrollPane(wineList);
		scrollPane.setBounds(10, 60, 355, 300);
		add(scrollPane);
		
		wineNameArea = new JTextArea();
		wineNameArea.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 255, 255)));
		wineNameArea.setBackground(new Color(128, 0, 0));
		wineNameArea.setWrapStyleWord(true);
		wineNameArea.setLineWrap(true);
		wineNameArea.setEditable(false);
		wineNameArea.setForeground(new Color(255, 255, 255));
		wineNameArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineNameArea.setBounds(429, 65, 252, 63);
		add(wineNameArea);
		
		wineGrapeArea = new JTextArea();
		wineGrapeArea.setForeground(new Color(255, 255, 255));
		wineGrapeArea.setBackground(new Color(128, 0, 0));
		wineGrapeArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineGrapeArea.setBounds(429, 175, 243, 25);
		wineGrapeArea.setEditable(false);
		add(wineGrapeArea);
		
		wineRegionArea = new JTextArea();
		wineRegionArea.setForeground(new Color(255, 255, 255));
		wineRegionArea.setBackground(new Color(128, 0, 0));
		wineRegionArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineRegionArea.setBounds(429, 210, 243, 25);
		wineRegionArea.setEditable(false);
		add(wineRegionArea);
		
		wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setForeground(new Color(255, 255, 255));
		wineAlcoholArea.setBackground(new Color(128, 0, 0));
		wineAlcoholArea.setFont(new Font("1훈막대연필 R", Font.PLAIN, 22));
		wineAlcoholArea.setBounds(429, 280, 243, 25);
		wineAlcoholArea.setEditable(false);
		add(wineAlcoholArea);
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		wineBodyArea = new JTextArea();
		wineBodyArea.setBackground(new Color(128, 0, 0));
		wineBodyArea.setForeground(new Color(255, 255, 255));
		wineBodyArea.setFont(new Font("1훈막대연필 R", Font.BOLD, 22));
		wineBodyArea.setBounds(429, 315, 243, 25);
		add(wineBodyArea);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		wineTypeArea = new JTextArea();
		wineTypeArea.setBackground(new Color(128, 0, 0));
		wineTypeArea.setForeground(new Color(255, 255, 255));
		wineTypeArea.setFont(new Font("1훈막대연필 R", Font.BOLD, 22));
		wineTypeArea.setBounds(429, 140, 243, 25);
		add(wineTypeArea);
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		wineSugarArea = new JTextArea();
		wineSugarArea.setBackground(new Color(128, 0, 0));
		wineSugarArea.setForeground(new Color(255, 255, 255));
		wineSugarArea.setFont(new Font("1훈막대연필 R", Font.BOLD, 22));
		wineSugarArea.setBounds(429, 245, 243, 25);
		add(wineSugarArea);
		
		resultBtn = new JButton();
		resultBtn.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/next.png")));
		resultBtn.setBorderPainted(false);
		resultBtn.setContentAreaFilled(false);
		resultBtn.setFocusPainted(false);
		resultBtn.setBounds(370, 191, 51, 44);
		add(resultBtn);
		
		
	}

	
}
