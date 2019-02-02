package com.techlab.employee.analyser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DiskLoader implements ILoadable {

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
		return contentarraylist;
	}

}
