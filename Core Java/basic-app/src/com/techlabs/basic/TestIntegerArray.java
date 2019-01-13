package com.techlabs.basic;

public class TestIntegerArray {

	public static void main(String[] args) {
		int number = 10;
		changeNumberToZero(number);
		System.out.println(number);
		int[] numbers = {10, 20, 30, 40, 50};
		changeAllNumbersToZero(numbers);
		for(int element:numbers)
		{
			System.out.println(element);
		}
	}

	private static void changeAllNumbersToZero(int[] numbers) {
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=0;
		}
	}

	private static void changeNumberToZero(int number) {
		number = 0;
	}

}
