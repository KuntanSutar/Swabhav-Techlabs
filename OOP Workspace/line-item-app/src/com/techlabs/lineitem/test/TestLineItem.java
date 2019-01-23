package com.techlabs.lineitem.test;

import java.util.*;

import com.techlab.lineitem.LineItem;

public class TestLineItem {

	public static void main(String[] args) {
		
		double totalAmount=0;
		List cart = new ArrayList();
		cart.add(new LineItem(1, "Pen", 50, 2));
		cart.add(new LineItem(2, "Book", 1000, 5));
		//cart.add("Swabhav Techlabs");
		//cart.add(100);
		
		for(Object obj:cart) {
			LineItem lineitem = (LineItem)obj;
			System.out.println(lineitem.getQuantity()+" "+lineitem.getName()+" "+lineitem.calcTotal());
			totalAmount=totalAmount+lineitem.calcTotal();
		}
		
		System.out.println(totalAmount);
	}
}
