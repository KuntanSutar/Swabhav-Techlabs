package com.techlab.shopping.cart;

public class Product {

	private int id;
	private String name;
	private double cost;
	private float discount;
	
	public Product(int id, String name, double cost, float discount) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}
	
	public double costAfterDiscount() {
		return (cost-(cost*discount)/100);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}
	
}
