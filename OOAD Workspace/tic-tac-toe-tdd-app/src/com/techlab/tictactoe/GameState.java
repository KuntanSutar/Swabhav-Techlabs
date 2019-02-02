package com.techlab.tictactoe;

public enum GameState {

	INPROGRESS, WON, DRAW, INVALID;

	public String toString() {
		switch (this) {
		case INPROGRESS:
			return "Playing";
		case WON:
			return "Won";
		case DRAW:
			return "Draw";
		case INVALID:
			return "Invalid Input";
		default:
			return null;
		}
	}
}
