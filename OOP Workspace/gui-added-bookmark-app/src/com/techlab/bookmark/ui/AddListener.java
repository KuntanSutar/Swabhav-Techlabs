package com.techlab.bookmark.ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddListener implements ActionListener {

	private File bookmarksCSVFile = new File("data\\BookmarksCSVFile.csv");
	private BookmarkFrame bookmarkFrame;
	
	public AddListener(BookmarkFrame newBookmarkFrame) {
		bookmarkFrame=newBookmarkFrame;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			addBookmark();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addBookmark() throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bookmarksCSVFile, true));
		bufferedWriter.append(bookmarkFrame.getTextFiled1().getText()+",");
		bufferedWriter.append(bookmarkFrame.getTextField2().getText());
		bufferedWriter.append("\n");
		bufferedWriter.close();
	}

}
