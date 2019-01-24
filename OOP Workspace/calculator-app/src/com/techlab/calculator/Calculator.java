package com.techlab.calculator;

public class Calculator {

	public long cubeEven(int number) {
		
		if(number<0) {
			throw new NumberNotPositive("Don't enter negative number");
		}
		if(number%2==1) {
			throw new NumberNotEvenException("Don't enter odd number");
		}
		
		return number*number*number;
	}
}
