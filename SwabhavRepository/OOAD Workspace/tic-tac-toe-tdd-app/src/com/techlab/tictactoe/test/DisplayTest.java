package com.techlab.tictactoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.IBoard;
import com.techlab.tictactoe.presentation.Display;

class DisplayTest {

	Display display = new Display();
	IBoard board = new Board();
	
	@Test
	public void testConsole() {

		String result = board.getCellMark(0) + " | " + board.getCellMark(1) + " | " + board.getCellMark(2) + "\n"
				+ "----------\n" + board.getCellMark(3) + " | " + board.getCellMark(4) + " | " + board.getCellMark(5)
				+ "\n" + "----------\n" + board.getCellMark(6) + " | " + board.getCellMark(7) + " | "
				+ board.getCellMark(8) + "\n";

		assertEquals(result, display.printGrid(board));
	}

}
