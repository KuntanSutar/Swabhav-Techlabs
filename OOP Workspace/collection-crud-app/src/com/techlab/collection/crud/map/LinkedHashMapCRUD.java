package com.techlab.collection.crud.map;

import java.util.*;

public class LinkedHashMapCRUD {

	public void create(LinkedHashMap newLinkedHashMap, Object newKey, Object newValue) {
		newLinkedHashMap.put(newKey, newValue);
	}
	
	public void read(LinkedHashMap newLinkedHashMap) {
		System.out.println(newLinkedHashMap);
	}
	
	public void update(LinkedHashMap newLinkedHashMap, Object newKey, Object newValue) {
		newLinkedHashMap.replace(newKey, newValue);
	}
	
	public void delete(LinkedHashMap newLinkedHashMap, Object newKey) {
		newLinkedHashMap.remove(newKey);
	}
}
