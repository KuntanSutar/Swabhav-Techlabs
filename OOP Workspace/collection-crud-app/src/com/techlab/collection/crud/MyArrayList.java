package com.techlab.collection.crud;

import java.util.*;

public class MyArrayList {

	public void create(ArrayList newArrayList, int newNumber) {
		newArrayList.add(newNumber);
	}
	
	public Object read(ArrayList newArrayList, int newIndex) {
		return newArrayList.get(newIndex);
	}
	
	public void update(ArrayList newArrayList, int newIndex, Object newObject) {
		newArrayList.set(newIndex, newObject);
	}
	
	public void delete(ArrayList newArrayList, int newIndex) {
		newArrayList.remove(newIndex);
	}
	
}
