package com.techlab.readwriteappend;
import java.io.*;

public class ReadWriteAppend {

	public void read() throws Exception {
		File file = new File("D:\\Kuntan\\SwabhavRepository\\OOP Workspace\\readwriteappend-app\\src\\com\\techlab\\readwriteappend\\File1.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
	
		String str = br.readLine();
		while(str!=null)
		{
			System.out.println(str);
		}
		br.close();
	}

}
