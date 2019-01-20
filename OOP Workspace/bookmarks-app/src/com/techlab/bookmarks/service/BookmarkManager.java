package com.techlab.bookmarks.service;
import java.awt.Desktop;
import java.io.*;

import com.techlab.bookmarks.business.Bookmark;

public class BookmarkManager {
	// Service : Storing Data
	// Test class
	
	private static File htmlFile = new File("D:\\KUNTAN\\SwabhavRepository\\OOP Workspace\\bookmarks-app\\MyBookmarks.htm");
	
	public void displayURLs() throws Exception {
		
		Desktop.getDesktop().browse(htmlFile.toURI());
	}

	public void addURL(Bookmark bookmark) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(htmlFile, true));
		bw.append("<a href=\""+bookmark.getUrl()+"\">"+bookmark.getName()+"</a><br>\n");
		bw.close();
	}
}
