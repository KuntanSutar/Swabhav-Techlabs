package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.StudentService;

public class HomeAction extends ActionSupport {

	@Autowired
	private StudentService service;
	private int totalStudents;
	
	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public String execute() throws Exception {
		totalStudents=service.getAllStudents().size();
		System.out.println(totalStudents);
		return SUCCESS;
	}
}
