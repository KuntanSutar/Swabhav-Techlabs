package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.map.TreeMapCRUD;

public class TestTreeMapCRUD {

	public static void main(String[] args) {

		TreeMapCRUD mytreemap = new TreeMapCRUD();
		TreeMap treemap = new TreeMap();
		mytreemap.create(treemap, 1, "Kuntan");
		mytreemap.create(treemap, 2, "Prasad");
		mytreemap.read(treemap);
		
		mytreemap.update(treemap, 2, "Kiran");
		mytreemap.read(treemap);
		
		mytreemap.delete(treemap, 2);
		mytreemap.read(treemap);
	}

}
