package com.techlab.crud;

public class OrderDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Order added");
	}

	@Override
	public void read() {
		System.out.println("Read Order's record");
	}

	@Override
	public void update() {
		System.out.println("Updated Order's record");
	}

	@Override
	public void delete() {
		System.out.println("Deleted Order's record");
	}

}
