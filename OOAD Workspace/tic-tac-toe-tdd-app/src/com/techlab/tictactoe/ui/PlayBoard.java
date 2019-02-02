package com.techlab.tictactoe.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayBoard extends JFrame {

	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	JLabel label;
	
	public PlayBoard() {
		
		button1=new JButton("1");
		button2=new JButton("2");
		button3=new JButton("3");
		button4=new JButton("4");
		button5=new JButton("5");
		button6=new JButton("6");
		button7=new JButton("7");
		button8=new JButton("8");
		button9=new JButton("9");
		button1.setBounds(50, 50, 50, 50);
		button2.setBounds(120, 50, 50, 50);
		button3.setBounds(190, 50, 50, 50);
		button4.setBounds(50, 120, 50, 50);
		button5.setBounds(120, 120, 50, 50);
		button6.setBounds(190, 120, 50, 50);
		button7.setBounds(50, 190, 50, 50);
		button8.setBounds(120, 190, 50, 50);
		button9.setBounds(190, 190, 50, 50);
		label=new JLabel("Current Player : ");
		label.setBounds(50, 250, 100, 50);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(label);
		button1.addActionListener(new GameGUI(this));
		setLayout(null);
		setSize(300, 400);
		setVisible(true);
	}
}
