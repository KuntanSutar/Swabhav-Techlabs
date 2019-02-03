package com.techlab.tictactoe.ui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.techlab.tictactoe.business.Game;
import com.techlab.tictactoe.business.Player;
import com.techlab.tictactoe.business.ResultAnalyser;

public class StartPage extends JFrame {

	private JLabel label1, label2;
	private JTextField textField1, textField2;
	private JButton button;
	private Game game; 
	private String player1Name, player2Name;
	
	public StartPage() {

		setTitle("Start Page");
		label1=new JLabel("Player 1:");
		label2=new JLabel("Player 2:");
		label1.setBounds(30, 40, 100, 60);
		label2.setBounds(30, 80, 100, 60);
		
		textField1=new JTextField();
		textField2=new JTextField();
		textField1.setBounds(100, 50, 200, 30);
		textField2.setBounds(100, 100, 200, 30);
		player1Name=textField1.getText();
		player2Name=textField2.getText();
		textField1.setVisible(true);
		textField2.setVisible(true);
		
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

	public JLabel getLabel1() {
		return label1;
	}

	public String getPlayer1Name() {
		return player1Name;
	}

	public String getPlayer2Name() {
		return player2Name;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JTextField getTextField1() {
		return textField1;
	}

	public JTextField getTextField2() {
		return textField2;
	}

	public JButton getButton() {
		return button;
	}

	public Game getGame() {
		return game;
	}
}
