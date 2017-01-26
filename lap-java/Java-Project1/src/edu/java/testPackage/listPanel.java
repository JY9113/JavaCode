package edu.java.testPackage;

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

public class listPanel {

	private JFrame frame;
	private JTextField textField;
	private JPanel listPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listPanel window = new listPanel();
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
	public listPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(700, 200, 490, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton menu_searchBtn = new JButton("search");
		menu_searchBtn.setBounds(36, 10, 66, 59);
		frame.getContentPane().add(menu_searchBtn);
		
		JButton menu_listBtn = new JButton("list");
		menu_listBtn.setBounds(143, 10, 66, 59);
		frame.getContentPane().add(menu_listBtn);
		
		JButton menu_editBtn = new JButton("edit");
		menu_editBtn.setBounds(254, 10, 66, 59);
		frame.getContentPane().add(menu_editBtn);
		
		JButton menu_pBtn = new JButton("personal");
		menu_pBtn.setBounds(368, 10, 66, 59);
		frame.getContentPane().add(menu_pBtn);
		
		listPanel = new JPanel();
		listPanel.setBackground(Color.PINK);
		listPanel.setBounds(0, 70, 475, 480);
		frame.getContentPane().add(listPanel);
		listPanel.setLayout(null);
		
		JButton RegionBtn = new JButton("REGION");
		RegionBtn.setBounds(99, 21, 97, 23);
		listPanel.add(RegionBtn);
		
		JButton grapesBtn = new JButton("GRAPES");
		grapesBtn.setBounds(270, 21, 97, 23);
		listPanel.add(grapesBtn);
		
		
		String[] data = {"AAA" , "BBB", "CCC", "DDD", "EEE", "FFF"};
		DefaultListModel<String> listModel;
		listModel = new DefaultListModel<String>();
		for(String item : data) {
			listModel.addElement(item);
		}
		Vector<String> vector = new Vector<String>();
		JList wineList = new JList();
		wineList.setBounds(20, 60, 430, 400);
		wineList.setModel(listModel);
		listPanel.add(wineList);
		
		
		
	}
}
