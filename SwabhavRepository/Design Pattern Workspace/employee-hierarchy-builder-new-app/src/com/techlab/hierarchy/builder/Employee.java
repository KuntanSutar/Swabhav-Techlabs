package com.techlab.hierarchy.builder;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import com.techlab.hierarchy.builder.test.TestHierarchyBuilder;

public class Employee implements Comparable<Employee> {
	private Integer empId;
	private Integer managerId;
	private String empName;
	private String designation;
	private List<Employee> empList = new ArrayList<Employee>();
	private StringBuffer parallel = new StringBuffer();
	private static JFrame frame = new JFrame();
	private JTree jTree;

	static {
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
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

		return this.empId - employee.empId;
	}

	public void displayHierarchy() {

		System.out.println(TestHierarchyBuilder.changable + empName);
		TestHierarchyBuilder.changable.append("\t");
		for (Employee emp : empList) {
			emp.displayHierarchy();
		}
		TestHierarchyBuilder.changable.setLength(TestHierarchyBuilder.changable.length() - 1);
	}

	public StringBuffer displayXML() {

		parallel.append("<Employee name=\"" + empName + "\" id=\"" + empId + "\" designation=\"" + designation + "\">");
		for (Employee employee : empList) {
			parallel.append("<Reportee>");
			parallel.append(" " + employee.displayXML());
			parallel.append("</Reportee>");
		}
		parallel.append("</Employee>");
		return parallel;
	}

	public void buildJTree() throws Exception {

		DefaultMutableTreeNode parent = new DefaultMutableTreeNode(empName);
		
		for (Employee emp : empList) {
			DefaultMutableTreeNode child = new DefaultMutableTreeNode(emp.empName);
			parent.add(child);
			emp.buildJTree();
		}
		jTree = new JTree(parent);
		frame.add(jTree);
	}
}
