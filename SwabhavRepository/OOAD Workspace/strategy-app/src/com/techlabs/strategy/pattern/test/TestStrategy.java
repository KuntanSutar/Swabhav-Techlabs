package com.techlabs.strategy.pattern.test;

import com.techlab.strategy.pattern.*;

public class TestStrategy {

	public static void main(String[] args) {

		Context context = new Context(new Adition());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new Substraction());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	}

}
