package com.techlab.employee.hashmap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.techlab.employee.hashmap.Employee;

public class TestHashMap {

	public static void main(String args[]) {

		Employee employee1 = new Employee(1, 101, "KUNTAN", "SUTAR", 20000);
		Employee employee2 = new Employee(1, 101, "KUNTAN", "SUTAR", 20000);
		Employee employee3 = new Employee(2, 101, "VAIBHAV", "SUTAR", 20000);
		Employee employee4 = new Employee(2, 102, "VAIBHAV", "SUTAR", 20000);

		Map<Employee, Employee> employees;
		employees = new HashMap();

		employees.put(employee1, employee2);
		employees.put(employee1, employee3);
		employees.put(employee3, employee4);
		System.out.println(employees.size());

		printEmployeeDetails(employees);
	}

	private static void printEmployeeDetails(Map<Employee, Employee> employees) {
		Iterator iterator = employees.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();
			Object key = pair.getKey();
			Object value = pair.getValue();
			System.out.println(key.hashCode());
			System.out.println(value.hashCode());
		}
	}

}
