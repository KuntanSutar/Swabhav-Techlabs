package com.techlab.collection.crud.test;

import java.util.*;

import com.techlab.collection.crud.list.ArrayListCRUD;

public class TestArrayListCRUD {

	public static void main(String[] args) {
		
		ArrayListCRUD myArrayList = new ArrayListCRUD();
		ArrayList arraylist = new ArrayList();
		myArrayList.create(arraylist, 10);
		myArrayList.create(arraylist, 20);
		System.out.println(arraylist);
		
		int value=(int)myArrayList.read(arraylist, 0);
		System.out.println(value);
		
		myArrayList.update(arraylist, 0, 30);
		System.out.println(arraylist);
		
		myArrayList.delete(arraylist, 0);
		System.out.println(arraylist);
	}
	
}
