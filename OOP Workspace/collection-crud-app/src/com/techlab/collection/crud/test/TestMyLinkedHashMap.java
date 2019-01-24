package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.MyLinkedHashMap;

public class TestMyLinkedHashMap {

	public static void main(String[] args) {
		
		MyLinkedHashMap mylinkedhashmap = new MyLinkedHashMap();
		LinkedHashMap linkedhashmap = new LinkedHashMap();
		mylinkedhashmap.create(linkedhashmap, 1, "Kuntan");
		mylinkedhashmap.create(linkedhashmap, 2, "Prasad");
		mylinkedhashmap.read(linkedhashmap);
		
		mylinkedhashmap.update(linkedhashmap, 3, "Kiran");
		mylinkedhashmap.read(linkedhashmap);
		
		mylinkedhashmap.delete(linkedhashmap, 2);
		mylinkedhashmap.read(linkedhashmap);
	}

}
