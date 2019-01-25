package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.map.HashMapCRUD;

public class TestHashMapCRUD {

	public static void main(String[] args) {

		HashMapCRUD myhashmap = new HashMapCRUD();
		HashMap hashmap = new HashMap();
		myhashmap.create(hashmap, 1, "Kuntan");
		myhashmap.create(hashmap, 2, "Prasad");
		myhashmap.read(hashmap);

		myhashmap.update(hashmap, 2, "Kiran");
		myhashmap.read(hashmap);

		myhashmap.delete(hashmap, 2);
		myhashmap.read(hashmap);
	}

}
