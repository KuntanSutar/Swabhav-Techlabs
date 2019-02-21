package com.techlab.hierarchy.builder;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Parser {

	private Set<Employee> empSet = new TreeSet<Employee>();

	public Set<Employee> parse(ArrayList<String> data) throws Exception {
		
		for (String line : data) {
			String string = line;
			String[] linedata = string.split(",");

			Integer id = Integer.parseInt(linedata[0]);
			String name = linedata[1].replace("\'", "");
			String designation = linedata[2].replace("\'", "");
			Integer managerId=linedata[3].equalsIgnoreCase("NULL")?null:Integer.parseInt(linedata[3]);
			Employee employee = new Employee(id, managerId, name, designation);
			empSet.add(employee);
		}
		return empSet;
	}
}
