package com.techlab.readwriteappend;
import java.io.*;

public class ReadWriteAppend {
	private File dafault = null;

	public void checkFile(File newFile)
	{
		String name = newFile.getName();
		if(name.endsWith("txt")||name.endsWith("htm"))
		{
			dafault=newFile;
		}
	}
	
	public void read(File newFile) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(newFile));
	
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}
	
	public void write(File newFile, String message) throws Exception
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
		bw.write(message);
		bw.close();
	}
	 
	public void append(File newFile, String message) throws Exception
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter(newFile, true));
		bw.write(message);
		bw.close();
	}
	
	
}
