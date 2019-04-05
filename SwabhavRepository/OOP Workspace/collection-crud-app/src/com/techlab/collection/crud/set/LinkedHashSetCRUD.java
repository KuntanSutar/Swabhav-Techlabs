package com.techlab.collection.crud.set;

import java.util.*;

public class LinkedHashSetCRUD {

	public void create(LinkedHashSet newLinkedHashSet, int newNumber) {
		newLinkedHashSet.add(newNumber);
	}
	
	public void read(LinkedHashSet newLinkedHashSet) {
		System.out.println(newLinkedHashSet);
	}
	
	public void update(LinkedHashSet newLinkedHashSet, int newElement) {
		newLinkedHashSet.add(newElement);
	}
	
	public void delete(LinkedHashSet newLinkedHashSet, Object newElement) {
		newLinkedHashSet.remove(newElement);
	}
}
