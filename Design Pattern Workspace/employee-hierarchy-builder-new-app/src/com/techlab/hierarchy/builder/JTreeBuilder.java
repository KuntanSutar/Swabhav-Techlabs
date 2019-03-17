package com.techlab.hierarchy.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeBuilder {

	JFrame jFrame;

	public void buildJTree() throws Exception {
		Map<String, DefaultMutableTreeNode> tree = new HashMap<String, DefaultMutableTreeNode>();
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

		DiskLoader fileLoader = new DiskLoader("data//dataFile.txt");
		ArrayList<String> list = fileLoader.loadFile();

		Parser employeeParser = new Parser();
		Set<Employee> empSet = employeeParser.parse(list);
		HierarchyBuilder builder = new HierarchyBuilder(empSet);
		empMap = builder.getEmpMap();
		Employee rootEmployee = builder.getRootEmployee();

		jFrame = new JFrame();
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			DefaultMutableTreeNode obj = new DefaultMutableTreeNode(entry.getValue().getEmpName());
			tree.put(entry.getValue().getEmpName(), obj);
		}

		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			if (empMap.containsKey(entry.getValue().getManagerId())) {
				Employee employee = empMap.get(entry.getValue().getManagerId());
				Employee repotee = entry.getValue();

				DefaultMutableTreeNode empObj = tree.get(employee.getEmpName());
				DefaultMutableTreeNode repoteeObj = tree.get(repotee.getEmpName());

				empObj.add(repoteeObj);
			}
		}

		DefaultMutableTreeNode rootEmpObj = tree.get(rootEmployee.getEmpName());

		JTree jTree = new JTree(rootEmpObj);
		jFrame.add(jTree);
		jFrame.setSize(500, 500);
		jFrame.setVisible(true);
	}
}
