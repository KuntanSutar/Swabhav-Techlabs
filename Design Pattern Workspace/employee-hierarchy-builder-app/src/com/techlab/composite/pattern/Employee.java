package com.techlab.composite.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlab.composite.pattern.test.TestFolder;

public class Employee {

	private String name;
	private List<Employee> reporteeList; 
	
	public Employee(String name) {
		this.name = name;
		reporteeList=new ArrayList();
	}

	public void addItem(Employee newEmployee) {
		reporteeList.add(newEmployee);
	}
	
	public void displayDetails() {
		
		System.out.println(TestFolder.changable+name);
		TestFolder.changable.append("\t");
		for(Employee employee : reporteeList) {
			Employee reportee = (Employee)employee;
			reportee.displayDetails();
		}
		TestFolder.changable.setLength(TestFolder.changable.length()-1);
	}

}
