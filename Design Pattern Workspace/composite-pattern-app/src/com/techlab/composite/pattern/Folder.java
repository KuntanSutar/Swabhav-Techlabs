package com.techlab.composite.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlab.composite.pattern.test.TestFolder;

public class Folder implements IDiskItem {

	private String name;
	private List<IDiskItem> items; 
	
	public Folder(String name) {
		this.name = name;
		items=new ArrayList();
	}

	public void addItem(IDiskItem newDiskItem) {
		items.add(newDiskItem);
	}
	
	@Override
	public void display() {
		
		System.out.println(TestFolder.changable+name);
		TestFolder.changable.append("\t");
		for(IDiskItem item : items) {
			IDiskItem iDiskItem = (IDiskItem)item;
			iDiskItem.display();
		}
		TestFolder.changable.setLength(TestFolder.changable.length()-1);
	}

}
