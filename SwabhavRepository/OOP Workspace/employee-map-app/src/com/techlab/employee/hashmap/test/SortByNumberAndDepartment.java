package com.techlab.employee.hashmap.test;

import java.util.Comparator;

import com.techlab.employee.hashmap.Employee;

public class SortByNumberAndDepartment implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {

		if(employee1.getEmployeeNumber() > employee2.getEmployeeNumber()) {
			return -1;
		}
		
		if(employee1.getDepartmentNumber() > employee2.getDepartmentNumber()) {
			return 1;
		}
		return 0;
	}

}
