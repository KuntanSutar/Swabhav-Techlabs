package com.techlab.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionDemo {
	private int length;
	private int width;
	private float radius;
	private final float PIE = 3.14f;
	
	public int setBounds(int value) {
		if (value < 0) {
			return 1;
		}
		if (value > 100) {
			return 100;
		}
		return value;
	}

	public void setLength(int x) {
		length = setBounds(x);
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int y) {
		width = setBounds(y);
	}

	public int getWidth() {
		return width;
	}

	public ReflectionDemo(int newLength, int newWidth)
	{
		length=newLength;
		width=newWidth;
	}
	public ReflectionDemo(float newRadius)
	{
		radius=newRadius;
	}
	public int calcAreaOfRectangle()
	{
		return length*width;
	}
	public float calcAreaOfCircle()
	{
		return PIE*radius*radius;
	}
	
	public int countNumberOfConstrucutors(Constructor[] newConstrucutorArray)
	{
		return newConstrucutorArray.length;
	}
	
	public int countNumberOfMethods(Method[] newMethodArray)
	{
		return newMethodArray.length;	
	}
	
	public int countNumberOfGetterMethods(Method[] newMethodArray)
	{
		int countGetterMethods=0;
		for(Method element:newMethodArray)
		{
			if(element.getName().startsWith("get"))
			{
				countGetterMethods++;
			}
		}
		return countGetterMethods;
	}
	
	public int countNumberOfSetterMethods(Method[] newMethodArray)
	{
		int countSetterMethods=0;
		for(Method element:newMethodArray)
		{
			if(element.getName().startsWith("set"))
			{
				countSetterMethods++;
			}
		}
		return countSetterMethods;	
	}
	
	public void printConstructorDetails(Constructor[] newConstrucutorArray)
	{
		for(Constructor element:newConstrucutorArray)
		{
			System.out.println(element);
		}
	}
	public void printMethodDetails(Method[] newMethodArray)
	{
		for(Method element:newMethodArray)
		{
			System.out.println(element.getName());
		}
	}

	public void printSetterMethodDetails(Method[] newMethodArray) {
		for(Method element:newMethodArray)
		{
			if(element.getName().startsWith("set"))
			{
				System.out.println(element.getName());
			}
		}
	}

	public void printGetterMethodDetails(Method[] newMethodArray) {
		for(Method element:newMethodArray)
		{
			if(element.getName().startsWith("get"))
			{
				System.out.println(element.getName());
			}
		}
	}
	
	public void printAllTheDetailsOfClass(Class newClass)
	{
		Class cl = newClass;
		
	}
}
