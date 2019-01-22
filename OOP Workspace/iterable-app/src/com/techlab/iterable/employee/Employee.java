package com.techlab.iterable.employee;

public class Employee {

	private int id;
	private String name;
	
	public Employee(int newId, String newName) {
		id=newId;
		name=newName;
	}
	
	public String toString() {
		return id+" "+name;
	}
}
