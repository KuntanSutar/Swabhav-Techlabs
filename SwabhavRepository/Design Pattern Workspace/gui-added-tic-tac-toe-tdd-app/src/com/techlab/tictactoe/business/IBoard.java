package com.techlab.tictactoe.business;

public interface IBoard {

	void setCellMark(int cellIndex, Mark mark);

	Mark getCellMark(int cellIndex);

	boolean isCellEmpty(int cellIndex);

	boolean isBoardFull();

}