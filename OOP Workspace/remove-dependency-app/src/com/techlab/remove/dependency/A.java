package com.techlab.remove.dependency;

public class A {

	//Checkout Dependency Inversion Principle on DZone
	B b;
	
	public A(IFoo newIFoo) {
		b=(B) newIFoo;
	}
	
	public void bar() {
		b.foo();
	}
	
}
