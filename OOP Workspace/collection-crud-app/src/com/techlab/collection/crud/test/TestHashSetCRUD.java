package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.set.HashSetCRUD;

public class TestHashSetCRUD {

	public static void main(String[] args) {
		
		HashSetCRUD myHashSet = new HashSetCRUD();
		HashSet hashset = new HashSet();
		myHashSet.create(hashset, 10);
		myHashSet.create(hashset, 20);
		myHashSet.read(hashset);
		
		myHashSet.update(hashset, 30);
		myHashSet.read(hashset);
		
		myHashSet.delete(hashset, 30);
		myHashSet.read(hashset);
	}

}
