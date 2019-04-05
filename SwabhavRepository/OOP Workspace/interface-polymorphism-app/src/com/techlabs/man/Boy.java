package com.techlabs.man;

public class Boy implements IEmotionable, IMannerable {

	@Override
	public void cry() {
		System.out.println("Boy Crying");
	}

	@Override
	public void laugh() {
		System.out.println("Boy Laughing");
	}

	@Override
	public void wish() {
		System.out.println("Boy Wishing");
	}

	@Override
	public void depart() {
		System.out.println("Boy Departing");
	}

}
