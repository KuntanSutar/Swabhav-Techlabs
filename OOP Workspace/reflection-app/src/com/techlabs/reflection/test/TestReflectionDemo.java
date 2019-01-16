package com.techlabs.reflection.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlab.reflection.*;

public class TestReflectionDemo {

	public static void main(String[] args) throws Exception{
		
		ReflectionDemo rfd1 = new ReflectionDemo(10, 5);
		Class cl = rfd1.getClass();
//		System.out.println(cl.getName());
		Constructor[] constructors = cl.getConstructors();
//		for(Constructor element:constructors)
//		{
//			System.out.println(element);
//		}
		//System.out.println("Total constructors : "+constructors.length);
		Method[] methods = cl.getDeclaredMethods();
//		for(Method element:methods)
//		{
//			System.out.println(element);
//		}
		//System.out.println("Total methods : "+methods.length);
		
		int totalConstructors=rfd1.countNumberOfConstrucutors(constructors);
		System.out.println("Total Constructors : "+totalConstructors);
		System.out.println("They are as follows : ");
		rfd1.printConstructorDetails(constructors);
		System.out.println();
		
		int totalMethods=rfd1.countNumberOfMethods(methods);
		System.out.println("Total Methods : "+totalMethods);
		System.out.println("They are as follows : ");
		rfd1.printMethodDetails(methods);
		System.out.println();
		
		int totalGetterMethods=rfd1.countNumberOfGetterMethods(methods);
		System.out.println("Total Getter Methods : "+totalGetterMethods);
		System.out.println("They are as follows : ");
		rfd1.printGetterMethodDetails(methods);
		System.out.println();
		
		int totalSetterMethods=rfd1.countNumberOfSetterMethods(methods);
		System.out.println("Total Setter Methods : "+totalSetterMethods);
		System.out.println("They are as follows : ");
		rfd1.printSetterMethodDetails(methods);
		System.out.println();
	}

}
