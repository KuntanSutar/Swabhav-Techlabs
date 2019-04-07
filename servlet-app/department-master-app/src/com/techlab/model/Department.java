package com.techlab.model;

public class Department {

	private int number;
	private String name;
	private String location;
	
	public Department(int deptNo, String deptName, String location) {
		this.number = deptNo;
		this.name = deptName;
		this.location = location;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int deptNo) {
		this.number = deptNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String deptName) {
		this.name = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
