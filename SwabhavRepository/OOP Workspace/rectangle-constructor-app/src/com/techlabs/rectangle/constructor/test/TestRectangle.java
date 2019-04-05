package com.techlabs.rectangle.constructor.test;
import com.techlab.rectangle.constructor.*;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10, 5);
		System.out.println(rec1.calcArea());
		System.out.println(new Rectangle(20, 5).calcArea());
		printDetails(rec1);
		printDetails(new Rectangle(20, 5));
		printDetails(new Rectangle(10, 5, "gReen"));
		printDetails(new Rectangle(20, 5, "Green"));
		printDetails(new Rectangle(20, 5, "Foo"));
		
	}

	private static void printDetails(Rectangle rec1) {
		System.out.println("Heigth : "+rec1.getHeigth()+"\t Width : "+rec1.getWidth()+
							"\t Area : "+rec1.calcArea()+"\t Backgroud Color : "+rec1.getBgColor());
		
	}

}
