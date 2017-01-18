package edu.java.contact05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import edu.java.contact05.ContactVO;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ContactMain05 {
	
	private ContactDAO dao;
	private JFrame frame;
	private JTextField textIndex;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextArea textArea;
	private static final int SUCCESS = 1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain05 window = new ContactMain05();
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
	public ContactMain05() {
		dao = ContactDAOImple.getInstance();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("연락처 Version 0.5");
		lblTitle.setBorder(new LineBorder(new Color(119, 136, 153), 3));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("서울남산 장체BL", Font.BOLD, 20));
		lblTitle.setBounds(12, 10, 460, 66);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblIndex = new JLabel("Index");
		lblIndex.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndex.setBorder(new LineBorder(new Color(211, 211, 211)));
		lblIndex.setBounds(12, 86, 120, 40);
		frame.getContentPane().add(lblIndex);
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBorder(new LineBorder(new Color(211, 211, 211)));
		lblName.setBounds(12, 136, 120, 40);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setBorder(new LineBorder(new Color(211, 211, 211)));
		lblPhone.setBounds(12, 186, 120, 40);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBorder(new LineBorder(new Color(211, 211, 211)));
		lblEmail.setBounds(12, 236, 120, 40);
		frame.getContentPane().add(lblEmail);
		
		textIndex = new JTextField();
		textIndex.setBounds(166, 86, 306, 40);
		frame.getContentPane().add(textIndex);
		textIndex.setColumns(10);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(166, 137, 306, 40);
		frame.getContentPane().add(textName);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(166, 187, 306, 40);
		frame.getContentPane().add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(166, 237, 306, 40);
		frame.getContentPane().add(textEmail);
		
		JButton btnSearch = new JButton("전체검색");
		btnSearch.addActionListener(new ActionListener() {
			@Override // 전체 검색 버튼 클릭 시 기능 구현
			public void actionPerformed(ActionEvent e) {
				printAllContacts();
				initTextField();
			}
		});
		btnSearch.setBackground(new Color(211, 211, 211));
		btnSearch.setBounds(12, 286, 231, 35);
		frame.getContentPane().add(btnSearch);
		
		JButton btnIndexSearch = new JButton("인덱스 검색");
		btnIndexSearch.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				searchByIndex();
			}
		});
		btnIndexSearch.setBackground(new Color(211, 211, 211));
		btnIndexSearch.setBounds(241, 286, 231, 35);
		frame.getContentPane().add(btnIndexSearch);
		
		JButton btnInsert = new JButton("등록");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertContact();
				initTextField();
			}
		});
		btnInsert.setBackground(new Color(211, 211, 211));
		btnInsert.setBounds(12, 320, 155, 30);
		frame.getContentPane().add(btnInsert);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				editContact();
			}
		});
		btnUpdate.setBackground(new Color(211, 211, 211));
		btnUpdate.setBounds(165, 320, 155, 30);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteByIndex();
			}
		});
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.setBackground(new Color(211, 211, 211));
		btnDelete.setBounds(317, 320, 155, 30);
		frame.getContentPane().add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 356, 460, 200);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	} // end initialize()
	
	private void printAllContacts() {
		ArrayList<ContactVO> list = dao.selectAll();
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < list.size(); i++) {
			buffer.append("[" + i + "]").append(list.get(i).toString()).append("\n");			
		}
		textArea.setText(buffer.toString());
	}
	
	private void insertContact() {
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
		if(!name.equals("") && !phone.equals("") && !email.equals("")) {
			ContactVO vo = new ContactVO(name, phone, email);
			
			int result = dao.insert(vo);
			if(result == SUCCESS) {
				textArea.setText("연락처 등록 성공");
			} else {
				textArea.setText("연락처 등록 실패");
			}
		}		
	}
	
	private void searchByIndex() {
		int indexNum = Integer.parseInt(textIndex.getText());
		try {
			if (indexNum < dao.selectAll().size() && indexNum >= 0) {
				ContactVO contact = dao.select((indexNum));		
				textArea.setText(contact.toString());		
			} 			
		} catch (Exception e) {
			
		}
	}
	
	private void editContact() {
		int indexNum = Integer.parseInt(textIndex.getText());
		String name, phone, email;
			
		name = textName.getText();
		phone = textPhone.getText();
		email = textEmail.getText();
		
		ContactVO contact = new ContactVO(name, phone, email);

		int result = dao.update(indexNum, contact);
		if(result == SUCCESS) {
			textArea.setText("수정 성공");
		} else {
			textArea.setText("수정 실패");
		}

		
	}
	private void deleteByIndex() {
		int indexNum = Integer.parseInt(textIndex.getText());
		int result = dao.delete(indexNum);
		if(result == SUCCESS) {
			textArea.setText("삭제 성공");
		} else {
			textArea.setText("삭제 실패");
		}
	}
	
	private void initTextField() {
		textIndex.setText("");
		textName.setText("");
		textPhone.setText("");
		textEmail.setText("");
	}

} // end class ContactMain05



















