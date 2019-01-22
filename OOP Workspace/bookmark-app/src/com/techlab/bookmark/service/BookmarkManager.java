package com.techlab.bookmark.service;

import java.awt.Desktop;
import java.io.*;

import com.techlab.bookmark.business.Bookmark;

public class BookmarkManager {

	private File htmlBookmarkFile = new File(
			"Data\\MyBookmarks.htm");;

	public void addURL(Bookmark bookmark) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter(htmlBookmarkFile, true));
		bw.append("<a href=\"" + bookmark.getURLAddress() + "\">" + bookmark.getURLName() + "</a><br>\n");
		bw.close();
	}

	public void displayBookmarks() throws Exception {

		Desktop.getDesktop().browse(htmlBookmarkFile.toURI());
	}

	public void importBookmarks(File htmlFileImport) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter(htmlBookmarkFile, true));
		BufferedReader br = new BufferedReader(new FileReader(htmlFileImport));

		String line = br.readLine();
		while (line != null) {
			bw.append(line);
			line = br.readLine();
		}
		bw.close();
		br.close();
	}

	public void exportBookmarks(File exportedFile) throws Exception {

		InputStream is = new FileInputStream(htmlBookmarkFile);
		OutputStream os = new FileOutputStream(exportedFile);
		byte[] buffer = new byte[1024];
		int length=is.read(buffer);
		while(length > 0)
		{
			os.write(buffer, 0, length);
		}
		is.close();
		os.close();
	}

}
