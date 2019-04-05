package com.swabhav.techlabs.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestFilter {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter DEPTNO : ");
		String searchDeptNo = scanner.nextLine();
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav","root","root");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from dept where DEPTNO=?");
		preparedStatement.setString(1, searchDeptNo);
		ResultSet resultSet1 = preparedStatement.executeQuery();
		System.out.println("DEPTNO\tDNAME\t\tLOC");
		while(resultSet1.next()) {
			int deptNo = resultSet1.getInt("DEPTNO");
			String deptName = resultSet1.getString("DNAME");
			String location = resultSet1.getString("LOC");
			System.out.println(deptNo+"\t"+deptName+"\t"+location);
		}
		
		resultSet1.close();
		preparedStatement.close();
		connection.close();
	}

}
