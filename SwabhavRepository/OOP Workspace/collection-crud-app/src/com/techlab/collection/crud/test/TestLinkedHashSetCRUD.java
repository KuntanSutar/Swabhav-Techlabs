package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.set.LinkedHashSetCRUD;

public class TestLinkedHashSetCRUD {

	public static void main(String[] args) {

		LinkedHashSetCRUD mylinkedhashset = new LinkedHashSetCRUD();
		LinkedHashSet linkedhashset = new LinkedHashSet();
		mylinkedhashset.create(linkedhashset, 10);
		mylinkedhashset.create(linkedhashset, 20);
		mylinkedhashset.read(linkedhashset);
		
		mylinkedhashset.update(linkedhashset, 30);
		mylinkedhashset.read(linkedhashset);
		
		mylinkedhashset.delete(linkedhashset, 30);
		mylinkedhashset.read(linkedhashset);
	}

}
