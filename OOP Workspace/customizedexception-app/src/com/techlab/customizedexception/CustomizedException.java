package com.techlab.customizedexception;

public class CustomizedException extends RuntimeException{
	
	public void throwCustomizedException() 
	{
		throw new CustomizedException();
	}
	
	public void divideNumberByZero(int number)
	{
		try
		{
			System.out.println(number/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Any number can't be divided by zero!");
		}
	}
}
