package com.techlab.tictactoe.test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.tictactoe.business.Board;
import com.techlab.tictactoe.business.IBoard;
import com.techlab.tictactoe.business.Mark;

class BoardTest {

	Mark mark = Mark.CROSS;
	IBoard board = new Board();

	@Test
	public void testSetterGetterOfCellMark() {
		board.setCellMark(1, mark);
		assertEquals(mark, board.getCellMark(1));
	}

	@Test
	public void testIsCellEmpty() {
		assertEquals(true, board.isCellEmpty(1));
	}

	@Test
	public void testIsCellEmptyFalse() {
		board.setCellMark(1, mark);
		assertEquals(false, board.isCellEmpty(1));
	}

	@Test
	public void testIsBoardFull() {
		for (int i = 0; i < 9; i++) {
			board.setCellMark(i, mark);
		}
		assertEquals(true, board.isBoardFull());
	}

	@Test
	public void testIsBoardFullFalse() {
		assertEquals(false, board.isBoardFull());
	}
}
