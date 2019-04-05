package com.techlabs.remove.dependency.test;

import com.techlab.remove.dependency.A;
import com.techlab.remove.dependency.B;

public class TestA {

	public static void main(String[] args) {
		A a = new A(new B());
		a.bar();
	}
}
