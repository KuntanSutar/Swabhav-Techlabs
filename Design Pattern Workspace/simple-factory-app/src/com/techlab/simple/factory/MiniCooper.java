package com.techlab.simple.factory;

public class MiniCooper implements IAutomation {

	@Override
	public void start() {
		System.out.println("Start MiniCooper");
	}

	@Override
	public void stop() {
		System.out.println("Stop MiniCooper");
	}

}
