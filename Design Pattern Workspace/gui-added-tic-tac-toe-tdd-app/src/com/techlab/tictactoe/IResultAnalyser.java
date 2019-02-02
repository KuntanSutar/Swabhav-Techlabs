package com.techlab.tictactoe;

public interface IResultAnalyser {

	GameState hasWon(Game game);

	boolean isFirstHorizontalLineMatched(IBoard board);

	boolean isSecondHorizontalLineMatched(IBoard board);

	boolean isThirdHorizontalLineMatched(IBoard board);

	boolean isFirstVerticalLineMatched(IBoard board);

	boolean isSecondVerticalLineMatched(IBoard board);

	boolean isThirdVerticalLineMatched(IBoard board);

	boolean isFirstDiagonalLineMatched(IBoard board);

	boolean isSecondDiagonalLineMatched(IBoard board);

}