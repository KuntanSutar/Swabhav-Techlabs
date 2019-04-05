package com.techlab.rectangle.constructor;

public class Rectangle {
	
	private int length;
	private int width;
	private String bgColor = "BLUE";
	
	public Rectangle(int newLength, int newWidth)
	{
		length=newLength;
		width=newWidth;
	}
	
	public Rectangle(int newLength, int newWidth, String newBGColor)
	{
		this(newLength, newWidth);
		
		if(newBGColor.equalsIgnoreCase("Red")||newBGColor.equalsIgnoreCase("Green")||newBGColor.equalsIgnoreCase("Blue"))
		{
			bgColor=newBGColor.toUpperCase();
		}
	}

	public int getWidth()
	{
		return length;
	}
	
	public int getHeigth()
	{
		return width;
	}
	
	
	public int calcArea()
	{
		return length*width;
	}

	public String getBgColor() {
		return bgColor;
	}
}
