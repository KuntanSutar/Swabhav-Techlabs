package com.techlab.tictactoe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.tictactoe.Cell;
import com.techlab.tictactoe.Mark;

class CellTest {

	Cell cell = new Cell();

	@Test
	public void testCellMark() {
		cell.setMark(Mark.CROSS);
		assertEquals(Mark.CROSS, cell.getMark());
	}

}
