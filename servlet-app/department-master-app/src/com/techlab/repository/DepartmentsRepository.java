package com.techlab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Department;

public class DepartmentsRepository {

	private static List<Department> departmentList;
	private static Connection connection;
	
	public DepartmentsRepository() throws SQLException, ClassNotFoundException {
		departmentList = new ArrayList<Department>();
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","root");
	}
	
	public boolean add(Department department) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("insert into dept values(?,?,?)");
		preparedStatement.setInt(1, department.getNumber());
		preparedStatement.setString(2, department.getName());
		preparedStatement.setString(3, department.getLocation());
		return preparedStatement.execute();
	}
	
	public boolean update(Department department) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("update dept set dname=?, loc=? where deptno=?");
		preparedStatement.setString(1, department.getName());
		preparedStatement.setString(2, department.getLocation());
		preparedStatement.setInt(3, department.getNumber());
		return preparedStatement.execute();
	}
	
	public boolean delete(Department department) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("delete from dept where deptno=?");
		preparedStatement.setInt(1, department.getNumber());
		return preparedStatement.execute();
	}
	
	public static List<Department> getDepartments() throws SQLException {
		
		if(departmentList.size()==0) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from dept");
			while(resultSet.next()) {
				int deptNo = Integer.parseInt(resultSet.getString("DEPTNO"));
				String deptName = resultSet.getString("DNAME");
				String location = resultSet.getString("LOC");
				Department department = new Department(deptNo, deptName, location);
				departmentList.add(department);
			}
			return departmentList;
		} else {
			return departmentList;
		}
	}

	public Department getDepartmentByNumber(int deptNo) throws SQLException {
		Department tempDepartment = null;
		for(Department department:getDepartments()) {
			if(department.getNumber()==deptNo) {
				tempDepartment=department;
			} 
		}
		return tempDepartment;
	}
	
}
