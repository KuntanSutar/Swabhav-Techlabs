package com.techlab.hierarchy.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HierarchyBuilder {

	private Employee rootEmployee = null;
	private List<Employee> reporteeList = new ArrayList<Employee>();
	private List<Employee> mangerList = new ArrayList<Employee>();
	private Set<Employee> empSet = new TreeSet<Employee>();

	public HierarchyBuilder(Set<Employee> empSet) {
		this.empSet = empSet;
		findCEO();
		getManger();
		getRepotee();
	}

	public void findCEO() {
		for (Employee emp : empSet) {
			if (emp.getManagerId() == null) {
				rootEmployee = emp;
			} else {
				reporteeList.add(emp);
			}
		}
	}

	public void getManger() {
		for (Employee emp : reporteeList) {
			if (rootEmployee.getEmpId().equals(emp.getManagerId())) {
				rootEmployee.addReportee(emp);
				mangerList.add(emp);
			}
		}
	}

	public void getRepotee() {
		for (Employee manger : mangerList) {
			for (Employee employee : reporteeList) {
				if (manger.getEmpId().equals(employee.getManagerId())) {
					manger.addReportee(employee);
				}
			}
		}
	}

	public Employee getRootEmployee() {
		return rootEmployee;
	}

	public List<Employee> getReporteeList() {
		return reporteeList;
	}

	public List<Employee> getMangerList() {
		return mangerList;
	}

}
