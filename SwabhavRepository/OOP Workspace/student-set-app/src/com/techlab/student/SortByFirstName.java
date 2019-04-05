package com.techlab.student;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		String fname1 = student1.getFname();
		String fname2 = student2.getFname();
		return fname1.compareTo(fname2);
	}

}
