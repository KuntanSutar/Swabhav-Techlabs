package com.techlab.bookmarks.presentation;

import java.util.Scanner;

import com.techlab.bookmarks.business.Bookmark;
import com.techlab.bookmarks.service.BookmarkManager;

public class BookmarkConsole {
	// Presentation
	// No Test Class

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to Bookmark App!");
		Scanner sc = new Scanner(System.in);
		BookmarkManager bookmarkManager = new BookmarkManager();
		Bookmark bookmark = new Bookmark();

		boolean flag = true;
		String choice;
		OperationOptions operationOption;

		while (flag) {
			System.out.println("Enter URL Name : ");
			System.out.println("Enter URL Link : ");
			String name = sc.nextLine();
			String url = sc.nextLine();

			bookmark.setName(name);
			bookmark.setUrl(url);
			bookmarkManager.addURL(bookmark);
			
			System.out.println("Enter your choice : ");
			choice = sc.nextLine();
			
			flag = checkChoice(choice);
		}

		bookmarkManager.displayURLs();

	}

	private static boolean checkChoice(String choice) {
		
		if (choice.equalsIgnoreCase(OperationOptions.ADD.toString())) {
			return true;
		}
		return false;
	}

}
