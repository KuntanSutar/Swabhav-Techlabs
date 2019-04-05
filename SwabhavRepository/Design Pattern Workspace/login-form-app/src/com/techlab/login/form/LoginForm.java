package com.techlab.login.form;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {

	JLabel label1, label2, label3;
	JButton button;
	JTextField textField1;
	JPasswordField passwordField;

	public LoginForm() {

		label1 = new JLabel("Login Form");
		label1.setForeground(Color.BLUE);
		label1.setFont(new Font("Serif", Font.BOLD, 20));
		label2 = new JLabel("Username");
		label3 = new JLabel("Password");
		textField1 = new JTextField();
		passwordField = new JPasswordField();
		button = new JButton("Login");
		button.addActionListener(new LoginActionListener(this));

		label1.setBounds(220, 30, 400, 30);
		label2.setBounds(80, 70, 200, 30);
		label3.setBounds(80, 110, 200, 30);
		textField1.setBounds(300, 70, 200, 30);
		passwordField.setBounds(300, 110, 200, 30);
		button.setBounds(220, 160, 100, 30);

		add(label1);
		add(label2);
		add(label3);
		add(textField1);
		add(passwordField);
		add(button);

		setSize(580, 300);
		setLayout(null);
		setVisible(true);
	}

	public JLabel getLabel1() {
		return label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JLabel getLabel3() {
		return label3;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getTextField1() {
		return textField1;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

}
