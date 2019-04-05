package com.techlab.simple.factory;

public class BMW implements IAutomation {

	@Override
	public void start() {
		System.out.println("Start BMW");
	}

	@Override
	public void stop() {
		System.out.println("Stop BMW");
	}

}
