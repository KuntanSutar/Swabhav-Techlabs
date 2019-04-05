package com.techlab.employee.analyser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiskLoader implements ILoader {

	private String path;
	
	public DiskLoader(String newPath) {
		path=newPath;
	}
	
	@Override
	public ArrayList<String> load() throws IOException {

		ArrayList<String> contentarraylist = new ArrayList();
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String line;
		while ((line = br.readLine()) != null) {
			contentarraylist.add(line);
		}
		br.close();
		return contentarraylist;
	}

}
