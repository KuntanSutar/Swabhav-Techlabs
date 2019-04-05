package com.techlab.tictactoe.business;

public class Board implements IBoard {

	private Cell[] cellBoard = new Cell[9];

	public Board() {
		for (int index = 0; index < cellBoard.length; index++) {
			cellBoard[index] = new Cell();
			cellBoard[index].setMark(Mark.EMPTY);
		}
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IBoard#setCellMark(int, com.techlab.tictactoe.Mark)
	 */
	@Override
	public void setCellMark(int cellIndex, Mark mark) {
		cellBoard[cellIndex].setMark(mark);
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IBoard#getCellMark(int)
	 */
	@Override
	public Mark getCellMark(int cellIndex) {
		return cellBoard[cellIndex].getMark();
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IBoard#isCellEmpty(int)
	 */
	@Override
	public boolean isCellEmpty(int cellIndex) {
		if (getCellMark(cellIndex) == Mark.EMPTY)
			return true;
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlab.tictactoe.IBoard#isBoardFull()
	 */
	@Override
	public boolean isBoardFull() {
		for (int index = 0; index < 9; index++) {
			if (cellBoard[index].getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;
	}
}
