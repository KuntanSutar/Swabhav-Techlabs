package com.techlabs.exception;

public class TestExceptionPropogation {

	public static void main(String[] args) throws Exception {
		try
		{
			f1();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of main");
	}

	private static void f1() throws Exception {
		System.out.println("Inside f1");
		f2();
	}

	private static void f2() throws Exception {
		System.out.println("Inside f2");
		f3();
	}

	private static void f3() throws Exception {
		System.out.println("Inside f3");
		throw new Exception("f3 error");
	}

}
