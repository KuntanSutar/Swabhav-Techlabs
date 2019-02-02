package com.techlab.tictactoe.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StartPage extends JFrame {

	private JLabel label1, label2;
	private JTextField textField1, textField2;
	private JButton button;
	
	public StartPage() {

		label1=new JLabel("Player 1");
		label2=new JLabel("Player 2");
		
		label1.setBounds(30, 40, 100, 60);
		label2.setBounds(30, 80, 100, 60);
		
		textField1=new JTextField();
		textField2=new JTextField();
		textField1.setBounds(100, 50, 200, 30);
		textField2.setBounds(100, 100, 200, 30);
		button=new JButton("OK");
		
		button.setBounds(140, 150, 100, 30);
		button.addActionListener(new OKListener(this));
		add(label1);
		add(label2);
		add(textField1);
		add(textField2);
		add(button);
		
		setLayout(null);
		setSize(400, 300);
		setVisible(true);
	}
}
