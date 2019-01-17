package com.techlabs.customizedexception.test;

import com.techlab.customizedexception.CustomizedException;

public class TestCustomizedException {

	public static void main(String[] args) {
		CustomizedException ce = new CustomizedException();
		ce.divideNumberByZero(5);
		ce.throwCustomizedException();
	}

}
