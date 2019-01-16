package com.techlab.reflection;

public class ReflectionDemo {
	private int length;
	private int width;
	private float radius;
	private final float PIE = 3.14f;
	
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
}
