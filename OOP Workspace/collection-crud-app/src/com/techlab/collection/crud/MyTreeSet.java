package com.techlab.collection.crud;

import java.util.*;

public class MyTreeSet {

	public void create(TreeSet newTreeSet, int newNumber) {
		newTreeSet.add(newNumber);
	}
	
	public void read(TreeSet newTreeSet) {
		System.out.println(newTreeSet);
	}
	
	public void update(TreeSet newTreeSet, int newElement) {
		newTreeSet.add(newElement);
	}
	
	public void delete(TreeSet newTreeSet) {
		newTreeSet.clear();
	}
}
