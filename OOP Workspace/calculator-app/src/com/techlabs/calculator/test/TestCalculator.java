package com.techlabs.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.calculator.Calculator;

class TestCalculator {

	@Test
	public void cubeEven() {
		Calculator calculator = new Calculator();
		long actualResult1 = calculator.cubeEven(2);
		assertEquals(8, actualResult1);
		long actualResult2 = calculator.cubeEven(-2);
		assertEquals(null, actualResult2);
	}

}
