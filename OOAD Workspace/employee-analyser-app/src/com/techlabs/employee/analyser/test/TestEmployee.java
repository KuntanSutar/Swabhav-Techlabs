package com.techlabs.employee.analyser.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.TreeSet;

import com.techlab.employee.analyser.DataAnalyser;
import com.techlab.employee.analyser.DiskLoader;
import com.techlab.employee.analyser.Employee;
import com.techlab.employee.analyser.Parser;
import com.techlab.employee.analyser.URLLoader;

public class TestEmployee {

	public static void main(String[] args) throws Exception {

		URLLoader urlloader = new URLLoader("https://swabhav-tech.firebaseapp.com/emp.txt");
		DiskLoader diskloader = new DiskLoader("data\\dataFile.txt");
		
		
		System.out.println(urlloader.load());
		System.out.println(diskloader.load());
		
	}
}
