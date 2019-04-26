package com.techlab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.techlab.business.*;

public class AccountsRepository {

	private static List<Account> accountList;
	private Connection connection;

	public AccountsRepository() throws SQLException, ClassNotFoundException {
		accountList = new ArrayList<Account>();
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
		connection.setAutoCommit(false);
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
		while (resultSet.next()) {
			String username = resultSet.getString("username");
			int balance = resultSet.getInt("balance");
			String password = resultSet.getString("password");
			Account account = new Account(username, balance, password);
			accountList.add(account);
		}
		return accountList;
	}

	/*
	 * public int getBalance() throws SQLException {
	 * 
	 * Statement statement = connection.createStatement(); ResultSet resultSet =
	 * statement.executeQuery("select balance from account where name='a';"); int
	 * balance = resultSet.getInt("balance"); return balance; }
	 */

	public void deposite(int amount) throws SQLException {

		/*PreparedStatement preparedStatement = connection
				.prepareStatement("update account set balance = balance + " + amount + "where name = 'a'");*/
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String stringDate = formatter.format(date);  
		PreparedStatement preparedStatement1 = connection
				.prepareStatement("update account set balance = balance + " + amount + " where name = = 'a'");
		PreparedStatement preparedStatement2 = connection
				.prepareStatement("insert into transaction values ('a',"+amount+",'deposite','"+stringDate+"')");
		System.out.println("insert into transaction values ('a',"+amount+",'deposite','"+stringDate+"'");
		try {
			preparedStatement1.execute();
			preparedStatement2.execute();
			connection.commit();
		} catch (Exception e) {
			connection.rollback();
			System.out.println("Transaction Reverted");
		}
	}

	public void withdraw(int amount) throws SQLException {

		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String stringDate = formatter.format(date);  
		PreparedStatement preparedStatement1 = connection
				.prepareStatement("update account set balance = balance - " + amount + " where name = 'a'");
		PreparedStatement preparedStatement2 = connection
				.prepareStatement("insert into transaction values ('a',"+amount+",'withdraw','"+stringDate+"')");
		System.out.println("insert into transaction values ('a',"+amount+",'withdraw','"+stringDate+"')");
		
		try {
			preparedStatement1.execute();
			preparedStatement2.execute();
			connection.commit();
		} catch (Exception e) {
			connection.rollback();
			System.out.println("Transaction Reverted");
		}
	}
}
