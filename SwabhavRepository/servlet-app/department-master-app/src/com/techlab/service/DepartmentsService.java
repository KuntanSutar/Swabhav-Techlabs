package com.techlab.service;

import java.sql.SQLException;
import java.util.List;

import com.techlab.model.Department;
import com.techlab.repository.DepartmentsRepository;

public class DepartmentsService {

	private DepartmentsRepository departmentsRepository;
	
	public DepartmentsService(DepartmentsRepository departmentsRepository) {
		this.departmentsRepository=departmentsRepository;
	}
	
	public List<Department> getDepartments() throws SQLException {
		return departmentsRepository.getDepartments();
	}
	
	public void addDepartments(Department department) throws SQLException {
		boolean addDepartment = departmentsRepository.addDepartment(department);
	}
	
	public Department getDepartmentById(int id) throws SQLException {
		return departmentsRepository.getDapartmentById(id);
	}
}
