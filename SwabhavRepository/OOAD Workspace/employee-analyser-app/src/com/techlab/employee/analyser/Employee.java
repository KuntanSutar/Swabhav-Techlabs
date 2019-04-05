package com.techlab.employee.analyser;

import java.util.ArrayList;
import java.util.Date;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private String designation;
	private String managerId;
	private String date;
	private int salary;
	private String commision;
	private int departmentNumber;
	private ArrayList<Employee> reportList;
	
	public Employee(int id, String name, String designation, String managerId, String date, int salary,
			String commision, int departmentNumber) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.managerId = managerId;
		this.date = date;
		this.salary = salary;
		this.commision = commision;
		this.departmentNumber = departmentNumber;
	}

	public Employee() {
		reportList = new ArrayList();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCommision() {
		return commision;
	}

	public void setCommision(String commision) {
		this.commision = commision;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public ArrayList<Employee> getReportList() {
		return reportList;
	}

	@Override
	public int compareTo(Employee newEmployee) {
		return this.id-newEmployee.id;
	}
	
}

