package edu.java.Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class ListPanel extends JPanel{

	private JFrame frame;
	private JTextField textField;
	private JPanel listPanel;

	public ListPanel() {
		setLayout(null);
		setBackground(Color.RED);
		setBounds(0, 70, 695, 375);
		
		JButton RegionBtn = new JButton("REGION");
		RegionBtn.setBounds(200, 21, 97, 23);
		add(RegionBtn);
		
		JButton grapesBtn = new JButton("GRAPES");
		grapesBtn.setBounds(400, 21, 97, 23);
		add(grapesBtn);
		
		
		String[] data = {"AAA" , "BBB", "CCC", "DDD", "EEE", "FFF"};
		DefaultListModel<String> listModel;
		listModel = new DefaultListModel<String>();
		for(String item : data) {
			listModel.addElement(item);
		}
		Vector<String> vector = new Vector<String>();
		JList wineList = new JList();
		wineList.setBounds(20, 60, 655, 300);
		wineList.setModel(listModel);
		add(wineList);
		
		
		
	}
}
