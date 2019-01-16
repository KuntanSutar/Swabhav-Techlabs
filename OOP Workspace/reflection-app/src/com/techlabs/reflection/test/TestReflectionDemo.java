package com.techlabs.reflection.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlab.reflection.*;

public class TestReflectionDemo {

	public static void main(String[] args) {
		ReflectionDemo rfd1 = new ReflectionDemo(10, 5);
		Class cl = rfd1.getClass();
		System.out.println(cl.getName());
		Constructor[] constructors = cl.getConstructors();
		for(Constructor element:constructors)
		{
			System.out.println(element);
		}
		Method[] methods = cl.getMethods();
		for(Method element:methods)
		{
			System.out.println(element);
		}
	}

}
