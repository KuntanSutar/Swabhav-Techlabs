package com.techlab.state.capital.hashmap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CSVFileHTMLBuilder {

	public static void generateHTML() throws IOException {

		Map<String, String> statemapliststateascending = CSVFileReader.readCSVFile();
		Map<String, String> statemaplistcapitalascending = new TreeMap(new CapitalComparator());
		FileWriter fw = new FileWriter(new File(
				"data\\StateCapitalReport.html"));
		Iterator iterator = statemapliststateascending.entrySet().iterator();
		fw.write("<h1>State\t\t"+"Capital"+"</h1>");
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();
			String state = (String) pair.getKey();
			String capital = (String) pair.getValue();
			fw.write("<p>"+state+"\t\t"+capital+"</p><br>");
		}
		fw.close();
	}

}
