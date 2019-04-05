package com.techlabs.employee.polymorphism.test;

import com.techlab.employee.polymorphism.Accountant;
import com.techlab.employee.polymorphism.Developer;
import com.techlab.employee.polymorphism.Employee;
import com.techlab.employee.polymorphism.Manager;

public class TestAccount {

	public static void main(String[] args) {

		Manager manager1 = new Manager(1, "Keshav", "Manager");
		Accountant accountant1 = new Accountant(2, "Rahul", "Accountant");
		Developer developer1 = new Developer(3, "Prasad", "Developer");
		printPaySlip(manager1);
		printPaySlip(accountant1);
		printPaySlip(developer1);
	}

	private static void printPaySlip(Employee emp) {

		emp.calcSalary();
		System.out.println("ID :"+emp.getNumber()+"\n"+"Name : "+emp.getName()+"\n"+"Position : "+emp.getPosition()+"\n"+"Total Salary: "+emp.getTotalSalary());
		if(emp.getHRA()>0) {
			System.out.println("HRA : "+emp.getHRA());
		}
		if(emp.getTA()>0) {
			System.out.println("TA : "+emp.getTA());
		}
		if(emp.getPerks()>0) {
			System.out.println("Perks : "+emp.getPerks());
		}
		if(emp.getPA()>0) {
			System.out.println("PA : "+emp.getPA());
		}
		System.out.println("\n");
	}

	
	
}
