package com.techlab.tictactoe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.GameState;
import com.techlab.tictactoe.IBoard;
import com.techlab.tictactoe.IResultAnalyser;
import com.techlab.tictactoe.Mark;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.ResultAnalyser;

class ResultAnalyserTest {

	IResultAnalyser resultAnalyser = new ResultAnalyser();
	Mark mark = Mark.CROSS;
	Player player1, player2;
	Game game = new Game(player1, player2, new ResultAnalyser());
	IBoard board = game.board;

	@Test
	public void testHasWon() {
		board.setCellMark(0, mark);
		board.setCellMark(1, mark);
		board.setCellMark(2, mark);
		assertEquals(GameState.WON, resultAnalyser.hasWon(game));
	}

	@Test
	public void testHasDraw() {
		board.setCellMark(0, mark);
		board.setCellMark(1, Mark.NOUGHT);
		board.setCellMark(2, Mark.NOUGHT);
		board.setCellMark(3, Mark.NOUGHT);
		board.setCellMark(4, mark);
		board.setCellMark(5, mark);
		board.setCellMark(6, Mark.NOUGHT);
		board.setCellMark(7, mark);
		board.setCellMark(8, Mark.NOUGHT);	
		assertEquals(GameState.DRAW, resultAnalyser.hasWon(game));
	}

	@Test
	public void testStatusPlaying() {
		assertEquals(GameState.INPROGRESS, resultAnalyser.hasWon(game));
	}

	@Test
	public void testResultAnalyzerFirstHorizontalLineMatched() {
		board.setCellMark(0, mark);
		board.setCellMark(1, mark);
		board.setCellMark(2, mark);
		assertEquals(true, resultAnalyser.isFirstHorizontalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerFirstHorizontalLineMatchedWithFalse() {
		assertEquals(false, resultAnalyser.isFirstHorizontalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerSecondHorizontalLineMatched() {
		board.setCellMark(3, mark);
		board.setCellMark(4, mark);
		board.setCellMark(5, mark);
		assertEquals(true, resultAnalyser.isSecondHorizontalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerSecondHorizontalLineMatchedWithFalse() {
		assertEquals(false, resultAnalyser.isSecondHorizontalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerThirdHorizontal() {
		board.setCellMark(6, mark);
		board.setCellMark(7, mark);
		board.setCellMark(8, mark);
		assertEquals(true, resultAnalyser.isThirdHorizontalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerThirdHorizontalFalse() {
		assertEquals(false, resultAnalyser.isThirdHorizontalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerFirstVertical() {
		board.setCellMark(0, mark);
		board.setCellMark(3, mark);
		board.setCellMark(6, mark);
		assertEquals(true, resultAnalyser.isFirstVerticalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerFirstVerticalFalse() {
		assertEquals(false, resultAnalyser.isFirstVerticalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerSecondVertical() {
		board.setCellMark(1, mark);
		board.setCellMark(4, mark);
		board.setCellMark(7, mark);
		assertEquals(true, resultAnalyser.isSecondVerticalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerSecondVerticalFalse() {
		assertEquals(false, resultAnalyser.isSecondVerticalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerThirdVerical() {
		board.setCellMark(2, mark);
		board.setCellMark(5, mark);
		board.setCellMark(8, mark);
		assertEquals(true, resultAnalyser.isThirdVerticalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerThirdVericalFalse() {
		assertEquals(false, resultAnalyser.isThirdVerticalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerFirstDiagonal() {
		board.setCellMark(0, mark);
		board.setCellMark(4, mark);
		board.setCellMark(8, mark);
		assertEquals(true, resultAnalyser.isFirstDiagonalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerFirstDiagonalFalse() {
		assertEquals(false, resultAnalyser.isFirstDiagonalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerSecondDiagonal() {
		board.setCellMark(2, mark);
		board.setCellMark(4, mark);
		board.setCellMark(6, mark);
		assertEquals(true, resultAnalyser.isSecondDiagonalLineMatched(board));
	}

	@Test
	public void testResultAnalyzerSecondDiagonalFalse() {
		assertEquals(false, resultAnalyser.isSecondDiagonalLineMatched(board));
	}

}
