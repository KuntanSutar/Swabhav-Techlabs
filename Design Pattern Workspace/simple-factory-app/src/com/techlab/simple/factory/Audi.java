package com.techlab.simple.factory;

public class Audi implements IAutomation {

	@Override
	public void start() {
		System.out.println("Start Audi");
	}

	@Override
	public void stop() {
		System.out.println("Stop Audi");
	}

}
