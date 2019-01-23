package com.techlab.person;

import com.techlab.college.Branch;
import com.techlab.college.College;

public class Student extends Person {

	private String name;
	private College college;
	private Branch branch;

	public Student(int newID, String newAddress, String newDOB, String newName, 
			College newCollege, Branch newBranch) {
		super(newID, newAddress, newDOB);
		name = newName;
		college = newCollege;
		branch=newBranch;
	}

	public String getName() {
		return name;
	}

	public Branch getBranch() {
		return branch;
	}
	
}
