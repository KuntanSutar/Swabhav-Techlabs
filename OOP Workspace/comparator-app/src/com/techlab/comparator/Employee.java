package com.techlab.comparator;

public class Employee {

	private String name;
	private int id;

	public Employee(int newID, String newName) {
		id = newID;
		name = newName;
	}

	public String toString() {
		return id + " " + name;
	}
}
