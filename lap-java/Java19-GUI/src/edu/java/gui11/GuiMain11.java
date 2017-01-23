package edu.java.gui11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class GuiMain11 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain11 window = new GuiMain11();
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
	public GuiMain11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JFileChooser : 파일을 선택할 수 있는 팝업 창
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					System.out.println("파일 선택");
					File selected = chooser.getSelectedFile();
				} else if( result == JFileChooser.CANCEL_OPTION) {
					System.out.println("취소");
				}
				
			}
		});
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ConfirmDialog : 
				// YES(확인) - Cancel (취소) 버튼을 갖는 다이얼로그
//				int result = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				int result = JOptionPane.showConfirmDialog(frame, "종료하시겠습니까?", "종료메세지", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else if(result == JOptionPane.NO_OPTION) {
					System.out.println("취소");
				}
				// 프로그램 종료
				// System.exit(0);  정상 종료
				// System.exit(0 이외의 숫자); 비정상 종료
				
				
				
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		      menuBar.add(mnHelp);
		      
		      JMenuItem mntmAbout = new JMenuItem("About");
		      mntmAbout.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            // 메시지와 OK 버튼만 있는 다이얼로그: MessageDialog
//		            JOptionPane.showMessageDialog(frame, "버전 1.0");
//		            JOptionPane.showMessageDialog(null, "버전 1.0");
		            // 매개변수 parentComponent:
		            // MessageDialog의 부모 콤포넌트를 설정
		            // 설정이 되어 있으면, 다이얼로그는 부모창의 가운데에 보임
		            // null 로 되어 있으면, 화면의 중앙에 보임
		       	  JOptionPane.showMessageDialog(frame, "버전 1.0", "정보", JOptionPane.INFORMATION_MESSAGE);
		       	  
		     
		         }
		      });
		      mnHelp.add(mntmAbout);
	}

}
