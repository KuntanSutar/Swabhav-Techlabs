package com.swabhav.techlabs.statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","root");
		Statement statement = connection.createStatement();
		ResultSet resultSet1 = statement.executeQuery("select * from dept");
		System.out.println("DEPTNO\tDNAME\t\tLOC");
		while(resultSet1.next()) {
			int deptNo = resultSet1.getInt("DEPTNO");
			String deptName = resultSet1.getString("DNAME");
			String location = resultSet1.getString("LOC");
			System.out.println(deptNo+"\t"+deptName+"\t"+location);
		}
		System.out.println();
		//Can not issue data manipulation statements with executeQuery().
		//ResultSet resultSet2 = statement.executeQuery("insert into dept values(50, 'R&D', 'MUMBAI')");
		ResultSet resultSet3 = statement.executeQuery("select * from dept where DEPTNO=123 or 1=1");
		while(resultSet3.next()) {
			int deptNo = resultSet3.getInt("DEPTNO");
			String deptName = resultSet3.getString("DNAME");
			String location = resultSet3.getString("LOC");
			System.out.println(deptNo+"\t"+deptName+"\t"+location);
		}
		resultSet1.close();
		statement.close();
		connection.close();
	}

}
