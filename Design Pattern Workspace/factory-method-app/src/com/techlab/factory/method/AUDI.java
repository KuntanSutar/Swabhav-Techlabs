package com.techlab.factory.method;

public class AUDI implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Start AUDI");
	}

	@Override
	public void stop() {
		System.out.println("Stop AUDI");
	}

}
