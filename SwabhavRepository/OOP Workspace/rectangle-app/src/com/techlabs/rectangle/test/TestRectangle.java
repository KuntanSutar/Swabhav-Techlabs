package com.techlabs.rectangle.test;

import com.techlab.rectangle.*;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		System.out.println("Current value of length:" + rec.getLength());
		System.out.println("Current value of length:" + rec.getWidth());

		rec.setLength(-2);
		rec.setWidth(50);

		System.out.println("Current value of length:" + rec.getLength());
		System.out.println("Current value of length:" + rec.getWidth());

		System.out.println(rec.calcArea());
		
		System.out.println(new Rectangle().calcArea());
	}

}
