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
	
	public void add(Department department) throws SQLException {
		boolean addDepartmentResult = departmentsRepository.add(department);
	}
	
	public void update(Department department) throws SQLException {
		departmentsRepository.update(department);
	}

	public void delete(Department department) throws SQLException {
		departmentsRepository.delete(department);
	}
	
	public Department getDepartmentByNumber(int deptNo) throws SQLException {
		return departmentsRepository.getDepartmentByNumber(deptNo);
	}
	
}
