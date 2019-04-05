package com.swabhav.techlab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {

	private static List<Department> departmentList;
	private Connection connection;
	
	public DepartmentRepository() throws SQLException {
		departmentList = new ArrayList<Department>();
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","root");
	}
	
	public boolean addDepartment(Department newDepartment) throws SQLException {
		//departmentList.add(newDepartment);
		PreparedStatement preparedStatement = connection.prepareStatement("insert into dept values(?,?,?)");
		preparedStatement.setInt(1, newDepartment.getDeptNo());
		preparedStatement.setString(2, newDepartment.getDeptName());
		preparedStatement.setString(3, newDepartment.getLocation());
		return preparedStatement.execute();
	}
	
	public List<Department> getDepartments() throws SQLException {
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from dept");
		while(resultSet.next()) {
			int deptNo = resultSet.getInt("DEPTNO");
			String deptName = resultSet.getString("DNAME");
			String location = resultSet.getString("LOC");
			Department department = new Department(deptNo, deptName, location);
			departmentList.add(department);
		}
		return departmentList;
	}
}
