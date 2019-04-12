package com.org.ste.beans;
// Generated 28 Jul, 2017 6:10:27 PM by Hibernate Tools 3.4.0.CR1


@SuppressWarnings("serial")
public class TempTestData implements java.io.Serializable {

	private Integer empId;
	private String firstName;
	private String lastName;
	private String city;
	private Integer contactNo;

	public TempTestData() {
	}

	public TempTestData(Integer empId) {
		this.empId = empId;
	}

	public TempTestData(Integer empId, String firstName, String lastName, String city, Integer contactNo) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.contactNo = contactNo;
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}	

	public Integer getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
