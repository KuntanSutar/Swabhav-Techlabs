package com.techlab.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.techlab.tictactoe.business.Game;

public class OKListener implements ActionListener {

	private Game game;
	StartPage startPage;

	public OKListener(StartPage newStartPage) {
		startPage = newStartPage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PlayBoard playBoard = new PlayBoard(startPage);
	}

}
