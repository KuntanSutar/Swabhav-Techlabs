package com.techlabs.basic;

public class TestArguments {

	public static void main(String[] Names) {
		System.out.println(Names.length);
		if (Names.length > 0) {
			for (String name : Names) {
				System.out.println("Hello " + name);
			}
			System.out.println("Thanx");
		} else {
			System.out.println("Please input more names!");

		}
	}

}
