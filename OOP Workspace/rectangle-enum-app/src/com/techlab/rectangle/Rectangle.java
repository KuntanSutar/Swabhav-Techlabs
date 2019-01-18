package com.techlab.rectangle;

public class Rectangle {

	private int heigth;
	private int width;
	private ColorOption bgColor;

	public Rectangle(int newHeigth, int newWidth) {
		heigth = newHeigth;
		width = newWidth;
	}

	public Rectangle(int newHeigth, int newWidth, ColorOption newBGColor) {
		this(newHeigth, newWidth);
		bgColor = newBGColor;
	}

	public int getWidth() {
		return heigth;
	}

	public int getHeigth() {
		return width;
	}

	public int calcArea() {
		return heigth * width;
	}

	public ColorOption getBgColor() {
		return bgColor;
	}

}
