package com.techlabs.rectangle.test;

import com.techlab.rectangle.*;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(10, 5, ColorOption.BLUE);
		printDetails(rec);
		printDetails(new Rectangle(10, 5, ColorOption.GREEN));
	}

	private static void printDetails(Rectangle rec1) {

		System.out.println("Heigth : " + rec1.getHeigth() + "\t Width : " + rec1.getWidth() + "\t Area : "
				+ rec1.calcArea() + "\t Backgroud Color : " + rec1.getBgColor());

	}
}
