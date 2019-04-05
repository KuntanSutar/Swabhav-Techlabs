package com.techlab.tictactoe;

public class Game {
	public IBoard board = new Board();
	private Player player1, player2;
	private IResultAnalyser resultAnalyser;
	private Player currentPlayer;

	public Game(Player player1, Player player2, IResultAnalyser resultAnalyser) {
		this.player1 = player1;
		this.player2 = player2;
		this.resultAnalyser = resultAnalyser;
		currentPlayer = player1;
	}

	public Game(Player player12, Player player22) {
		// TODO Auto-generated constructor stub
	}

	public GameState play(int cellNumber) {

		if (board.isCellEmpty(cellNumber)) {
			board.setCellMark(cellNumber, getMark());
			switchPlayer();
			return resultAnalyser.hasWon(this);
		} else {
			return GameState.INVALID;
		}
	}

	public Player switchPlayer() {
		if (getCurrentPlayer() == player1) {
			setCurrentPlayer(player2);
			return getCurrentPlayer();
		} else {
			setCurrentPlayer(player1);
			return getCurrentPlayer();
		}
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Mark getMark() {
		if (getCurrentPlayer().equals(player1))
			return Mark.CROSS;
		else if (getCurrentPlayer().equals(player2))
			return Mark.NOUGHT;
		return Mark.EMPTY;
	}

}
