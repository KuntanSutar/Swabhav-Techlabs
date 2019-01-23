package com.techlab.bookmark.presentation;

import java.io.*;
import java.util.Scanner;
import com.techlab.bookmark.business.Bookmark;
import com.techlab.bookmark.service.BookmarkManager;

public class BookmarkMenu {

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to Bookmark App!");
		System.out.println(
				"Enter your choice: 1) Add URL 2) Display Bookmarks " + "3) Import Bookmarks 4) Export Bookmarks");
		String choice = takeInput("Choice");
		BookmarkManager bookmarkManager = new BookmarkManager();
		Bookmark bookmark1 = new Bookmark();
		boolean flag=true;
		
		while(flag)
		{	
			switch(choice)
			{
			case "ChoiceOptions.ADD.toString()": addUrl(bookmark1, bookmarkManager);
			
			case "ChoiceOptions.EXPORT.toString()": exportBookmark(bookmarkManager);
			
			case "ChoiceOptions.IMPORT.toString()" : importBookmark(bookmarkManager);
			
			case "ChoiceOptions.EXIT.toString()" : flag=false; break;
			}
		}
		}
		

	private static void importBookmark(BookmarkManager bookmarkManager) throws Exception {
		File importFile = new File(takeInput("Path of File to be imported"));
		bookmarkManager.importBookmarks(importFile);
	}

	private static void exportBookmark(BookmarkManager bookmarkManager) throws Exception {
		
		String exportAs = takeInput("Name for Exported File");
		String exportFileHere = takeInput("Path of File to export");
		String resultantPath = exportFileHere+"//"+exportAs;
		File exportFile = new File(resultantPath);
		bookmarkManager.exportBookmarks(exportFile);
	}

	private static void addUrl(Bookmark bookmark1, BookmarkManager bookmarkManager) throws Exception {
		
		String urlName = takeInput("URL Name");
		String urlAddress = takeInput("URL Address");

		bookmark1.setURLName(urlName);
		bookmark1.setURLAddress(urlAddress);
		bookmarkManager.addURL(bookmark1);
	}

	private static String takeInput(String input) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + input + " : ");
		return sc.nextLine();
	}
}
