package com.techlabs.customizedexception.test;

import com.techlab.customizedexception.CustomizedException;

public class TestCustomizedException {

	public static void main(String[] args) {
		try
		{
			throw new CustomizedException("Danger");
		}
		catch(CustomizedException ce)
		{
			System.out.println("Exception Caught!");
			System.out.println(ce.getMessage());
		}
	}

}
