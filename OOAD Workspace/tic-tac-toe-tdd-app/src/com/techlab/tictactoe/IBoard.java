package com.techlab.tictactoe;

public interface IBoard {

	void setCellMark(int cellIndex, Mark mark);

	Mark getCellMark(int cellIndex);

	boolean isCellEmpty(int cellIndex);

	boolean isBoardFull();

}