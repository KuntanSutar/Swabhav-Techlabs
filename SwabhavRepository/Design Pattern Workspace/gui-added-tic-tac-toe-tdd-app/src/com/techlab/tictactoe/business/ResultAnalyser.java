package com.techlab.tictactoe.business;

public class ResultAnalyser implements IResultAnalyser {

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#hasWon(com.techlab.tictactoe.Game)
	 */
	@Override
	public GameState hasWon(Game game) {
		if ((isFirstHorizontalLineMatched(game.board)) || (isSecondHorizontalLineMatched(game.board)) || (isThirdHorizontalLineMatched(game.board))
				|| (isFirstVerticalLineMatched(game.board)) || (isSecondVerticalLineMatched(game.board)) || (isThirdVerticalLineMatched(game.board))
				|| (isFirstDiagonalLineMatched(game.board)) || (isSecondDiagonalLineMatched(game.board))) {
			return GameState.WON;
		} else if (game.board.isBoardFull()) {
			return GameState.DRAW;
		} else {
			return GameState.INPROGRESS;
		}
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#isFirstHorizontalLineMatched(com.techlab.tictactoe.IBoard)
	 */
	@Override
	public boolean isFirstHorizontalLineMatched(IBoard board) {
		boolean result = Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(1)
				&& board.getCellMark(1) == board.getCellMark(2);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#isSecondHorizontalLineMatched(com.techlab.tictactoe.IBoard)
	 */
	@Override
	public boolean isSecondHorizontalLineMatched(IBoard board) {
		boolean result = Mark.EMPTY != board.getCellMark(3) && board.getCellMark(3) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(5);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#isThirdHorizontalLineMatched(com.techlab.tictactoe.IBoard)
	 */
	@Override
	public boolean isThirdHorizontalLineMatched(IBoard board) {
		Boolean result = Mark.EMPTY != board.getCellMark(6) && board.getCellMark(6) == board.getCellMark(7)
				&& board.getCellMark(7) == board.getCellMark(8);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#isFirstVerticalLineMatched(com.techlab.tictactoe.IBoard)
	 */
	@Override
	public boolean isFirstVerticalLineMatched(IBoard board) {
		Boolean result = Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(3)
				&& board.getCellMark(3) == board.getCellMark(6);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#isSecondVerticalLineMatched(com.techlab.tictactoe.IBoard)
	 */
	@Override
	public boolean isSecondVerticalLineMatched(IBoard board) {
		Boolean result = Mark.EMPTY != board.getCellMark(1) && board.getCellMark(1) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(7);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#isThirdVerticalLineMatched(com.techlab.tictactoe.IBoard)
	 */
	@Override
	public boolean isThirdVerticalLineMatched(IBoard board) {
		Boolean result = Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(5)
				&& board.getCellMark(5) == board.getCellMark(8);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#isFirstDiagonalLineMatched(com.techlab.tictactoe.IBoard)
	 */
	@Override
	public boolean isFirstDiagonalLineMatched(IBoard board) {
		boolean result = Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(8);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IResultAnalyser#isSecondDiagonalLineMatched(com.techlab.tictactoe.IBoard)
	 */
	@Override
	public boolean isSecondDiagonalLineMatched(IBoard board) {
		Boolean result = Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(6);
		return result;
	}

}
