package com.techlab.property.file.test;

import java.io.*;
import java.util.*;

public class TestMyPropertyFile {

	public static void main(String[] args) throws Exception {

		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("D:\\KUNTAN\\SwabhavRepository\\OOP"+" "+"Workspace\\property-file-app\\data\\mycredentials.properties");
		properties.load(fis);
		
		System.out.println(properties);
		String username = properties.getProperty("user");
		System.out.println(username);
		
		String password = properties.getProperty("password");
		System.out.println(password);
		
		FileOutputStream fos = new FileOutputStream("D:\\KUNTAN\\SwabhavRepository\\OOP"+" "+"Workspace\\property-file-app\\data\\mycredentials.properties");
		properties.store(fos, "Updated by me!");
	}

}
