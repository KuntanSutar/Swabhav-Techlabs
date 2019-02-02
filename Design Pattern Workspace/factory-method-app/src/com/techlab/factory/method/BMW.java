package com.techlab.factory.method;

public class BMW implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Start BMW");
	}

	@Override
	public void stop() {
		System.out.println("Stop BMW");
	}

}
