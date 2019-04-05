package com.techlab.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" +
                "user=root&password=root");
		System.out.println("Database Product Name : "+connection.getMetaData().getDatabaseProductName());
		System.out.println("Database Product Version : "+connection.getMetaData().getDatabaseProductVersion());
		System.out.println("Connection Implementation Class : "+connection.getClass().getName());
		System.out.println("Driver Name : "+connection.getMetaData().getDriverName());
		System.out.println("Driver Version : "+connection.getMetaData().getDriverVersion());
		Statement statement = connection.createStatement();
		System.out.println("Statement Implementation Class : "+statement.getClass());
	}

}
