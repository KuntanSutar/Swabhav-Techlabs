package com.techlab.employee.analyser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class URLLoader implements ILoadable {

	private String urlName;
	
	public URLLoader(String newURL) {
		urlName=newURL;
	}
	
	@Override
	public ArrayList<String> load() throws IOException {

		ArrayList<String> contentArrayList = new ArrayList();
		URL url = new URL(urlName);
		URLConnection urlConnection = url.openConnection();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line;

		while ((line = bufferedReader.readLine()) != null) {
			contentArrayList.add(line);
		}
		bufferedReader.close();

		return contentArrayList;
	}

}
