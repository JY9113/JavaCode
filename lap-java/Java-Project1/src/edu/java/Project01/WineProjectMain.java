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

	private WineDAO dao;
	private JFrame frame;
	private JTextField nameSearchArea;
	private JTextArea wineNameArea, winePicArea, wineTypeArea, wineBodyArea, wineAlcoholArea, wineSugarArea, wineRegionArea, wineGrapeArea;
	private JButton menu_searchBtn, searchBtn, grapesBtn, regionBtn, menu_editBtn, menu_pBtn, menu_listBtn;
	
	public EditPanel editPanel = null;
	public ExistPersonPanel existPersonPanel = null;
	public SearchPanel searchPanel = null;
	public ListPanel listPanel = null;
	public NonExistPersonPanel nonExistPersonPanel = null;

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
		dao = WineDAOImple.getInstance();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon searchIcon = new ImageIcon("/image/avatar.png");
		
		searchPanel = new SearchPanel();
		editPanel = new EditPanel();
		listPanel = new ListPanel();
		existPersonPanel = new ExistPersonPanel();
		nonExistPersonPanel = new NonExistPersonPanel();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(700, 200, 710, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(nonExistPersonPanel);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(contentPanel);

		
		/**************************************************   Main Setting    **************************************************/
		JPanel menuBtnPanel = new JPanel();
		menuBtnPanel.setBounds(0, 0, 695, 69);
		frame.getContentPane().add(menuBtnPanel);
		menu_listBtn = new JButton("list");
		menuBtnPanel.add(menu_listBtn);
		menu_searchBtn = new JButton("search");
		menuBtnPanel.add(menu_searchBtn);
		
		menu_searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(searchPanel);
				frame.getContentPane().add(menuBtnPanel);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();				
			}
		});
		menu_listBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(listPanel);
				frame.getContentPane().add(menuBtnPanel);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
			}
		});
		/**************************************************    WINE   SEARCH     **************************************************/
		
	

		/**************************************************         LIST     **************************************************/
		
		
		

		/**************************************************         EDIT     **************************************************/

		/**************************************************         PERSONAL     **************************************************/
		
	}
	
	public void searchByWineName() {
		String wineName = nameSearchArea.getText();
		WineVO w_vo = dao.selectWine(wineName + "%");
		StringBuffer buffer = new StringBuffer();
		buffer.append(w_vo.getAlcohol());
		wineNameArea.setText(w_vo.getWine_name());
		wineTypeArea.setText(w_vo.getWine_type());
		wineGrapeArea.setText(w_vo.getGrapes());
		wineRegionArea.setText(w_vo.getRegion());
		wineSugarArea.setText(w_vo.getSugar_content());
		wineAlcoholArea.setText(buffer.toString());
		wineBodyArea.setText(w_vo.getBody());
		
		
	}
}
