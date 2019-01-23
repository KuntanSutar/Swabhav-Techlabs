package com.techlab.crud;

public class CustomerDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Customer Added");
	}

	@Override
	public void read() {
		System.out.println("Read Cutomer's record");
	}

	@Override
	public void update() {
		System.out.println("Updated Customer's record");
	}

	@Override
	public void delete() {
		System.out.println("Deleted Customer's record");
	}
	
}
