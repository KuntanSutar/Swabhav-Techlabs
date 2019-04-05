package com.techlab.crud;

public class InvoiceDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Invoice Added");
	}

	@Override
	public void read() {
		System.out.println("Read Invoice's record");
	}

	@Override
	public void update() {
		System.out.println("Updated Invoice's record");
	}

	@Override
	public void delete() {
		System.out.println("Deleted Invoice's record");
	}
	
}

