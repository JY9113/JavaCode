package edu.java.Project01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.FileChooserUI;
import javax.swing.plaf.InputMapUIResource;

import oracle.sql.BLOB;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class WineProjectMain {

	private ProjectDAO dao;
	private JFrame frame;
	private JButton menu_searchBtn, menu_editBtn, menu_personBtn, menu_listBtn, menu_joinBtn;
	private JPanel menuBtnPanel;
	public EditPanel editPanel = null;
	public BestPanel existPanel = null;
	public SearchPanel searchPanel = null;
	public ListPanel listPanel = null;
	public JoinPanel nonExistPanel = null;
	public int wineCount, personCount, resultWineID = 0;
	public final int SUCCESS = 1;
	public String[] listData, bestWine;
	public WineVO resultVO;
	public String resultWineName, currentPanel;
	public int imgnum;


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
		dao = ProjectDAOImple.getInstance();
		wineCount = dao.countWine();
		personCount = dao.countPerson();
		currentPanel = "listPanel";
		System.out.println(personCount);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		searchPanel = new SearchPanel();
		editPanel = new EditPanel();
		listPanel = new ListPanel();
		existPanel = new BestPanel();
		existPanel.setBackground(new Color(128, 0, 0));
		existPanel.winePicArea.setSize(150, 215);
		nonExistPanel = new JoinPanel();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.setBounds(700, 200, 710, 485);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(listPanel);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(0, 70, 695, 375);
		frame.getContentPane().add(contentPanel);

		
		/**************************************************   Main Setting    **************************************************/
		menuBtnPanel = new JPanel();
		menuBtnPanel.setBackground(new Color(128, 0, 0));
		menuBtnPanel.setBounds(0, 0, 695, 69);
		frame.getContentPane().add(menuBtnPanel);
		
		drawUI();
		
		menu_searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				repaintFrame();
				frame.getContentPane().add(searchPanel);
				searchPanel.wineBodyArea.setVisible(false);
				searchPanel.wineSugarArea.setVisible(false);
				searchPanel.wineTypeArea.setVisible(false);
				currentPanel ="searchPanel";
				
			}
		});
		menu_listBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaintFrame();
				frame.getContentPane().add(listPanel);
				currentPanel ="listPanel";
				
			}
		});
		menu_editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaintFrame();
				frame.getContentPane().add(editPanel);
				currentPanel ="editPanel";
			}
		});
		menu_personBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaintFrame();
				frame.getContentPane().add(existPanel);
				currentPanel ="existPanel";
				try {
					setBestWineList();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		menu_joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaintFrame();
				frame.getContentPane().add(nonExistPanel);
				currentPanel ="nonexistPanel";
			}
		});
		/**************************************************    WINE   SEARCH     **************************************************/
		
		searchPanel.searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchPanel.wineBodyArea.setVisible(true);
				searchPanel.wineSugarArea.setVisible(true);
				searchPanel.wineTypeArea.setVisible(true);
				resultWineName= searchPanel.nameSearchArea.getText();
				resultVO = searchByWineName(resultWineName);
				printSearchResult(resultVO);
				printImg(currentPanel);
			}
		});
		searchPanel.updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					updateWine(resultWineID);
					printImg(currentPanel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		/**************************************************         LIST     **************************************************/
		listPanel.regionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					orderByRegion();
				} catch (Exception e) {
					e.printStackTrace();
				}			
			}
		});
		
		listPanel.resultBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String[] str = listPanel.wineList.getSelectedValue().toString().split("[|]");
				resultWineName = str[0];
				resultWineName = resultWineName.trim();
				resultVO = searchByWineName(resultWineName);
				printSearchResult(resultVO);
				
			}
		});
		
		listPanel.grapesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					orderByGrapes();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		

		/**************************************************         EDIT     **************************************************/
		editPanel.imgBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editPanel.bi = chooseImg();
				editPanel.winePicArea.repaint();
			}
		});
		editPanel.insertWineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					insertWine();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		/**************************************************         PERSONAL     **************************************************/
		existPanel.bestWine1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultWineName = bestWine[0];
				resultVO = searchByWineName(resultWineName);
				printSearchResult(resultVO);
				printImg(currentPanel);
			}
		});
		
		existPanel.bestWine2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultWineName = bestWine[1];
				resultVO = searchByWineName(resultWineName);
				printSearchResult(resultVO);
				printImg(currentPanel);
			}
		});
		
		existPanel.bestWine3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultWineName = bestWine[2];
				resultVO = searchByWineName(resultWineName);
				printSearchResult(resultVO);
				printImg(currentPanel);
			}
		});
		
		nonExistPanel.submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertPerson();				
			}
		});
		
	}
	
	
	public void drawUI() {		
		menu_listBtn = new JButton();
		menu_searchBtn = new JButton();
		menu_personBtn = new JButton();
		menu_editBtn = new JButton();
		menu_joinBtn = new JButton();
		
		menuBtnPanel.add(menu_listBtn);
		menuBtnPanel.add(menu_searchBtn);
		menuBtnPanel.add(menu_personBtn);
		menuBtnPanel.add(menu_editBtn);		
		menuBtnPanel.add(menu_joinBtn);
		menu_listBtn.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/listbtn.png")));
		menu_listBtn.setBorderPainted(false);
		menu_listBtn.setContentAreaFilled(false);
		menu_listBtn.setFocusPainted(false);
		
		menu_searchBtn.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/searchbtn.png")));
		menu_searchBtn.setBorderPainted(false);
		menu_searchBtn.setContentAreaFilled(false);
		menu_searchBtn.setFocusPainted(false);
		
		menu_editBtn.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/editbtn.png")));
		menu_editBtn.setBorderPainted(false);
		menu_editBtn.setContentAreaFilled(false);
		menu_editBtn.setFocusPainted(false);
		
		menu_personBtn.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/existbtn.png")));
		menu_personBtn.setBorderPainted(false);
		menu_personBtn.setContentAreaFilled(false);
		menu_personBtn.setFocusPainted(false);
		
		menu_joinBtn.setIcon(new ImageIcon(WineProjectMain.class.getResource("/images/nonexistbtn.png")));
		menu_joinBtn.setBorderPainted(false);
		menu_joinBtn.setContentAreaFilled(false);
		menu_joinBtn.setFocusPainted(false);
	}
	
	public WineVO searchByWineName(String wineName) {	
		wineName = wineName.toLowerCase();
		try {
			resultVO = dao.selectWine("%" + wineName + "%");
			if(resultVO == null) {				
				resultVO = dao.select(wineName);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
//		if(resultVO == null) {
//			PopUpFrame pop = new PopUpFrame();
//			pop.setContentPane(nonExistPanel);
//			pop.setVisible(true);
//		}
		resultWineID = resultVO.getWine_id();
		
		return resultVO;
	}	
	
	public void printSearchResult(WineVO resultVO) {
		if(currentPanel.equals("searchPanel")) {
			searchPanel.wineNameArea.setText(resultVO.getWine_name());
			searchPanel.wineTypeArea.setText(resultVO.getWine_type());
			searchPanel.wineGrapeArea.setText(resultVO.getGrapes());
			searchPanel.wineRegionArea.setText(resultVO.getRegion());
			searchPanel.wineSugarArea.setText(resultVO.getSugar_content());
			searchPanel.wineAlcoholArea.setText(String.valueOf(resultVO.getAlcohol()));
			searchPanel.wineBodyArea.setText(resultVO.getBody());	
		} else if(currentPanel.equals("listPanel")) {
			listPanel.wineNameArea.setText(resultVO.getWine_name());
			listPanel.wineTypeArea.setText(resultVO.getWine_type());
			listPanel.wineGrapeArea.setText(resultVO.getGrapes());
			listPanel.wineRegionArea.setText(resultVO.getRegion());
			listPanel.wineSugarArea.setText(resultVO.getSugar_content());
			listPanel.wineAlcoholArea.setText(String.valueOf(resultVO.getAlcohol()));
			listPanel.wineBodyArea.setText(resultVO.getBody());			
		} else if(currentPanel.equals("existPanel")) {
			existPanel.wineNameArea.setText(resultVO.getWine_name());
			existPanel.wineTypeArea.setText(resultVO.getWine_type());
			existPanel.wineGrapeArea.setText(resultVO.getGrapes());
			existPanel.wineRegionArea.setText(resultVO.getRegion());
			existPanel.wineSugarArea.setText(resultVO.getSugar_content());
			existPanel.wineAlcoholArea.setText(String.valueOf(resultVO.getAlcohol()));
			existPanel.wineBodyArea.setText(resultVO.getBody());			
		}		
	}	
	
	public void repaintFrame() {
		frame.getContentPane().removeAll();		
		frame.getContentPane().add(menuBtnPanel);
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();		
	}
	public void updateWine(int resultWineID) throws Exception {
		JFileChooser chooser =new JFileChooser("C:/Users");
		chooser.showOpenDialog(frame);
		String fileName = chooser.getSelectedFile().getName();
		int fileSize = (int)chooser.getSelectedFile().length();
		File file = chooser.getSelectedFile();
		BufferedImage bi = ImageIO.read(file);		
		
		int w_id = resultWineID;
		String w_name = searchPanel.wineNameArea.getText();
		String grapes = searchPanel.wineGrapeArea.getText();
		String region = searchPanel.wineRegionArea.getText();
		int alcohol = Integer.parseInt(searchPanel.wineAlcoholArea.getText());
		String sugar = (String) searchPanel.wineSugarArea.getText();
		String body = (String) searchPanel.wineBodyArea.getText();
		String w_type = (String) searchPanel.wineTypeArea.getText();
		
		
		WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar, bi);
		int result = dao.updateWine(w_vo);
		if(result == SUCCESS) {
			System.out.println("업데이트 성공");
		} else {
			System.out.println("업데이트 실패");
		}
		
	}
	public void insertWine() throws Exception {	
		
		String w_name = editPanel.wineNameArea.getText();
		String grapes = editPanel.wineGrapeArea.getText();
		String region = editPanel.wineRegionArea.getText();
		int alcohol = Integer.parseInt(editPanel.wineAlcoholArea.getText());
		String sugar = (String) editPanel.wineSugarArea.getSelectedItem();
		String body = (String)editPanel.wineBodyArea.getSelectedItem();
		String w_type = (String)editPanel.wineTypeArea.getSelectedItem();		
		BufferedImage bi = editPanel.bi;
		wineCount++;
		int w_id = wineCount;		
		if(!w_name.equals("") && !grapes.equals("") && !region.equals("") && alcohol != 0 
				&& !sugar.equals("") && !body.equals("") && !w_type.equals("")) {
			
			WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar, bi);
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
	
	public void orderByRegion() throws Exception {
		ArrayList<WineVO> winelist = dao.selectWineOrderByRegion();
		String buffer = null;
		listData = new String[wineCount];		
		for(int i = 0; i < winelist.size(); i++) {
			buffer = winelist.get(i).getWine_name() + " | " + winelist.get(i).getRegion();
			listData[i] = buffer;	
		}
		listPanel.wineList.setListData(listData);
	}
	
	public void orderByGrapes() throws Exception{
		ArrayList<WineVO> winelist = dao.selectWineOrderByGrapes();
		String buffer = null;
		listData = new String[wineCount];		
		for(int i = 0; i < winelist.size(); i++) {
			buffer = winelist.get(i).getWine_name() + " | " + winelist.get(i).getGrapes();
			listData[i] = buffer;	
		}
		listPanel.wineList.setListData(listData);		
	}
	
	public void insertPerson() {
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
	
	public void setBestWineList() throws Exception {
		ArrayList<WineVO> winelist = dao.selectBestWine();
		String buffer = null;
		bestWine = new String[3];
		for(int i = 0; i < 3; i++) {
			buffer = winelist.get(i).getWine_name();
			bestWine[i] = buffer;	
			System.out.println(bestWine[i]);
		}
	}


//	public void insertImg() throws Exception{
//		imgnum = Integer.parseInt(searchPanel.imgNum.getText());
//		JFileChooser chooser =new JFileChooser("C:/Users/Jiyoung/Desktop/DBimage");
//		chooser.showOpenDialog(frame);
//		String fileName = chooser.getSelectedFile().getName();
//		int fileSize = (int)chooser.getSelectedFile().length();
//		File file = chooser.getSelectedFile();
//		BufferedImage bi = ImageIO.read(file);
//		ImageVO vo = new ImageVO(imgnum, bi);
//		System.out.println(fileName);
//		
//		dao.insertImage(vo);	
//		
//	}
	public void printImg(String currentPanel) {
		if(currentPanel.equals("searchPanel")) {
			try {
				searchPanel.bi = dao.getImage(resultWineID);
				searchPanel.winePicArea.repaint();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else if(currentPanel.equals("existPanel")) {
			try {
				existPanel.bi = dao.getImage(resultWineID);
				existPanel.winePicArea.repaint();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(currentPanel.equals("editPanel")) {
			try {
				editPanel.bi = dao.getImage(resultWineID);
				editPanel.winePicArea.repaint();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public BufferedImage chooseImg() {
		BufferedImage chooseImg = null;
		JFileChooser chooser =new JFileChooser("C:/Users");
		chooser.showOpenDialog(frame);
		String fileName = chooser.getSelectedFile().getName();
		int fileSize = (int)chooser.getSelectedFile().length();
		File file = chooser.getSelectedFile();
	
		try {
			chooseImg = ImageIO.read(file);
		} catch (NullPointerException e) {
			System.out.println("파일이 선택되지 않음");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return chooseImg;
		
	}

}
