package com.techlab.employee.polymorphism;

public class Accountant extends Employee {

	public Accountant(int number, String name, String position) {
		super(number, name, position);
		perks = 0.3 * basicSalary;
	}

	@Override
	public void calcSalary() {
		totalSalary = basicSalary + perks;
	}
	
}
