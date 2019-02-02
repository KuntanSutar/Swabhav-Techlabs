package com.techlabs.csv.filereaderwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadWriteCsvFile {
	public static Map<String, String> hashMap = new HashMap<String, String>();

	public static void main(String[] args) throws IOException {
		String fileName = "D://StateCapital.csv";
		csvFileReader(fileName);
		System.out.println("Before Sort : " + hashMap);
		System.out.println("After Sort By Key: " + sortByKey(hashMap));
		System.out.println("After Sort By Value: " + sortByValue(hashMap));
	}

	private static Map<String,String> sortByKey(Map<String,String> unsortedMap){
		Map<String,String> sortedMap = new LinkedHashMap<String,String>();
		List<String> keyList = new ArrayList<String>();
		for(String key : unsortedMap.keySet()) {
			keyList.add(key);
		}
		Collections.sort(keyList);
		for(String key : keyList) {
			sortedMap.put(key, unsortedMap.get(key));
		}
		return sortedMap;
	}
	
	private static Map<String,String> sortByValue(Map<String,String> unsortedMap){
		Map<String,String> sortedMap = new LinkedHashMap<String,String>();
		List<String> valueList = new ArrayList<String>();
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
	
	public static void csvFileReader(String fileName) throws IOException {

		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String string;
		while ((string = br.readLine()) != null) {
			string = string.toLowerCase();
			String[] names = string.split(",");
			//addDataMap(names);
			hashMap.put(names[0].trim(), names[1].trim());
			System.out.println(Arrays.toString(names));
			
		}
		//System.out.println(hashMap);
		System.out.println("\n");
		br.close();
	}

	public static void addDataMap(String[] names) {
		hashMap.put(names[0].trim(), names[1].trim());

	}

}
