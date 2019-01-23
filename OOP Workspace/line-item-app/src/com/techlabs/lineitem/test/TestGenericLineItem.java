package com.techlabs.lineitem.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.lineitem.LineItem;

public class TestGenericLineItem {

	public static void main(String[] args) {

		double totalAmount = 0;
		List<LineItem> cart = new ArrayList();
		cart.add(new LineItem(1, "Pen", 50, 2));
		cart.add(new LineItem(2, "Book", 1000, 5));

		for (LineItem lineitem : cart) {
			System.out.println(lineitem.getQuantity() + " " + lineitem.getName() + " " + lineitem.calcTotal());
			totalAmount = totalAmount + lineitem.calcTotal();
		}

		System.out.println(totalAmount);
	}

}
