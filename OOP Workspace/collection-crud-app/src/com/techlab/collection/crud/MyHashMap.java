package com.techlab.collection.crud;

import java.util.*;

public class MyHashMap {

	public void create(HashMap newHashMap, Object newKey, Object newValue) {
		newHashMap.put(newKey, newValue);
	}
	
	public void read(HashMap newHashMap) {
		System.out.println(newHashMap);
	}
	
	public void update(HashMap newHashMap, Object newKey, Object newValue) {
		newHashMap.put(newKey, newValue);
	}
	
	public void delete(HashMap newHashMap, Object newKey) {
		newHashMap.remove(newKey);
	}
}
