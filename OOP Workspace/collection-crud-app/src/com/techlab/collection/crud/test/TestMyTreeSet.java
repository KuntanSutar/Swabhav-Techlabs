package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.MyTreeSet;

public class TestMyTreeSet {

	public static void main(String[] args) {

		MyTreeSet mytreeset = new MyTreeSet();
		TreeSet treeset = new TreeSet();
		mytreeset.create(treeset, 10);
		mytreeset.create(treeset, 20);	
		mytreeset.read(treeset);
		
		mytreeset.update(treeset, 30);
		mytreeset.read(treeset);
		
		mytreeset.delete(treeset);
		mytreeset.read(treeset);
	}

}
