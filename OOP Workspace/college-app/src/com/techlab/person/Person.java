package com.techlab.person;

public class Person {

	private int id;
	private String address;
	private String dob;
	
	public Person(int newID, String newAddress, String newDOB) {
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

	public String getDob() {
		return dob;
	}

}
