package com.techlab.collection.crud;

import java.util.*;

public class MyHashSet {

	public void create(HashSet newHashSet, int newNumber) {
		newHashSet.add(newNumber);
	}
	
	public void read(HashSet newHashSet) {
		System.out.println(newHashSet);
	}
	
	public void update(HashSet newHashSet, int newElement) {
		newHashSet.add(newElement);
	}
	
	public void delete(HashSet newHashSet) {
		newHashSet.clear();
	}
}
