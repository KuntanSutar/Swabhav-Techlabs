package com.techlab.state.capital.hashmap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CSVFileGenerator {

	public static void generateCSVFileManually() throws Exception {
		Map<String, String> statecapitaldetails = new HashMap();
		statecapitaldetails.put("  Maharashtra ", "Mumbai");
		statecapitaldetails.put("  Bihar", " Patna");
		statecapitaldetails.put(" Maharashtra", " Mumbai ");
		statecapitaldetails.put(" Maharashtra ", "  Mumbai ");
		statecapitaldetails.put("Gujrat   ", " Gandhinagar");

		File file = new File("data\\StateCapital.csv");
		FileWriter filewriter = new FileWriter(file);
		
		Iterator iterator = statecapitaldetails.entrySet().iterator();
		for(Map.Entry<String, String> pair:statecapitaldetails.entrySet()) {
	
	        String key = pair.getKey();
	        String value = pair.getValue();
	        if(!key.startsWith(" ") & !key.endsWith(" ")) {
	        	filewriter.write(key);
	        	filewriter.write(",");
	        	filewriter.write(value);
	        	System.out.println("State Added : "+key+", "+"Capital Added : "+value);
	        	filewriter.write("\n");
	        }
		}
		filewriter.close();
	}
	
}
