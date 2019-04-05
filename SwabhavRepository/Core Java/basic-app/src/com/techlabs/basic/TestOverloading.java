package com.techlabs.basic;

public class TestOverloading {

	public static void main(String[] Kuntan) {
		System.out.println(10);
		System.out.println(10.0f);
		System.out.println(10.0);
		System.out.println("Kuntan");
		System.out.println('c');
		printThis(10);
		printThis(10.0f);
		printThis(10.0);
		printThis(false);
		printThis('c');
		printThis("Kuntan");

	}

	private static void printThis(int x) {
		System.out.println(x);
	}

	private static void printThis(float x) {
		System.out.println(x);
	}

	private static void printThis(double x) {
		System.out.println(x);
	}

	private static void printThis(boolean x) {
		System.out.println(x);
	}
	
	private static void printThis(char x) {
		System.out.println(x);
	}
	
	private static void printThis(String x) {
		System.out.println(x);
	}

}
