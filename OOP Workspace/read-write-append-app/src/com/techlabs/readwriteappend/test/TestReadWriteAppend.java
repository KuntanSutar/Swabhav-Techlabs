package com.techlabs.readwriteappend.test;
import java.io.File;

import com.techlab.readwriteappend.*;

public class TestReadWriteAppend {

	public static void main(String[] args) throws Exception {
		File file1 = new File("D:\\Kuntan\\SwabhavRepository\\OOP Workspace\\readwriteappend-app\\src\\com\\techlab\\readwriteappend\\file1.txt");
		File file2 = new File("D:\\Kuntan\\SwabhavRepository\\OOP Workspace\\readwriteappend-app\\src\\com\\techlab\\readwriteappend\\file2.txt");
		ReadWriteAppend rwa = new ReadWriteAppend();
		rwa.read(file1);
		rwa.write(file2, "Hello, welcome to world of Java");
		rwa.append(file2, "Message appended!");
		
	}
}
