package com.techlab.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.calculator.Calculator;
import com.techlab.calculator.NumberNotPositive;

class TestCalculator {

	@Test
	public void cubeEven() {
		Calculator calculator = new Calculator();
		long actualResult1 = calculator.cubeEven(2);
		assertEquals(8, actualResult1);
		long actualResult2 = calculator.cubeEven(-2);
		assertEquals(new NumberNotPositive("Don't enter negative number"), actualResult2);
	}

}
