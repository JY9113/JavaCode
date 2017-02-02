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

public class ListPanel extends JPanel{

	private JFrame frame;
	private JTextField textField;
	public JButton regionBtn, grapesBtn;
	public String[] resultList;
	public JList wineList;
	public JScrollPane scrollPane;

	public ListPanel() {
		
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 70, 695, 375);
		
		regionBtn = new JButton("REGION");
		regionBtn.setBounds(200, 21, 97, 23);
		add(regionBtn);
		
		grapesBtn = new JButton("GRAPES");
		grapesBtn.setBounds(400, 21, 97, 23);
		add(grapesBtn);
		


//		DefaultListModel<String> listModel;
//		listModel = new DefaultListModel<String>();
//		for(String item : resultList) {
//			listModel.addElement(item);
//		}
//		JList wineList = new JList();
//		wineList.setBounds(20, 60, 655, 300);
//		wineList.setModel(listModel);
//		add(wineList);
//
//		String[] items = {"aaa", "bbb"};
//		resultList = items;
		
		wineList = new JList();
		wineList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		wineList.setBounds(20, 60, 655, 300);
//		wineList.addListSelectionListener(new ListSelectionListener() {
//			
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				System.out.println(wineList.getSelectedValue());
//			}
//		});
		scrollPane = new JScrollPane(wineList);
		scrollPane.setBounds(20, 60, 655, 300);
		add(scrollPane);		
	}
}
