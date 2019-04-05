package com.techlab.composite.pattern.test;

import com.techlab.composite.pattern.File;
import com.techlab.composite.pattern.Folder;

public class TestFolder {

	public static StringBuffer changable = new StringBuffer();
	
	public static void main(String[] args) {
		
		Folder folder1 = new Folder("Movie");
		File file5=new File("kuntan", "avi", "8KB");
		File file1=new File("abc", "avi", "4KB");
		folder1.addItem(file1);
		folder1.addItem(file5);
		
		Folder folder2 = new Folder("Hindi Movies");
		folder1.addItem(folder2);
		
		File file2=new File("lmn", "avi", "3KB");
		folder2.addItem(file2);
		Folder folder4 = new Folder("Comedy");
		
		File file3=new File("xyz", "avi", "5KB");
		folder4.addItem(file3);
		folder4.addItem(file5);
		folder2.addItem(folder4);
		folder2.addItem(file5);
		
		Folder folder3 = new Folder("English Movies");
		folder1.addItem(folder3);
		folder1.addItem(file5);
		File file4=new File("pqr", "avi", "1KB");
		folder3.addItem(file4);
		folder3.addItem(file5);
		folder1.display();
	}

}
