package com.techlab.employee.polymorphism;

public class Manager extends Employee {
	
	public Manager(int number, String name, String position) {
		super(number, name, position);
		hra=0.6*basicSalary;
		ta=0.4*basicSalary;
	}

	@Override
	public void calcSalary() {
		totalSalary = basicSalary+hra+ta;
	}

}
