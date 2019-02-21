package com.techlab.hierarchy.builder.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Set;

import com.techlab.hierarchy.builder.DiskLoader;
import com.techlab.hierarchy.builder.Employee;
import com.techlab.hierarchy.builder.HierarchyBuilder;
import com.techlab.hierarchy.builder.Parser;


public class TestHierarchyBuilder {

	public static StringBuffer changable = new StringBuffer();
	
	public static void main(String[] args) throws Exception {

		DiskLoader diskLoader = new DiskLoader("data\\dataFile.txt");
		ArrayList<String> employeeDetailsList=diskLoader.loadFile();
		
		Parser parser = new Parser();
		Set<Employee> employeeDetailsSet = parser.parse(employeeDetailsList);
		
		HierarchyBuilder hierarchyBuilder = new HierarchyBuilder(employeeDetailsSet);
		Employee ceo = hierarchyBuilder.getRootEmployee();
		ceo.displayHierarchy();
		//System.out.println(changable);
		System.out.println(ceo.displayXML());
		StringBuffer stringBufferXMLContent = ceo.displayXML();
		String stringXMLContent = stringBufferXMLContent.toString();
//		hierarchyBuilder.createHeirarchy();
		//generateXMLFile(stringXMLContent);
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data//EmployeeDetailsXMLFile.xml"));
		bufferedWriter.write(stringXMLContent);
		bufferedWriter.close();
	}

	public static void generateXMLFile(String string) throws Exception {
//		FileWriter fileWriter =new FileWriter("data//EmployeeDetailsXMLFile.xml");
//		fileWriter.write(string);
//		fileWriter.close();
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data//EmployeeDetailsXMLFile.xml"));
		bufferedWriter.write(string);
		bufferedWriter.close();
	}
}
