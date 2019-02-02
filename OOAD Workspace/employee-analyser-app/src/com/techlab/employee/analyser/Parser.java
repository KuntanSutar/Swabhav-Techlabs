package com.techlab.employee.analyser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Parser {
	
	public ArrayList<Employee> employeeDetails = new ArrayList();
	
	public ArrayList<Employee> parse(ILoadable iLoadable) throws MalformedURLException, IOException {
	 
		for(String line : iLoadable.load()) {
			Employee employee=new Employee();
			String[] entrydetails = line.split(",");
			employee.setId(Integer.parseInt(entrydetails[0]));
			employee.setName(entrydetails[1]);
			employee.setDesignation(entrydetails[2]);
			employee.setManagerId(entrydetails[3]);
			employee.setDate(entrydetails[4]);
			employee.setSalary(Integer.parseInt(entrydetails[5]));
			employee.setCommision(entrydetails[6]);
			employee.setDepartmentNumber(Integer.parseInt(entrydetails[7]));
			employeeDetails.add(employee);
		}
		return null;
	}

	public TreeSet<Employee> uniqueEmployeeDetails = new TreeSet<Employee>();
	
	public TreeSet<Employee> parseUniqueDetails(ILoadable iloader) throws IOException {
		
		for (String line : iloader.load()) {
			String[] details = line.split(",");
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(details[0]));
			employee.setName(details[1]);
			employee.setDesignation(details[2]);
			employee.setManagerId(details[3]);
			employee.setDate(details[4]);
			employee.setSalary(Integer.parseInt(details[5]));
			employee.setCommision(details[6]);
			employee.setDepartmentNumber(Integer.parseInt(details[7]));
			uniqueEmployeeDetails.add(employee);
		}
		return uniqueEmployeeDetails;

	}
}
