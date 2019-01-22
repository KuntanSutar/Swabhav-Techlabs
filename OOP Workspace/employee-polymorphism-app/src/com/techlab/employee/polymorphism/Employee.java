package com.techlab.employee.polymorphism;

public abstract class Employee {

	protected int number;
	protected String name;
	protected double basicSalary;
	protected double totalSalary;
	protected String position;
	protected double hra;
	protected double ta;
	protected double perks;
	protected double pa;
	
	public Employee(int newNumber, String newName, String newPosition) {
	
		number = newNumber;
		name = newName;
		position = newPosition;
		basicSalary = 5000	;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	
	public double getTotalSalary() {
		return totalSalary;
	}

	public String getPosition() {
		return position;
	}
	
	public double getHRA() {
		return hra;
	}
	
	public double getTA() {
		return ta;
	}
	
	public double getPerks() {
		return perks;
	}
	
	public double getPA() {
		return pa;
	}
	
	public abstract void calcSalary();
	
}
