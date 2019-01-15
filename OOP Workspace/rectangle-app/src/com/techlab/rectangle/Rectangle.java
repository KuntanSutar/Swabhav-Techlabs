package com.techlab.rectangle;

public class Rectangle {
	private int length;
	private int width;

	public int setBounds(int value) {
		if (value < 0) {
			return 1;
		}
		if (value > 100) {
			return 100;
		}
		return value;
	}

	public void setLength(int x) {
		length = setBounds(x);
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int y) {
		width = setBounds(y);
	}

	public int getWidth() {
		return width;
	}

	public int calcArea() {
		return length * width;
	}
}
