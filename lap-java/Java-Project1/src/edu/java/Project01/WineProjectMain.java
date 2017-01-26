package edu.java.Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class WineProjectMain {

	private JFrame frame;
	private JTextField nameSearchArea;
	private JTextArea wineNameArea, winePicArea;
	private JPanel searchPanel, listPanel, editPanel, personalPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WineProjectMain window = new WineProjectMain();
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
	public WineProjectMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon searchIcon = new ImageIcon("/image/avatar.png");
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(700, 200, 710, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		searchPanel = new JPanel();
		searchPanel.setBackground(Color.PINK);
		searchPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(searchPanel);
		searchPanel.setLayout(null);
		
		listPanel = new JPanel();
		listPanel.setBackground(Color.RED);
		listPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(listPanel);
		listPanel.setLayout(null);
		
		editPanel = new JPanel();
		editPanel.setBackground(Color.BLUE);
		editPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(editPanel);
		editPanel.setLayout(null);
		
		personalPanel = new JPanel();
		personalPanel.setBackground(Color.GREEN);
		personalPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(personalPanel);
		personalPanel.setLayout(null);
		/**************************************************         SEARCH     **************************************************/
		JButton menu_searchBtn = new JButton("search");
		menu_searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPanel.setVisible(true);
				listPanel.setVisible(false);
				editPanel.setVisible(false);
				personalPanel.setVisible(false);
			}
		});
		menu_searchBtn.setBounds(36, 10, 66, 59);
		frame.getContentPane().add(menu_searchBtn);
		
		nameSearchArea = new JTextField();
		nameSearchArea.setBounds(98, 10, 375, 34);
		searchPanel.add(nameSearchArea);
		nameSearchArea.setColumns(10);
		
		JButton searchBtn = new JButton("ENTER");
		searchBtn.setBounds(509, 14, 80, 25);
		searchPanel.add(searchBtn);
		
		winePicArea = new JTextArea();
		winePicArea.setText("IMAGE");
		winePicArea.setBounds(113, 118, 178, 229);
		searchPanel.add(winePicArea);
		
		wineNameArea = new JTextArea();
		wineNameArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		wineNameArea.setText("San Pedro 1865 Single Vineyard Cabernet Sauvignon");
		wineNameArea.setBounds(100, 66, 494, 34);
		searchPanel.add(wineNameArea);
		
		JLabel lblWineType = new JLabel("타입");
		lblWineType.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineType.setBounds(360, 124, 39, 25);
		searchPanel.add(lblWineType);
		
		JTextArea wineTypeArea = new JTextArea();
		wineTypeArea.setText("Sparkling Wine");
		wineTypeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineTypeArea.setBounds(411, 124, 178, 25);
		searchPanel.add(wineTypeArea);
		
		JLabel lblWineGrape = new JLabel("품종");
		lblWineGrape.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineGrape.setBounds(360, 159, 39, 25);
		searchPanel.add(lblWineGrape);
		
		JTextArea wineGrapeArea = new JTextArea();
		wineGrapeArea.setText("Cabernet Sauvignon");
		wineGrapeArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineGrapeArea.setBounds(411, 159, 178, 25);
		searchPanel.add(wineGrapeArea);
		
		JLabel lblWineRegion = new JLabel("지역");
		lblWineRegion.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineRegion.setBounds(360, 194, 39, 25);
		searchPanel.add(lblWineRegion);
		
		JTextArea wineRegionArea = new JTextArea();
		wineRegionArea.setText("New Zealand");
		wineRegionArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineRegionArea.setBounds(411, 194, 136, 25);
		searchPanel.add(wineRegionArea);
		
		JLabel lblWineSugar = new JLabel("당도");
		lblWineSugar.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineSugar.setBounds(360, 229, 39, 25);
		searchPanel.add(lblWineSugar);
		
		JTextArea wineSugarArea = new JTextArea();
		wineSugarArea.setText("Very Sweet");
		wineSugarArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineSugarArea.setBounds(411, 229, 136, 25);
		searchPanel.add(wineSugarArea);
		
		JLabel lblWineAlcohol = new JLabel("도수");
		lblWineAlcohol.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineAlcohol.setBounds(360, 264, 39, 25);
		searchPanel.add(lblWineAlcohol);
		
		JTextArea wineAlcoholArea = new JTextArea();
		wineAlcoholArea.setText("Sparkling Wine");
		wineAlcoholArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineAlcoholArea.setBounds(411, 264, 136, 25);
		searchPanel.add(wineAlcoholArea);
		
		JLabel lblWineBody = new JLabel("바디감");
		lblWineBody.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 25));
		lblWineBody.setBounds(348, 299, 51, 25);
		searchPanel.add(lblWineBody);
		
		JTextArea wineBodyArea = new JTextArea();
		wineBodyArea.setText("Medium Body");
		wineBodyArea.setFont(new Font("1훈하얀고양이 R", Font.PLAIN, 20));
		wineBodyArea.setBounds(411, 299, 136, 25);
		searchPanel.add(wineBodyArea);

		/**************************************************         LIST     **************************************************/
		JButton menu_listBtn = new JButton("list");
		menu_listBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPanel.setVisible(false);
				listPanel.setVisible(true);
				editPanel.setVisible(false);
				personalPanel.setVisible(false);
			}
		});
		menu_listBtn.setBounds(143, 10, 66, 59);
		frame.getContentPane().add(menu_listBtn);
		
		JButton RegionBtn = new JButton("REGION");
		RegionBtn.setBounds(99, 21, 97, 23);
		listPanel.add(RegionBtn);
		
		JButton grapesBtn = new JButton("GRAPES");
		grapesBtn.setBounds(255, 21, 97, 23);
		listPanel.add(grapesBtn);
		
		
		String[] data = {"AAA" , "BBB", "CCC", "DDD", "EEE", "FFF"};
		DefaultListModel<String> listModel;
		listModel = new DefaultListModel<String>();
		for(String item : data) {
			listModel.addElement(item);
		}
		Vector<String> vector = new Vector<String>();
		JList list = new JList();
		list.setBounds(12, 65, 436, 400);
		list.setModel(listModel);
		listPanel.add(list);
		/**************************************************         EDIT     **************************************************/
		JButton menu_editBtn = new JButton("edit");
		menu_editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPanel.setVisible(false);
				listPanel.setVisible(false);
				editPanel.setVisible(true);
				personalPanel.setVisible(false);
			}
		});
		menu_editBtn.setBounds(254, 10, 66, 59);
		frame.getContentPane().add(menu_editBtn);
		/**************************************************         PERSONAL     **************************************************/
		JButton menu_pBtn = new JButton("personal");
		menu_pBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPanel.setVisible(false);
				listPanel.setVisible(false);
				editPanel.setVisible(false);
				personalPanel.setVisible(true);
			}
		});
		menu_pBtn.setBounds(368, 10, 66, 59);
		frame.getContentPane().add(menu_pBtn);
		
		
		
		
	}
}
