package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.MyTreeMap;

public class TestMyTreeMap {

	public static void main(String[] args) {

		MyTreeMap mytreemap = new MyTreeMap();
		TreeMap treemap = new TreeMap();
		mytreemap.create(treemap, 1, "Kuntan");
		mytreemap.create(treemap, 2, "Prasad");
		mytreemap.read(treemap);
		
		mytreemap.update(treemap, 3, "Kiran");
		mytreemap.read(treemap);
		
		mytreemap.delete(treemap, 2);
		mytreemap.read(treemap);
	}

}
