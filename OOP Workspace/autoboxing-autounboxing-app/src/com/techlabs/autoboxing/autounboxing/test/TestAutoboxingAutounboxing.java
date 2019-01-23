package com.techlabs.autoboxing.autounboxing.test;

public class TestAutoboxingAutounboxing {

	public static void main(String[] args) {

		int x = 10;
		Integer X = 10;//Autoboxing
		System.out.println(X);
		
		Integer Y = new Integer(20);
		int y = Y;
		System.out.println(y);
	}

}
