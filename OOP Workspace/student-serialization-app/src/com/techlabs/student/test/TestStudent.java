package com.techlabs.student.test;

import java.io.*;
import com.techlab.student.Student;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		Student std1 = new Student("Kuntan", 1, 6.5);
		File fl = new File("D:\\KUNTAN\\SwabhavRepository\\OOP Workspace\\student-serialization-app\\"
				+ "src\\com\\techlab\\student\\Student.txt");
		serializeObject(fl, std1);
		Student std2 = deserializeObject(fl, std1);
		printDetails(std1);
		printDetails(std2);
	}

	private static void printDetails(Student std1) {
		System.out.println(" Name : " + std1.getName() + 
				  "\t Roll Number : " + std1.getRollno()+
				         "\t CGPA : "+ std1.getCgpa());
	}

	private static void serializeObject(File fl, Student std1) throws Exception {
		FileOutputStream fos = new FileOutputStream(fl);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std1);
		oos.close();
	}

	private static Student deserializeObject(File fl, Student std1) throws Exception {
		FileInputStream fis = new FileInputStream(fl);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student serializedObject = (Student) ois.readObject();
		ois.close();
		return serializedObject;
	}
}
