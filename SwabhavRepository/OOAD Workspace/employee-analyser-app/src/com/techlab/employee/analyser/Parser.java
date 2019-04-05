package com.techlab.employee.analyser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Parser {
	
	public ArrayList<Employee> employeeDetails = new ArrayList();
	
	public ArrayList<Employee> parse(ILoader iLoader) throws MalformedURLException, IOException {
	 
		for(String line : iLoader.load()) {
			
			Employee employee=new Employee();
			String[] entryDetails = line.split(",");
			employee.setId(Integer.parseInt(entryDetails[0]));
			employee.setName(entryDetails[1]);
			employee.setDesignation(entryDetails[2]);
			employee.setManagerId(entryDetails[3]);
			employee.setDate(entryDetails[4]);
			employee.setSalary(Integer.parseInt(entryDetails[5]));
			employee.setCommision(entryDetails[6]);
			employee.setDepartmentNumber(Integer.parseInt(entryDetails[7]));
			employeeDetails.add(employee);
		}
		return null;
	}

	public TreeSet<Employee> uniqueEmployeeDetails = new TreeSet();
	
	public TreeSet<Employee> parseUniqueDetails(ILoader iLoader) throws IOException {
		
		for (String line : iLoader.load()) {
			String[] entryDetails = line.split(",");
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(entryDetails[0]));
			employee.setName(entryDetails[1]);
			employee.setDesignation(entryDetails[2]);
			employee.setManagerId(entryDetails[3]);
			employee.setDate(entryDetails[4]);
			employee.setSalary(Integer.parseInt(entryDetails[5]));
			employee.setCommision(entryDetails[6]);
			employee.setDepartmentNumber(Integer.parseInt(entryDetails[7]));
			uniqueEmployeeDetails.add(employee);
		}
		return uniqueEmployeeDetails;

	}
}
