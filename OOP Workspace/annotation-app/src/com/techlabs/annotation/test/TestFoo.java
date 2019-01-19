package com.techlabs.annotation.test;

import java.lang.reflect.*;

import com.techlab.annotation.Foo;
import com.techlab.annotation.ProTestCase;

public class TestFoo {

	public static void main(String[] args) throws Exception {

		Foo foo = new Foo();

		int passCount=0, failCount=0;
		int totalCounts=0;
		
		for (Method element : Foo.class.getMethods()) {
			
			passCount = passCount + getPassCount(element, foo);
			failCount = failCount + getFailCount(element, foo);
			
		}
		
		totalCounts=passCount+failCount;
		System.out.println("Total Annotations : "+ totalCounts);
	}

	private static int getFailCount(Method element, Foo foo) throws Exception {
		
		if (element.isAnnotationPresent(ProTestCase.class) == true && (boolean) element.invoke(foo, null) == false) {
			System.out.println(element.getName() + " annotation not present! ");
			System.out.println("Failed");
			return 1;
		}
		return 0;
	}

	private static int getPassCount(Method element, Foo foo) throws Exception {
		
		if (element.isAnnotationPresent(ProTestCase.class) == true && (boolean) element.invoke(foo, null) == true) {
			System.out.println(element.getName() + " annotation present! ");
			System.out.println("Passed");
			return 1;
		}
		return 0;
	}

}
