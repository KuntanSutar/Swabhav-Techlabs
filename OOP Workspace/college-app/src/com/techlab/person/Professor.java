package com.techlab.person;

import java.util.Date;

import com.techlab.college.College;

public class Professor extends Person implements ISalariedEmployee {

	private double salary;
	private College college;
	private String name;

	public Professor(int newID, String newAddress, Date newDOB, College newCollege, String newName) {
		super(newID, newAddress, newDOB);
		salary = basicSalary;
		college = newCollege;
		name = newName;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public void calcSalary() {
		salary = salary + basicSalary * 0.3;
	}

	public String getName() {
		return name;
	}

}
