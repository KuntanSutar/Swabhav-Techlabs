package com.techlabs.exception;

public class TestBug {

	public static void main(String[] args) {
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a / 0);
			int c = a / b;
			System.out.println("Value of c is :" + c);
			// TestBug.main(args);
		}

		catch (ArrayIndexOutOfBoundsException eioobe) {
			System.out.println("Pass args element through command line arguments!");
			System.out.println(eioobe.getMessage());
		}

		catch (ArithmeticException ae) {
			System.out.println("Don't divide by 0!");
			System.out.println(ae.getMessage());
		}

		finally {
			System.out.println("Thank you!");
		}
	}
}
