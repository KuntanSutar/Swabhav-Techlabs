package com.techlab.objectwithoutnewoperator;

public class Auto implements Vehicle, Cloneable {

	@Override
	public void drive() {
		System.out.println("Driving by Auto");
	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
