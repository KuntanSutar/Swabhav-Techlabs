package com.techlab.shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private String location;
	private List<Order> orderlist = new ArrayList();
	
	public Customer(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public List<Order> getOrderList() {
		return orderlist;
	}

	public void addOrder(Order newOrder) {
		orderlist.add(newOrder);
	}
}
