package com.techlab.circle;

public class Circle {
	private final float PIE = 3.14f;
	private float radius;
	private float area;
	private float circumference;
	
	public void setRadius(float newRadius) 
	{
		if(newRadius<0)
		{
			radius=1;
		}
		if(newRadius>0)
		{
			radius=newRadius;
		}
	}
	public float calcArea()
	{
		area = PIE*radius*radius;
		return area;
	}
	public float calcCircumference() 
	{
		circumference = 2*PIE*radius;
		return circumference;
	}
}
