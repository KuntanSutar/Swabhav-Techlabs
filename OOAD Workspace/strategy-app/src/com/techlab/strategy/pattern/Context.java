package com.techlab.strategy.pattern;

public class Context {

	private IStrategy iStrategy;

	public Context(IStrategy newIStrategy) {
		iStrategy = newIStrategy;
	}

	public int executeStrategy(int num1, int num2) {
	      return iStrategy.doArithmeticOperation(num1, num2);
	}
}
