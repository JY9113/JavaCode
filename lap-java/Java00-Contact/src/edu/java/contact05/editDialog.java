package edu.java.contact05;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class editDialog extends JPanel {
	private JTextField editNameField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public editDialog() {
		setLayout(null);
		
		JLabel lblEditName = new JLabel("이름");
		lblEditName.setBounds(33, 20, 35, 15);
		add(lblEditName);
		
		editNameField = new JTextField();
		editNameField.setBounds(80, 17, 126, 21);
		add(editNameField);
		editNameField.setColumns(10);
		
		JLabel lblEditPhone = new JLabel("전화번호");
		lblEditPhone.setBounds(218, 20, 54, 15);
		add(lblEditPhone);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(284, 17, 152, 21);
		add(textField);
		
		JLabel lblEditEmail = new JLabel("이메일");
		lblEditEmail.setBounds(33, 61, 57, 15);
		add(lblEditEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 58, 356, 21);
		add(textField_1);
		textField_1.setColumns(10);

	}
}
