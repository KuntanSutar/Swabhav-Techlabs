package com.techlab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlab.business.*;

public class AccountsRepository {

	private static List<Account> accountList;
	private Connection connection;
	
	public AccountsRepository() throws SQLException, ClassNotFoundException {
		accountList = new ArrayList<Account>();
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","root");
	}
	
	public boolean addAccount(Account account) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("insert into account values(?,?,?)");
		preparedStatement.setString(1, account.getName());
		preparedStatement.setInt(2, account.getBalance());
		preparedStatement.setString(3, account.getPassword());
		return preparedStatement.execute();
	}
	
	public List<Account> getAccounts() throws SQLException {
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from account");
		while(resultSet.next()) {
			String username = resultSet.getString("username");
			int balance = resultSet.getInt("balance");
			String password = resultSet.getString("password");
			Account account = new Account(username, balance, password);
			accountList.add(account);
		}
		return accountList;
	}
}
