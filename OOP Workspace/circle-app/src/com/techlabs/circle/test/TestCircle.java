package com.techlabs.circle.test;
import com.techlab.circle.*;

public class TestCircle {

	public static void main(String[] args) {
		Circle crcl = new Circle();
		crcl.setRadius(-5f);
		System.out.println(crcl.calcArea());
		System.out.println(crcl.calcCircumference());
	}

}
