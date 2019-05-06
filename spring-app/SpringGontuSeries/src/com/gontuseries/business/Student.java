package com.gontuseries.business;

import java.util.ArrayList;
import java.util.Date;

public class Student {

	private String name;
	private String hobby;
	private Long mobileNo;
	private Date dob;
	private ArrayList<String> skills;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Long getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(Long mobile) {
		this.mobileNo = mobile;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public ArrayList<String> getSkills() {
		return skills;
	}
	
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
