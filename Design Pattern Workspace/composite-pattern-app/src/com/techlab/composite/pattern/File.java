package com.techlab.composite.pattern;

import com.techlab.composite.pattern.test.TestFolder;

public class File implements IDiskItem {

	private String name;
	private String extension;
	private String size;
	
	public File() {
		
	}
	
	public File(String name, String extension, String size) {
		this.name = name;
		this.extension = extension;
		this.size = size;
	}

	@Override
	public void display() {
		System.out.println(TestFolder.changable+"File : "+name+"."+extension+"("+size+")");
	}

}
