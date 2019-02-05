package com.techlabs.employee.analyser.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import com.techlab.employee.analyser.DataAnalyser;
import com.techlab.employee.analyser.DiskLoader;
import com.techlab.employee.analyser.Employee;
import com.techlab.employee.analyser.Parser;
import com.techlab.employee.analyser.SalaryComparator;
import com.techlab.employee.analyser.URLLoader;

public class TestParcer {

	public static void main(String[] args) throws Exception {

		Parser parser = new Parser();
		parser.parse(new URLLoader("https://swabhav-tech.firebaseapp.com/emp.txt"));
		parser.parseUniqueDetails(new DiskLoader("data\\dataFile.txt"));

		DataAnalyser analyser = new DataAnalyser();

		TreeSet<Employee> uniqueEmployeeDetailsTreeSet = parser
				.parseUniqueDetails(new DiskLoader("data\\dataFile.txt"));
		ArrayList<Employee> uniqueEmployeeDetailsArrayList = new ArrayList<>();
		uniqueEmployeeDetailsArrayList.addAll(uniqueEmployeeDetailsTreeSet);

		Collections.sort(uniqueEmployeeDetailsArrayList, new SalaryComparator());

		System.out.println(
				"Maximum salaried employee is: " + analyser.maximumSalarisedEmployee(uniqueEmployeeDetailsArrayList));
		System.out.println(analyser.getEmployeesByDesignation(parser.uniqueEmployeeDetails));
		System.out.println(analyser.getEmployeeByDepartmentNumber(parser.uniqueEmployeeDetails));
	}

}
