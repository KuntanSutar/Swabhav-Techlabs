package com.techlabs.man.test;

import com.techlab.constructor.Child;

public class TestParent {

	public static void main(String[] args) {

		Child child1 = new Child();
		System.out.println(child1.getFoo());
		Child child2 = new Child(100);
		System.out.println(child2.getFoo());
	}

}
