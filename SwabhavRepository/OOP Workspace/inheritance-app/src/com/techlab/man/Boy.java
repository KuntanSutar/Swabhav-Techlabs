package com.techlab.man;

public class Boy extends Man {

	public Boy()
	{
		super();
		System.out.println("Inside Boy Constructor!");
	}
	
	public void walk() {
		System.out.println("Boy Walking");
	}
	
	public void play() {
		System.out.println("Boy Playing");
	}
}
