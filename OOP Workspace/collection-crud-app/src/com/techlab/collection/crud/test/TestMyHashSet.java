package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.MyHashSet;

public class TestMyHashSet {

	public static void main(String[] args) {
		
		MyHashSet myHashSet = new MyHashSet();
		HashSet hashset = new HashSet();
		myHashSet.create(hashset, 10);
		myHashSet.create(hashset, 20);
		myHashSet.read(hashset);
		
		myHashSet.update(hashset, 30);
		myHashSet.read(hashset);
		
		myHashSet.delete(hashset);
		myHashSet.read(hashset);
	}

}
