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
	private Connection connection;
	private static DepartmentsRepository departmentsRepository = null;

	public DepartmentsRepository() throws SQLException, ClassNotFoundException {
		departmentList = new ArrayList<Department>();
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
	}

	// public static DepartmentsRepository getInstance() throws
	// ClassNotFoundException, SQLException {
	// if(departmentsRepository==null) {
	// departmentsRepository = new DepartmentsRepository();
	// }
	// return departmentsRepository;
	// }

	public boolean addDepartment(Department department) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("insert into dept values(?,?,?)");
		preparedStatement.setInt(1, department.getDeptNo());
		preparedStatement.setString(2, department.getDeptName());
		preparedStatement.setString(3, department.getLocation());
		return preparedStatement.execute();
	}

	public List<Department> getDepartments() throws SQLException {

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from dept");
		while (resultSet.next()) {
			int deptNo = resultSet.getInt("DEPTNO");
			String deptName = resultSet.getString("DNAME");
			String location = resultSet.getString("LOC");
			Department department = new Department(deptNo, deptName, location);
			departmentList.add(department);
		}
		return departmentList;
	}

	public Department getDapartmentById(int id) throws SQLException {

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from dept where DEPTNO =" + id);
		Department department = new Department(resultSet.getInt("DEPTNO"), resultSet.getString("DNAME"),
				resultSet.getString("LOC"));
		System.out.println(resultSet);
		return department;
	}
}
