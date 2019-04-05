package com.techlab.factory.method;

public class MiniCooper implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Start MiniCooper");
	}

	@Override
	public void stop() {
		System.out.println("Stop MiniCooper");
	}

}
