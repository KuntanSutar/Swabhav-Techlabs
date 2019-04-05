package com.techlabs.exception;

public class TestRuntimeExceptionPropogation {

	public static void main(String[] args) {
		try
		{
			f1();
		}
		catch(RuntimeException re) {
			System.out.println(re.getStackTrace());
			System.out.println(re.getStackTrace());
		}
	}

	private static void f1() {
		System.out.println("Inside f1");
		f2();
	}

	private static void f2() {
		System.out.println("Inside f2");
		f3();
	}

	private static void f3() {
		System.out.println("Inside f3");
		throw new RuntimeException();
	}

}
