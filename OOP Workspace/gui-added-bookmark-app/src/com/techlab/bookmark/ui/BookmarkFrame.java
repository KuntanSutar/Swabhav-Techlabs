package com.techlab.bookmark.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BookmarkFrame extends JFrame {

	private JLabel description;
	private JLabel url;
	private JTextField textFiled1, textField2;
	private JButton addButton, displayButton;
	private Font font1;

	public BookmarkFrame() {

		setTitle("Bookmark : Powered by KSS");
		description = new JLabel("URL Discription : ");
		url = new JLabel("URL Address : ");
		description.setBounds(50, 50, 100, 30);
		url.setBounds(50, 100, 100, 30);

		textFiled1 = new JTextField();
		textField2 = new JTextField();
		textFiled1.setBounds(150, 50, 600, 30);
		textField2.setBounds(150, 100, 600, 30);

		addButton=new JButton("ADD");
		addButton.setBounds(150, 150, 60, 30);
		addButton.addActionListener(new AddListener(this));
		
		displayButton=new JButton("DISPLAY");
		displayButton.setBounds(230, 150, 90, 30);
		displayButton.addActionListener(new DisplayListener(this));
		
		add(url);
		add(description);
		add(textFiled1);
		add(textField2);
		add(addButton);
		add(displayButton);
		
		setLayout(null);
		setSize(1000, 700);
		setVisible(true);
	}
	
	public JTextField getTextFiled1() {
		return textFiled1;
	}

	public JTextField getTextField2() {
		return textField2;
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.BLACK);  
		g.drawLine(0, 240, 1000, 240);
	}
}
