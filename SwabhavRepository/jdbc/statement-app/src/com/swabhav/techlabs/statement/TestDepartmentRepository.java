package com.swabhav.techlabs.statement;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.swabhav.techlab.repository.Department;
import com.swabhav.techlab.repository.DepartmentRepository;

public class TestDepartmentRepository {

	public static void main(String[] args) throws SQLException {

		//Department department1 = new Department(100, "Analyst", "Rabale");
		//Department department2 = new Department(120, "Quality", "Rabale");
		DepartmentRepository departmentRepository = new DepartmentRepository();
		//boolean firstInsert = departmentRepository.addDepartment(department1);
		//boolean secondInsert = departmentRepository.addDepartment(department2);
		List<Department> departmentList = departmentRepository.getDepartments();
		for(Department department:departmentList) {
			System.out.println(department.getDeptNo()+"\t"+department.getDeptName()+"\t"+department.getLocation());
		}
		System.out.println(departmentList.size());
	}

}
