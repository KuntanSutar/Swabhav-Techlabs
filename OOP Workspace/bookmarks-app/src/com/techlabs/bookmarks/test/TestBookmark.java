package com.techlabs.bookmarks.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.techlab.bookmarks.Bookmark;

public class TestBookmark {

	public static void main(String[] args) throws Exception {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter URL Name : ");
//	    System.out.println("Enter URL URL : ");
//		String name = sc.nextLine();
//		String url = sc.nextLine();
//		Bookmark b1 = new Bookmark();
//		System.out.println(b1.getName()+"..."+b1.getUrl());
		addURL("https://www.youtube.com/", "Kuntan");
		addURL("https://www.facebook.com/", "Prasad");
	}

	private static void addURL(String newUrl, String newName) throws Exception {
		
		File file1 = new File("D:\\KUNTAN\\SwabhavRepository\\OOP Workspace\\bookmarks-app\\MyBookmarks.htm");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true));
		bw.write("<a href=\""+newUrl+"\">"+newName+"</a><br>\n");
		bw.close();
	}
	
}
