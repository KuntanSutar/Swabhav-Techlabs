package com.techlabs.shopping.cart.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.cart.Product;

class TestProduct {

	@Test
	void checkProductDetails() {
		Product product = new Product(1, "Buiscuit", 100, 10f);
		int resultId = product.getId();
		assertEquals(1, resultId);
		
		String name = product.getName();
		assertEquals("Buiscuit", name);
		
		double cost = product.getCost();
		assertEquals(100, cost);
		
		double discount=product.getDiscount();
		assertEquals(10f, discount);
	}

	@Test
	void checkCostAfterDiscount() {
		Product product = new Product(1, "Buiscuit", 100, 10f);
		double costAfterDiscount = product.costAfterDiscount();
		assertEquals(90, costAfterDiscount);
	}
}
