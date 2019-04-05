package com.techlab.state.capital.hashmap.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.techlab.state.capital.hashmap.CSVFileHTMLBuilder;
import com.techlab.state.capital.hashmap.CSVFileReader;

public class TestCSVFileHTMLBuilder {

	public static void main(String[] args) throws IOException {

		CSVFileReader csvfilereader = new CSVFileReader();
		Map<String, String> sortedbystate = csvfilereader.readCSVFile();

		
		Iterator iterator = sortedbystate.entrySet().iterator();
		for(Map.Entry<String, String> pair:sortedbystate.entrySet()) {
	
	        String key = pair.getKey();
	        String value = pair.getValue();
	        System.out.println("State : "+key+ "\t Capital : "+value);
		}
	}
	
	private static Map<String,String> sortByValue(Map<String,String> unsortedMap){
		Map<String,String> sortedMap = new LinkedHashMap<String,String>();
		List<String> valueList = new ArrayList();
		for(String value : unsortedMap.values()) {
			valueList.add(value);
		}
		Collections.sort(valueList);
		for(String value : valueList) {
			sortedMap.put(getKeyByValueFromMap(unsortedMap, value), value);
		}
		return sortedMap;
	}
	
	public static String getKeyByValueFromMap(Map<String,String> map,String value) {
		
		for(String key:map.keySet()) {
			if(map.get(key).equals(value)){
				return key;
			}
		}
		return null;
	}
	
}
