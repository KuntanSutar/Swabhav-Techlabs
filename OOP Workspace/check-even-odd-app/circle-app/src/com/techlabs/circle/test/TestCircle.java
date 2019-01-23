package com.techlabs.circle.test;

import com.techlab.circle.*;

public class TestCircle {

	public static void main(String[] args) {
		Circle crcl = new Circle();
		crcl.setRadius(-5f);

		System.out.println(crcl.getRadius());
		System.out.println(crcl.calcArea());
		System.out.println(crcl.calcCircumference());

		Circle smallCircle = new Circle();
		smallCircle.setRadius(1.5f);
		/*
		 * System.out.println("Radius : "+smallCircle.getRadius()+"\t"+
		 * "Area : "+smallCircle.calcArea()+"\t"+
		 * "Circumference : "+smallCircle.calcCircumference());
		 */
		Circle bigCircle = new Circle();
		bigCircle.setRadius(5.5f);
		/*
		 * System.out.println("Radius : "+bigCircle.getRadius()+"\t"+
		 * "Area : "+bigCircle.calcArea()+"\t"+
		 * "Circumference : "+bigCircle.calcCircumference());
		 */
		printDetails(smallCircle);
		printDetails(bigCircle);
		
		Circle temp = bigCircle;
		temp.setRadius(2.0f);
		System.out.println(temp.getRadius());
		System.out.println(bigCircle.getRadius());
		temp=null;
		System.out.println(bigCircle.getRadius());
		//System.out.println(temp.getRadius());	=> This will give NPE. It is unchecked exception
		
		Circle firstCircle = new Circle();
		firstCircle.setRadius(2.2f);
		Circle secondCircle = new Circle();
		secondCircle.setRadius(3.2f);
		Circle thirdCircle = new Circle();
		thirdCircle.setRadius(4.2f);
		
		Circle[] arrayOfCircles = new Circle[3];
		arrayOfCircles[0]=firstCircle;
		arrayOfCircles[1]=secondCircle;
		arrayOfCircles[2]=thirdCircle;
		
		for(Circle element:arrayOfCircles)
		{
			printDetails(element);
		}
		Circle largestCircle = findBiggerCircle(arrayOfCircles);
		printDetails(largestCircle);
	}

	private static void printDetails(Circle newCircle) {
		System.out.println("Radius : " + newCircle.getRadius() + "\t" + "Area : " + newCircle.calcArea() + "\t"
				+ "Circumference : " + newCircle.calcCircumference());
		System.out.println(newCircle.hashCode());
	}
	
	private static void printDetails(Circle[] newCircleArray) {
		for(Circle element:newCircleArray)
		{
			printDetails(element);
		}
	}
	
	private static Circle findBiggerCircle(Circle[] newArrayOfCircle)
	{
		int position=0;
		for(int i=1; i<newArrayOfCircle.length; i++)
		{
			if(newArrayOfCircle[position].getRadius() < newArrayOfCircle[i].getRadius())
			{
				position=i;
			}
		}
		return newArrayOfCircle[position];
	}
}
