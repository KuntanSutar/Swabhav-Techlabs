package com.techlab.student;

import java.util.Comparator;

public class SortByLastName implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		String lname1 = student1.getLname();
		String lname2 = student2.getLname();
		return lname2.compareTo(lname1);
	}
}
