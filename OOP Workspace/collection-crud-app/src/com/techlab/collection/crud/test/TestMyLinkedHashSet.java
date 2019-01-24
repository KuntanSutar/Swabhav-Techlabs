package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.*;

public class TestMyLinkedHashSet {

	public static void main(String[] args) {

		MyLinkedHashSet mylinkedhashset = new MyLinkedHashSet();
		LinkedHashSet linkedhashset = new LinkedHashSet();
		mylinkedhashset.create(linkedhashset, 10);
		mylinkedhashset.create(linkedhashset, 20);
		mylinkedhashset.read(linkedhashset);
		
		mylinkedhashset.update(linkedhashset, 30);
		mylinkedhashset.read(linkedhashset);
		
		mylinkedhashset.delete(linkedhashset);
		mylinkedhashset.read(linkedhashset);
	}

}
