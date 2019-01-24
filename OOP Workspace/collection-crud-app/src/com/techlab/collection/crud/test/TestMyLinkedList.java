package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.MyLinkedList;

public class TestMyLinkedList {

	public static void main(String[] args) {

		MyLinkedList myLinkedList = new MyLinkedList();
		LinkedList linkedlist = new LinkedList();
		myLinkedList.create(linkedlist, 10);
		myLinkedList.create(linkedlist, 20);
		System.out.println(linkedlist);
		
		int value=(int)myLinkedList.read(linkedlist, 0);
		System.out.println(value);
		
		myLinkedList.update(linkedlist, 0, 30);
		System.out.println(linkedlist);
		
		myLinkedList.delete(linkedlist, 0);
		System.out.println(linkedlist);
	}

}
