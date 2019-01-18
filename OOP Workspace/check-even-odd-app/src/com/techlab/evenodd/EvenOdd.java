package com.techlab.evenodd;

public class EvenOdd {
	private int range;
	
	public void setRange(int newRange)
	{
		range=newRange;
	}

	public void printEven() 
	{
		System.out.println("Even Numbers:");
		for(int i=0; i<=range; i=i+2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public void printOdd() 
	{
		System.out.println("Odd Numbers:");
		for(int i=1; i<=range; i=i+2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
