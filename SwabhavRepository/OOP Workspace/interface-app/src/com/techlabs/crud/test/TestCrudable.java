package com.techlabs.crud.test;

import com.techlab.crud.CustomerDB;
import com.techlab.crud.ICrudable;
import com.techlab.crud.InvoiceDB;
import com.techlab.crud.OrderDB;

public class TestCrudable {

	public static void main(String[] args) {
		doDBOperation(new CustomerDB());
		doDBOperation(new InvoiceDB());
		doDBOperation(new OrderDB());
	}

	private static void doDBOperation(ICrudable newICrudable) {
		newICrudable.create();
		newICrudable.read();
		newICrudable.update();
		newICrudable.delete();
	}

}
