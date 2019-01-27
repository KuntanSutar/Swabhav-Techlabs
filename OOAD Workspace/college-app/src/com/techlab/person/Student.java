package com.techlab.person;

import java.util.Date;

import com.techlab.college.BranchOptions;
import com.techlab.college.College;

public class Student extends Person {

	private String name;
	private College college;
	private BranchOptions branch;

	public Student(int newID, String newAddress, Date newDOB, String newName, College newCollege,
			BranchOptions newBranch) {
		super(newID, newAddress, newDOB);
		name = newName;
		college = newCollege;
		branch = newBranch;
	}

	public String getName() {
		return name;
	}

	public BranchOptions getBranch() {
		return branch;
	}

}
