package com.techlab.collection.crud.set;

import java.util.*;

public class TreeSetCRUD {

	public void create(TreeSet newTreeSet, int newElement) {
		newTreeSet.add(newElement);
	}
	
	public void read(TreeSet newTreeSet) {
		System.out.println(newTreeSet);
	}
	
	public void update(TreeSet newTreeSet, int newElement) {
		newTreeSet.add(newElement);
	}
	
	public void delete(TreeSet newTreeSet, int newElement) {
		newTreeSet.remove(newElement);
	}
}
