package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.MyHashMap;

public class TestMyHashMap {

	public static void main(String[] args) {

		MyHashMap myhashmap = new MyHashMap();
		HashMap hashmap = new HashMap();
		myhashmap.create(hashmap, 1, "Kuntan");
		myhashmap.create(hashmap, 2, "Prasad");
		myhashmap.read(hashmap);
		
		myhashmap.update(hashmap, 3, "Kiran");
		myhashmap.read(hashmap);
		
		myhashmap.delete(hashmap, 2);
		myhashmap.read(hashmap);
	}

}
