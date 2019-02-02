package com.techlab.tictactoe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.tictactoe.Board;
import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.GameState;
import com.techlab.tictactoe.IBoard;
import com.techlab.tictactoe.Mark;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.ResultAnalyser;

class GameTest {

	private Player player1 = new Player();
	private Player player2 = new Player();
	private Game game = new Game(player1, player2, new ResultAnalyser());
	Mark mark1 = Mark.NOUGHT;
	Mark mark2 = Mark.CROSS;
	public IBoard board = new Board();
	
	@Test
	public void testPlayInProgress() {
		GameState gameState = game.play(0);
		assertEquals(GameState.INPROGRESS, gameState);
		Player expectedPlayer = game.switchPlayer();
		assertEquals(expectedPlayer, player1);
	}
	
	@Test
	public void testPlayWon() {
		game.play(0);
		game.play(3);
		game.play(1);
		game.play(4);
		game.play(2);
		GameState gameState=game.play(8);
		assertEquals(GameState.WON, gameState);
	}
	
	@Test
	public void testPlayDraw() {
		game.play(0);
		game.play(3);
		game.play(1);
		game.play(4);
		game.play(2);
		game.play(5);
		GameState gameState=game.play(1);
		assertEquals(GameState.DRAW, gameState);
	}
	
	@Test
	public void testSettersAndGettersOfCurrentPlayer() {
		Player expectedPlayer1 = game.getCurrentPlayer();
		assertEquals(expectedPlayer1, player1);
		game.setCurrentPlayer(player2);
		Player expectedPlayer2 = game.getCurrentPlayer();
		assertEquals(expectedPlayer2, player2);
	}
	
	@Test
	public void testGetMark() {
		Mark expectedMark = game.getMark();
		game.play(0);
		assertEquals(expectedMark, Mark.CROSS);
	}
}
