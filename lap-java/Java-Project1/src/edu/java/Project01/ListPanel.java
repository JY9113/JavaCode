package edu.java.Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
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

public class ListPanel extends JPanel{

	private WineDAO dao;
	private JFrame frame;
	public JButton regionBtn, grapesBtn, resultBtn;
	public String[] resultData;
	public JList wineList;
	public JScrollPane scrollPane;
	public JComboBox wineTypeArea, wineBodyArea, wineSugarArea, ratingComboBox;
	public JTextArea wineNameArea, winePicArea, wineAlcoholArea, wineRegionArea, wineGrapeArea;

	public ListPanel() {
		dao = WineDAOImple.getInstance();
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 70, 695, 375);
		
		regionBtn = new JButton("REGION");
		regionBtn.setBounds(200, 21, 97, 23);
		add(regionBtn);
		
		grapesBtn = new JButton("GRAPES");
		grapesBtn.setBounds(400, 21, 97, 23);
		add(grapesBtn);
		
		
		wineList = new JList();
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
		wineNameArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		wineNameArea.setBounds(429, 82, 243, 34);
		add(wineNameArea);
		
		wineGrapeArea = new JTextArea();
		wineGrapeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineGrapeArea.setBounds(429, 175, 243, 25);
		add(wineGrapeArea);
		
		wineRegionArea = new JTextArea();
		wineRegionArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineRegionArea.setBounds(429, 210, 243, 25);
		add(wineRegionArea);
		
		wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineAlcoholArea.setBounds(429, 280, 243, 25);
		add(wineAlcoholArea);
		
		String[] body = {"Full Body", "Medium Body", "Light Body"};
		wineBodyArea = new JComboBox(body);
		wineBodyArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineBodyArea.setBounds(429, 315, 243, 25);
		add(wineBodyArea);
		
		String[] type = {"Red Wine", "White Wine", "Rose Wine", "Sparkling Wine"};
		wineTypeArea = new JComboBox(type);
		wineTypeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineTypeArea.setBounds(429, 140, 243, 25);
		add(wineTypeArea);
		
		String[] sugarContent = {"Very Sweet", "Sweet", "Normal", "Dry", "Extra Dry"};
		wineSugarArea = new JComboBox(sugarContent);
		wineSugarArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineSugarArea.setBounds(429, 245, 243, 25);
		add(wineSugarArea);
		
		resultBtn = new JButton("->");
		resultBtn.setBounds(370, 191, 47, 23);
		add(resultBtn);
		
		
	}

	
}
