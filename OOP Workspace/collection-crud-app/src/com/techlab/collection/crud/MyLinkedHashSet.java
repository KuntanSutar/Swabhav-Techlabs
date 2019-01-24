package com.techlab.collection.crud;

import java.util.*;

public class MyLinkedHashSet {

	public void create(LinkedHashSet newLinkedHashSet, int newNumber) {
		newLinkedHashSet.add(newNumber);
	}
	
	public void read(LinkedHashSet newLinkedHashSet) {
		System.out.println(newLinkedHashSet);
	}
	
	public void update(LinkedHashSet newLinkedHashSet, int newElement) {
		newLinkedHashSet.add(newElement);
	}
	
	public void delete(LinkedHashSet newLinkedHashSet) {
		newLinkedHashSet.clear();
	}
}
