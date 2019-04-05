package com.techlab.employee.hashmap;

public class Employee {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentNumber;
		result = prime * result + employeeNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (departmentNumber != other.departmentNumber)
			return false;
		if (employeeNumber != other.employeeNumber)
			return false;
		return true;
	}

	private int departmentNumber;
	private int employeeNumber;
	private String fname;
	private String lname;
	private double salary;
	
	public Employee(int departmentNumber, int employeeNumber, String fname, String lname, double salary) {

		this.departmentNumber = departmentNumber;
		this.employeeNumber = employeeNumber;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public double getSalary() {
		return salary;
	}
	
}
