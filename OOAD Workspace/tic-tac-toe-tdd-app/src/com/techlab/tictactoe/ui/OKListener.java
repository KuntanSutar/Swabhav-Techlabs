package com.techlab.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OKListener implements ActionListener {

	private StartPage startPage;
	
	public OKListener(StartPage newStartPage) {
		startPage=newStartPage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PlayBoard playBoard = new PlayBoard();
		playBoard.setVisible(true);
	}

}
