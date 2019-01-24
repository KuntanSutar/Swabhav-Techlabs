package com.techlab.collection.crud;

import java.util.*;

public class MyLinkedList {

	public void create(LinkedList newLinkedList, int newNumber) {
		newLinkedList.add(newNumber);
	}
	
	public Object read(LinkedList newLinkedList, int newIndex) {
		return newLinkedList.get(newIndex);
	}
	
	public void update(LinkedList newLinkedList, int newIndex, Object newObject) {
		newLinkedList.set(newIndex, newObject);
	}
	
	public void delete(LinkedList newLinkedList, int newIndex) {
		newLinkedList.remove(newIndex);
	}
}
