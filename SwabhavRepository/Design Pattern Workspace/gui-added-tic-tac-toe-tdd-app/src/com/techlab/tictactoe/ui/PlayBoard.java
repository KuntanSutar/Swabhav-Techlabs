package com.techlab.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.techlab.tictactoe.business.Game;
import com.techlab.tictactoe.business.GameState;
import com.techlab.tictactoe.business.Mark;
import com.techlab.tictactoe.business.Player;
import com.techlab.tictactoe.business.ResultAnalyser;

public class PlayBoard extends JFrame implements ActionListener {

	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	private JButton button;
	private JLabel label;
	private String firstPlayer, secondPlayer;
	private JTextField textField;
	private Game game;
	private StartPage startPage;

	public PlayBoard(StartPage newStartPage) {

		startPage = newStartPage;
		
		firstPlayer=startPage.getTextField1().getText();
		secondPlayer=startPage.getTextField2().getText();
		Player player1=new Player(firstPlayer);
		Player player2=new Player(secondPlayer);
		ResultAnalyser resultAnalyser = new ResultAnalyser();
		game=new Game(player1, player2, resultAnalyser);
		
		setTitle("Play Board");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button1.setBounds(50, 50, 50, 50);
		button2.setBounds(120, 50, 50, 50);
		button3.setBounds(190, 50, 50, 50);
		button4.setBounds(50, 120, 50, 50);
		button5.setBounds(120, 120, 50, 50);
		button6.setBounds(190, 120, 50, 50);
		button7.setBounds(50, 190, 50, 50);
		button8.setBounds(120, 190, 50, 50);
		button9.setBounds(190, 190, 50, 50);
		label = new JLabel("Current Player : ");
		label.setBounds(50, 250, 100, 50);
		textField = new JTextField();
		textField.setText(firstPlayer);
		textField.setBounds(150, 265, 90, 20);
		textField.setVisible(true);
		add(textField);
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
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);

		setLayout(null);
		setSize(300, 400);
		setVisible(true);
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public JButton getButton4() {
		return button4;
	}

	public JButton getButton5() {
		return button5;
	}

	public JButton getButton6() {
		return button6;
	}

	public JButton getButton7() {
		return button7;
	}

	public JButton getButton8() {
		return button8;
	}

	public JButton getButton9() {
		return button9;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setText(String currentPlayerName) {
		textField.setText(currentPlayerName);
	}

	public JTextField getTextField() {
		return textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int userInput=Integer.parseInt(e.getActionCommand());
		int index = userInput-1;
		
		GameState gameState = game.play(index);
		String currentPlayerName = game.getCurrentPlayer().getPlayerName();
		textField.setText(currentPlayerName);
		Mark mark = game.getBoard().getCellMark(index);
		
		String cross = "data\\CROSS.jpg";
		String nought = "data\\NOUGHT.jpg";

		ImageIcon imageIconCross = new ImageIcon(cross);
		ImageIcon imageIconNought = new ImageIcon(nought);
		
		button = (JButton) e.getSource();
		if(Mark.CROSS==mark) {
			button.setText("X");
			//button.setIcon(imageIconCross);
			button.setEnabled(false);
		}
		if(Mark.NOUGHT==mark) {
			button.setText("O");
			//button.setIcon(imageIconNought);
			button.setEnabled(false);
		}
		
		if(gameState==GameState.WON) {
			Player playerWon=game.switchPlayer();
			String wonPlayerName=playerWon.getPlayerName();
			JFrame popUpFrame = new JFrame();
			JOptionPane.showMessageDialog(popUpFrame, wonPlayerName+" "+gameState);
		}
		
		if(gameState==GameState.DRAW) {
			
			JFrame popUpFrame = new JFrame();
			JOptionPane.showMessageDialog(popUpFrame, "Match "+gameState);
		}
	}
}
