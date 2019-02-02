package com.techlab.tictactoe;

public class Cell {

	private Mark mark = Mark.EMPTY;

	public Mark getMark() {
		return mark;
	}
	
	public void setMark(Mark mark) {
		this.mark = mark;
	}
}
