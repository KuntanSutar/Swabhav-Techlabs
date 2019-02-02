package com.techlab.state.capital.hashmap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CSVFileReader {

	public static Map<String, String> statemaplist=new TreeMap();
	
	public static Map<String, String> readCSVFile() throws IOException {

		File file = new File(
				"data\\StateCapitalDirect.csv");
		BufferedReader bufferedreader = new BufferedReader(new FileReader(file));

		String line; 
		while ((line=bufferedreader.readLine()) != null) {
			String[] statecapitalarray = line.split(",");
			statecapitalarray[0] = statecapitalarray[0].trim();
			System.out.println(statecapitalarray[0]);
			statecapitalarray[1] = statecapitalarray[1].trim();
			System.out.println(statecapitalarray[1]);
			statemaplist.put(statecapitalarray[0], statecapitalarray[1]);
		}
		bufferedreader.close();
		
		return statemaplist;
	}
}
