package com.techlab.person;

import java.util.Date;

public class Person {

	private int id;
	private String address;
	private Date dob;

	public Person(int newID, String newAddress, Date newDOB) {
		id = newID;
		address = newAddress;
		dob = newDOB;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public Date getDOB() {
		return dob;
	}

}
