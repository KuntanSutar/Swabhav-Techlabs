package com.org.ste.beans;

import java.util.HashMap;
import java.util.Map;

public class TestFormBean {
	
	private String empFirstName;
	private String empLastName;
	private String city;
	private String empContactNo;
	private String empDispFstName;
	private String empDispLstName;
	private String empID;
	@SuppressWarnings("rawtypes")
	private Map cityMap = new HashMap();
	
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmpContactNo() {
		return empContactNo;
	}
	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}
	public String getEmpDispFstName() {
		return empDispFstName;
	}
	public void setEmpDispFstName(String empDispFstName) {
		this.empDispFstName = empDispFstName;
	}
	public String getEmpDispLstName() {
		return empDispLstName;
	}
	public void setEmpDispLstName(String empDispLstName) {
		this.empDispLstName = empDispLstName;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	@SuppressWarnings("rawtypes")
	public Map getCityMap() {
		return cityMap;
	}
	@SuppressWarnings("rawtypes")
	public void setCityMap(Map cityMap) {
		this.cityMap = cityMap;
	}
	

}
