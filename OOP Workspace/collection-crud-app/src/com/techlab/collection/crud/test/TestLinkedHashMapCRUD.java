package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.map.LinkedHashMapCRUD;

public class TestLinkedHashMapCRUD {

	public static void main(String[] args) {
		
		LinkedHashMapCRUD mylinkedhashmap = new LinkedHashMapCRUD();
		LinkedHashMap linkedhashmap = new LinkedHashMap();
		mylinkedhashmap.create(linkedhashmap, 1, "Kuntan");
		mylinkedhashmap.create(linkedhashmap, 2, "Prasad");
		mylinkedhashmap.read(linkedhashmap);
		
		mylinkedhashmap.update(linkedhashmap, 2, "Kiran");
		mylinkedhashmap.read(linkedhashmap);
		
		mylinkedhashmap.delete(linkedhashmap, 2);
		mylinkedhashmap.read(linkedhashmap);
	}

}
