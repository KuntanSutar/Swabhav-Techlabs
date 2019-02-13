package com.techlab.hierarchy.builder;

import java.util.ArrayList;
import java.util.List;
import com.techlab.hierarchy.builder.test.TestHierarchyBuilder;

public class Employee implements Comparable<Employee>{
	private Integer empId;
	private Integer managerId;
	private String empName;
	private String designation;
	private List<Employee> empList = new ArrayList<Employee>();

	public Employee(Integer empId, Integer managerId, String empName, String designation) {
		this.empId = empId;
		this.managerId = managerId;
		this.empName = empName;
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public Integer getEmpId() {
		return empId;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public String getEmpName() {
		return empName;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void addReportee(Employee employee) {
		empList.add(employee);
	}

	@Override
	public int compareTo(Employee employee) {
		
		return this.empId-employee.empId;
	}
	
	public void displayDetails() {
		
		System.out.println(TestHierarchyBuilder.changable+empName);
		TestHierarchyBuilder.changable.append("\t");
		for(Employee emp : empList) {
			emp.displayDetails();
		}
		TestHierarchyBuilder.changable.setLength(TestHierarchyBuilder.changable.length()-1);
	}

}
