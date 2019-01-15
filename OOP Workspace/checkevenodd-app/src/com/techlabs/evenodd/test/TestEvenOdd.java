package com.techlabs.evenodd.test;
import com.techlab.evenodd.*;

public class TestEvenOdd {

	public static void main(String[] args) {
	
		EvenOdd eo = new EvenOdd();
		eo.setRange(100);
		eo.printEven();
		eo.printOdd();
		
		eo.setRange(50);
		eo.printEven();
		eo.printOdd();
	}

}
