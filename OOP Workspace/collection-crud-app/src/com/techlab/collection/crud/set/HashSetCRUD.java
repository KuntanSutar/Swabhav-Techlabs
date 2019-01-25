package com.techlab.collection.crud.set;

import java.util.*;

public class HashSetCRUD {

	public void create(HashSet newHashSet, int newElement) {
		newHashSet.add(newElement);
	}
	
	public void read(HashSet newHashSet) {
		System.out.println(newHashSet);
	}
	
	public void update(HashSet newHashSet, int newElement) {
		newHashSet.add(newElement);
	}
	
	public void delete(HashSet newHashSet, Object newElement) {
		newHashSet.remove(newElement);
	}
}
