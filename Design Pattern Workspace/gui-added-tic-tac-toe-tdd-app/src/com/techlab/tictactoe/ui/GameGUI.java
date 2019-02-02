package com.techlab.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.GameState;
import com.techlab.tictactoe.Mark;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.ResultAnalyser;
import com.techlab.tictactoe.presentation.Display;

public class GameGUI implements ActionListener {
	
	private Game game;
	private PlayBoard playBoard;
	private JButton button;
	private StartPage startPage;
	Player player1, player2;
	
	public GameGUI(PlayBoard newPlayBoard, StartPage newStartPage) {
		//game=newGame;
		playBoard=newPlayBoard;
		startPage=newStartPage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		
		String firstPlayer=startPage.getPlayer1Name();
		String secondPlayer=startPage.getPlayer2Name();
		player1=new Player(firstPlayer);
		player2=new Player(secondPlayer);
		ResultAnalyser resultAnalyser = new ResultAnalyser();
		game=new Game(player1, player2, resultAnalyser);
		
		int userInput=Integer.parseInt(e.getActionCommand());
		String currentPlayerName = game.getCurrentPlayer().getPlayerName();
		int index = userInput-1;
		
		GameState gameState = game.play(index);
		playBoard.setText(currentPlayerName);
		Mark mark = game.getBoard().getCellMark(index);
		
		button = (JButton) e.getSource();
		if(mark==Mark.CROSS) {
			button.setText("X");
		}
		if(mark==Mark.NOUGHT) {
			button.setText("O");
		}
		
		if(gameState==GameState.WON) {
			JFrame popUpFrame = new JFrame();
			JOptionPane.showConfirmDialog(popUpFrame, currentPlayerName+" WON!!!");
		}
	}
}


