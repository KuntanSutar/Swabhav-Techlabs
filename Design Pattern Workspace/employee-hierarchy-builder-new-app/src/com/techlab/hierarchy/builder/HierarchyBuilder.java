package com.techlab.hierarchy.builder;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HierarchyBuilder {

	private Employee rootEmployee = null;
	//private List<Employee> reporteeList = new ArrayList<Employee>();
	//private List<Employee> mangerList = new ArrayList<Employee>();
	//private Set<Employee> empSet = new TreeSet<Employee>();
	private Map<Integer, Employee> empMap = new HashMap();

	public HierarchyBuilder(Set<Employee> empSet) {
		for (Employee employee : empSet) {
			empMap.put(employee.getEmpId(), employee);
		}
		createHeirarchy();
	}

	public void createHeirarchy() {
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			if(empMap.containsKey(entry.getValue().getManagerId())) {
				Employee employee = empMap.get(entry.getValue().getManagerId());
				//System.out.println(employee.getEmpName());
				//System.out.println(entry.getValue().getEmpName());
				employee.addReportee(entry.getValue());
			}
		}
	}

	public Employee getRootEmployee() {
		for (Employee employee : empMap.values()) {
			if (employee.getManagerId() == null) {
				return rootEmployee = employee;
			}
		}
		return rootEmployee;
	}
	
	/*
	 * public void findCEO() { for (Employee emp : empSet) { if (emp.getManagerId()
	 * == null) { rootEmployee = emp; } else { reporteeList.add(emp); } } }
	 * 
	 * public void findMangers() { for (Employee emp : reporteeList) { if
	 * (rootEmployee.getEmpId().equals(emp.getManagerId())) {
	 * rootEmployee.addReportee(emp); mangerList.add(emp); } } }
	 * 
	 * public void findRepotees() { for (Employee manger : mangerList) { for
	 * (Employee employee : reporteeList) { if
	 * (manger.getEmpId().equals(employee.getManagerId())) {
	 * manger.addReportee(employee); } } } }
	 */
	
	public Map<Integer, Employee> getEmpMap() {
		return empMap;
	}
}
