package com.techlab.hierarchy.builder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DiskLoader {

	private String fileName;
	private ArrayList<String> list = new ArrayList<String>();

	public DiskLoader(String fileName) {
		this.fileName = fileName;
	}

	public ArrayList<String> loadFile() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		return list;
	}
	
}
