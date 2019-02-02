package com.techlab.login.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginActionListener implements ActionListener {

	private LoginForm loginForm;
	
	public LoginActionListener(LoginForm newLoginForm) {
		loginForm=newLoginForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String username = loginForm.getTextField1().getText();
		String password = loginForm.getPasswordField().getText();
		if (username.equalsIgnoreCase("Kuntan") && password.equals("8051micro")) {
			Welcome wel = new Welcome();
			wel.setVisible(true);
			JLabel label = new JLabel("Welcome:" + username);
			wel.getContentPane().add(label);
		} else {
			JOptionPane.showMessageDialog(loginForm, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
