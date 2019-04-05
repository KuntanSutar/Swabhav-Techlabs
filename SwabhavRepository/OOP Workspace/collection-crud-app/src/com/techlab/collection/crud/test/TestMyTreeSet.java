package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.set.TreeSetCRUD;

public class TestMyTreeSet {

	public static void main(String[] args) {

		TreeSetCRUD mytreeset = new TreeSetCRUD();
		TreeSet treeset = new TreeSet();
		mytreeset.create(treeset, 10);
		mytreeset.create(treeset, 20);	
		mytreeset.read(treeset);
		
		mytreeset.update(treeset, 30);
		mytreeset.read(treeset);
		
		mytreeset.delete(treeset, 30);
		mytreeset.read(treeset);
	}

}
