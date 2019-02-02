package com.techlab.bookmark.presentation;

import java.io.*;
import java.util.Scanner;
import com.techlab.bookmark.business.Bookmark;
import com.techlab.bookmark.service.BookmarkManager;

public class BookmarkMenu {

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to Bookmark App!");
		BookmarkManager bookmarkManager = new BookmarkManager();
		Bookmark bookmark1 = new Bookmark();

		boolean flag = true;

		while (flag) {

			System.out.println("Enter your choice as follows :\n" + "1) 'Add' for Adding URL \n"
					+ "2) 'Export' for exporting Bookmarks \n" + "3) 'Import' for importing Bookmarks \n"
					+ "4) 'Display' for displaying Bookmarks on console \n"
					+ "5) 'Launch' for launching Bookmark App \n" + "6) 'Exit' for exiting Bookmark App");

			String choice = takeInput("Choice");

			switch (choice) {
			case "Add":

				String urlName = takeInput("URL Name");
				String urlAddress = takeInput("URL Address");

				bookmark1.setURLName(urlName);
				bookmark1.setURLAddress(urlAddress);
				bookmarkManager.addURLToHTML(bookmark1);
				bookmarkManager.addURLToCSV(bookmark1);
				break;

			case "Export":

				String exportFileHere = takeInput("Path of File to save exported file");
				String exportAs = takeInput("Name for Exported File");
				String resultantPath = exportFileHere + "\\" + exportAs + ".html";

				File exportFile = new File(resultantPath);
				bookmarkManager.exportBookmarks(exportFile);
				System.out.println("File exported successfully!");
				break;

			case "Import":

				File importFile = new File(takeInput("Path of File to be imported along with name"));
				bookmarkManager.importBookmarks(importFile);
				System.out.println("File imported successfully!");
				break;

			case "Display":

				bookmarkManager.displayBookmarks();
				break;

			case "Launch":

				bookmarkManager.launchBookmark();
				break;

			case "Exit":

				flag = false;
				break;

			default:
				System.out.println("Invalid Input! Read Instructions Carefully Again!");

			}
		}
	}

	private static String takeInput(String input) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + input + " : ");
		return sc.nextLine();
	}
}
