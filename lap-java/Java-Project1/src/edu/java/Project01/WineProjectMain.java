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
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class WineProjectMain {

	private WineDAO dao;
	private JFrame frame;
	private JTextField nameSearchArea;
	private JTextArea wineNameArea, winePicArea, wineTypeArea, wineBodyArea, wineAlcoholArea, wineSugarArea, wineRegionArea, wineGrapeArea;
	private JButton menu_searchBtn, searchBtn, grapesBtn, regionBtn, menu_editBtn, menu_personBtn, menu_listBtn;
	private JPanel menuBtnPanel;
	public EditPanel editPanel = null;
	public ExistPersonPanel existPanel = null;
	public SearchPanel searchPanel = null;
	public ListPanel listPanel = null;
	public NonExistPersonPanel nonExistPanel = null;
	public int wineCount, personCount = 0;
	public final int SUCCESS = 1;
	public int foundWineID = 0;
	public String[] listData, bestWine;
	private JButton menu_joinBtn;
	public WineVO resultVO;
	public String resultWineName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WineProjectMain window = new WineProjectMain();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		wineCount = dao.countWine();
		personCount = dao.countPerson();
		System.out.println(personCount);
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
		existPanel = new ExistPersonPanel();
		nonExistPanel = new NonExistPersonPanel();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(700, 200, 710, 485);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(existPanel);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(contentPanel);

		
		/**************************************************   Main Setting    **************************************************/
		menuBtnPanel = new JPanel();
		menuBtnPanel.setBounds(0, 0, 695, 69);
		frame.getContentPane().add(menuBtnPanel);
		menu_listBtn = new JButton("전체보기");
		menuBtnPanel.add(menu_listBtn);
		menu_searchBtn = new JButton("검색");
		menuBtnPanel.add(menu_searchBtn);
		menu_personBtn = new JButton("개인");
		menuBtnPanel.add(menu_personBtn);
		menu_editBtn = new JButton("수정/등록");
		menuBtnPanel.add(menu_editBtn);
		
		menu_joinBtn = new JButton("join");
		menuBtnPanel.add(menu_joinBtn);
		
		menu_searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(searchPanel);
				frame.getContentPane().add(menuBtnPanel);
				searchPanel.wineBodyArea.setVisible(false);
				searchPanel.wineSugarArea.setVisible(false);
				searchPanel.wineTypeArea.setVisible(false);
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
		menu_editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(editPanel);
				frame.getContentPane().add(menuBtnPanel);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
			}
		});
		menu_personBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				frame.getContentPane().add(existPanel);
				frame.getContentPane().add(menuBtnPanel);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
			}
		});
		menu_joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PopUpFrame pop = new PopUpFrame();
				pop.setContentPane(nonExistPanel);
				pop.setVisible(true);
			}
		});
		/**************************************************    WINE   SEARCH     **************************************************/
		
		searchPanel.searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchPanel.wineBodyArea.setVisible(true);
				searchPanel.wineSugarArea.setVisible(true);
				searchPanel.wineTypeArea.setVisible(true);
				String wineName = searchPanel.nameSearchArea.getText();
				searchByWineName(wineName);
				printSearchResult();
			}
		});
		searchPanel.updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateWine(foundWineID);
			}
		});

		/**************************************************         LIST     **************************************************/
		listPanel.regionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				orderByRegion();
				DefaultListModel<String> listModel;
				listModel = new DefaultListModel<String>();
				for(String item : listData) {
					listModel.addElement(item);
				}
				listPanel.wineList.setModel(listModel);	
			}
		});
		listPanel.wineList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				String[] result = listPanel.wineList.getSelectedValue().toString().split("[|]");
				resultWineName = result[0];
				changeView();
				
			}
			
		});		
		
		listPanel.grapesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				orderByGrapes();
			}
		});
		
		

		/**************************************************         EDIT     **************************************************/
		
		editPanel.insertWineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertWine();
			}
		});
		
		/**************************************************         PERSONAL     **************************************************/
		existPanel.bestWine1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO
			}
		});
		
		existPanel.bestWine2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO
			}
		});
		
		existPanel.bestWine3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO
			}
		});
		
		nonExistPanel.submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertPerson();
			
				
			}
		});
		
	}
	
	
	public void searchByWineName(String wineName) {		
		WineVO w_vo;
		try {
			w_vo = dao.selectWine("%" + wineName + "%");
		} catch(NullPointerException e) {
			w_vo = dao.selectWine(wineName + "%");				
		}		
		resultVO = w_vo;
	}
	
	public void printSearchResult() {
		
		searchPanel.wineNameArea.setText(resultVO.getWine_name());
//		searchPanel.wineTypeArea.setSelectedItem(w_vo.getWine_type());
//		searchPanel.wineGrapeArea.setText(w_vo.getGrapes());
//		searchPanel.wineRegionArea.setText(w_vo.getRegion());
//		searchPanel.wineSugarArea.setSelectedItem(w_vo.getSugar_content());
//		searchPanel.wineAlcoholArea.setText(String.valueOf(w_vo.getAlcohol()));
//		searchPanel.wineBodyArea.setSelectedItem(w_vo.getBody());
//		foundWineID = w_vo.getWine_id();
	}
	
	public void updateWine(int foundWineID) {
		int w_id = foundWineID;
		String w_name = searchPanel.wineNameArea.getText();
		String grapes = searchPanel.wineGrapeArea.getText();
		String region = searchPanel.wineRegionArea.getText();
		int alcohol = Integer.parseInt(searchPanel.wineAlcoholArea.getText());
		String sugar = (String) searchPanel.wineSugarArea.getSelectedItem();
		String body = (String) searchPanel.wineBodyArea.getSelectedItem();
		String w_type = (String) searchPanel.wineBodyArea.getSelectedItem();
		
		WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar);
		int result = dao.updateWine(w_vo);
		if(result == SUCCESS) {
			System.out.println("업데이트 성공");
		} else {
			System.out.println("업데이트 실패");
		}
		
	}
	public void insertWine() {
		
		String w_name = editPanel.editWineNameField.getText();
		String grapes = editPanel.editGrapeField.getText();
		String region = editPanel.editRegionField.getText();
		int alcohol = Integer.parseInt(editPanel.editAlcoholField.getText());
		String sugar = (String) editPanel.sugarComboBox.getSelectedItem();
		String body = (String)editPanel.bodyComboBox.getSelectedItem();
		String w_type = (String)editPanel.typeComboBox.getSelectedItem();
		wineCount++;
		int w_id = wineCount;		
		if(!w_name.equals("") && !grapes.equals("") && !region.equals("") && alcohol != 0 
				&& !sugar.equals("") && !body.equals("") && !w_type.equals("")) {
			
			WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar);
			int result = dao.insertWine(w_vo);
			if(result == SUCCESS) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}		
		} else {
			System.out.println("등록할 정보를 입력하세요");
		}
	}
	
	public void orderByRegion() {
		ArrayList<WineVO> winelist = dao.selectWineOrderByRegion();
		String buffer = null;
		listData = new String[wineCount];		
		for(int i = 0; i < winelist.size(); i++) {
			buffer = winelist.get(i).getWine_name() + " | " + winelist.get(i).getRegion();
			listData[i] = buffer;	
		}
//		DefaultListModel<String> listModel;
//		listModel = new DefaultListModel<String>();
//		for(String item : listData) {
//			listModel.addElement(item);
//		}
//		listPanel.wineList.setModel(listModel);		
		
	}
	public void orderByGrapes() {
		ArrayList<WineVO> winelist = dao.selectWineOrderByGrapes();
		String buffer = null;
		listData = new String[wineCount];		
		for(int i = 0; i < winelist.size(); i++) {
			buffer = winelist.get(i).getWine_name() + " | " + winelist.get(i).getGrapes();
			listData[i] = buffer;	
		}
		DefaultListModel<String> listModel;
		listModel = new DefaultListModel<String>();
		for(String item : listData) {
			listModel.addElement(item);
		}
		listPanel.wineList.setModel(listModel);		
		listPanel.wineList.addListSelectionListener(new ListSelectionListener() {
			

			public void valueChanged(ListSelectionEvent e) {
				String[] result = listPanel.wineList.getSelectedValue().toString().split("[|]");
				String wineName = result[0];
				System.out.println(wineName);
				PopUpFrame pop = new PopUpFrame();
				pop.setContentPane(searchPanel);
				pop.setVisible(true);
				
			}
		});
	}
	
	public void changeView() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(searchPanel);
		frame.getContentPane().add(menuBtnPanel);
		searchPanel.wineBodyArea.setVisible(false);
		searchPanel.wineSugarArea.setVisible(false);
		searchPanel.wineTypeArea.setVisible(false);
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		resultVO = dao.selectWine(resultWineName);

		
	}
	
	public void insertPerson() {
		// PERSON_ID , P_REGION, P_TYPE, P_BODY, P_SUGAR, P_NAME
		personCount++;
		int p_id = personCount;
		String p_name = nonExistPanel.nameField.getText();
		String p_region = (String)nonExistPanel.bestRegionBox.getSelectedItem();
		String p_type = (String)nonExistPanel.bestTypeBox.getSelectedItem();
		String p_body = (String)nonExistPanel.bestBodyBox.getSelectedItem();
		String p_sugar = (String)nonExistPanel.bestSugarBox.getSelectedItem();
		
		if(!p_name.equals("") && !p_region.equals("") && !p_type.equals("")
				&& !p_body.equals("") && !p_sugar.equals("")) {
			
			PersonVO p_vo = new PersonVO(p_id, p_name, p_region, p_type, p_body, p_sugar);
			int result = dao.insertPerson(p_vo);
			if(result == SUCCESS) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}		
		} else {
			System.out.println("등록할 정보를 입력하세요");
		}
		
	}
	
	public void setBestWineList() {
		ArrayList<WineVO> winelist = dao.selectBestWine();
		String buffer = null;
		bestWine = new String[3];
		for(int i = 0; i < 3; i++) {
			buffer = winelist.get(i).getWine_name();
			bestWine[i] = buffer;	
		}
	}
	public void printBestWine() {
		
	}


}
