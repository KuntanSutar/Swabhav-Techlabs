package com.techlab.customizedexception;

public class CustomizedException extends RuntimeException {
	
	// It is recommended to define customized exception as unchecked exception (RuntimeException)
	// Otherwise, if we extend Exception, then what is the purpose of customized exception.
	
	public CustomizedException(String newException) 
	{
		super(newException);
	}
}
