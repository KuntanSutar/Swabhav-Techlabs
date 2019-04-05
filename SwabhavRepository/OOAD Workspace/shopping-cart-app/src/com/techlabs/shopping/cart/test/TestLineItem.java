package com.techlabs.shopping.cart.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.cart.LineItem;
import com.techlab.shopping.cart.Product;

class TestLineItem {

	@Test
	void checkLineItemDetails() {
		Product product1 = new Product(1, "Buiscuit", 100, 10f);
		LineItem lineitem = new LineItem(1, 2, product1);
		int id = lineitem.getId();
		int quantity = lineitem.getQuantity();
		Product product2 = lineitem.getProduct();
		assertEquals(product1, product2);
	}

	@Test
	void chaeckItemCost() {
		Product product1 = new Product(1, "Buiscuit", 100, 10f);
		LineItem lineitem = new LineItem(1, 2, product1);
		double cost = lineitem.calcItemCost();
		assertEquals(200, cost);
	}
}
