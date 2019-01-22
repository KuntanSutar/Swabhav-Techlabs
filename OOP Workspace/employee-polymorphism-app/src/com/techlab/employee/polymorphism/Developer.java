package com.techlab.employee.polymorphism;

public class Developer extends Employee {
	
	public Developer(int number, String name, String position) {
		super(number, name, position);
		pa=0.4*basicSalary;
	}

	@Override
	public void calcSalary() {
		totalSalary = basicSalary+pa;
	}
	
}
