package com.techlab.student;

public class Student extends SortByFirstName implements Comparable<Student> {

	private int rollno;
	private String fname;
	private String lname;

	public Student(int newRollno, String newFname, String newLname) {
		rollno = newRollno;
		fname = newFname;
		lname = newLname;
	}

	public int getRollNo() {
		return rollno;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	//Reference Equality & Content Equality
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public int compareTo(Student newStudent) {
	
		if(rollno>newStudent.getRollNo()) {
			return -1;
		}
		if(rollno<newStudent.getRollNo()) {
			return 1;
		}
		return 0;
	}

}
