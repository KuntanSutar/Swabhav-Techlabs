package com.techlab.tictactoe.presentation;

import com.techlab.tictactoe.business.IBoard;

public class Display {

	public String printGrid(IBoard board) {
		String result = board.getCellMark(0) + " | " + board.getCellMark(1) + " | " + board.getCellMark(2) + "\n"
				+ "----------\n" + board.getCellMark(3) + " | " + board.getCellMark(4) + " | " + board.getCellMark(5)
				+ "\n" + "----------\n" + board.getCellMark(6) + " | " + board.getCellMark(7) + " | "
				+ board.getCellMark(8) + "\n";

		return result;
	}
}
