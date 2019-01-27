package com.techlab.bookmark.service;

import java.awt.Desktop;
import java.io.*;

import com.techlab.bookmark.business.Bookmark;

public class BookmarkManager {

	private static File bookmarkFile = new File("data\\Bookmarks.html");

	public void addURL(Bookmark bookmark) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter(bookmarkFile, true));
		bw.append("<a href=" + bookmark.getURLAddress() + ">" + bookmark.getURLName() + "</a><br>\n");
		bw.close();

		System.out.println("****** URl added successfully with name " + bookmark.getURLName() + " and address "
				+ bookmark.getURLAddress() + " ******");
	}

	public void exportBookmarks(File exportedFile) throws Exception {

		InputStream is = new FileInputStream(bookmarkFile);
		OutputStream os = new FileOutputStream(exportedFile);
		byte[] buffer = new byte[1024];

		int length;
		while ((length = is.read(buffer)) > 0) {
			os.write(buffer, 0, length);
		}

		is.close();
		os.close();
		System.out.println("****** Bookmark exported successfully ******");
	}

	public void importBookmarks(File htmlFileImport) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter(bookmarkFile, true));
		BufferedReader br = new BufferedReader(new FileReader(htmlFileImport));

		String line;
		while ((line = br.readLine()) != null) {
			bw.append(line + "<br>\n");
		}

		bw.close();
		br.close();
		System.out.println("****** Bookmark imported successfully ******");
	}

	public void displayBookmarks() throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(bookmarkFile));

		System.out.println("****** Bookmark ******");
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

	public void launchBookmark() throws Exception {

		Desktop.getDesktop().browse(bookmarkFile.toURI());
	}

}
