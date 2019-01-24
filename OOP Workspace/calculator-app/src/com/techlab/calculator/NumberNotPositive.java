package com.techlab.calculator;

public class NumberNotPositive extends RuntimeException {
	
	public NumberNotPositive(String string) {
		super(string);
	}
}
