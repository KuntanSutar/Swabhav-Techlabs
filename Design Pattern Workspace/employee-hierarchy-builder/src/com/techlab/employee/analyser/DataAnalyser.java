package com.techlab.employee.analyser;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataAnalyser {

	public String maximumSalarisedEmployee(ArrayList<Employee> list) throws Exception {
		ArrayList<Employee> listOfEmployee = new ArrayList();
		listOfEmployee.addAll(list);
		int lastEmployee = listOfEmployee.size() - 1;
		Employee newEmployee = listOfEmployee.get(lastEmployee);
		return "ID : " + newEmployee.getId() + " Name : " + newEmployee.getName() + " Commission : "
		+ newEmployee.getCommision() + " Date : " + newEmployee.getDate() + " Designation : "
		+ newEmployee.getDesignation() + " Salary : " + newEmployee.getSalary() + " Department No : "
		+ newEmployee.getDepartmentNumber();
	}

	public int totalNumberOfEmployee(TreeSet<Employee> listOfEmployee) throws Exception {
		return listOfEmployee.size();
	}

	public Map<Integer, Integer> getEmployeeByDepartmentNumber(TreeSet<Employee> treeset) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (Employee empolyee : treeset) {
			if (map.get(empolyee.getDepartmentNumber()) == null) {
				map.put(empolyee.getDepartmentNumber(), 1);
			} else {
				int counter = map.get(empolyee.getDepartmentNumber());
				counter++;
				map.put(empolyee.getDepartmentNumber(), counter);
			}
		}
		return map;
	}

	public Map<String, Integer> getEmployeesByDesignation(TreeSet<Employee> treeset) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (Employee empolyee : treeset) {
			if (map.get(empolyee.getDesignation()) == null) {
				map.put(empolyee.getDesignation(), 1);
			} else {
				int counter = map.get(empolyee.getDesignation());
				counter++;
				map.put(empolyee.getDesignation(), counter);
			}
		}
		return map;
	}

}
