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

import org.springframework.stereotype.Repository;

import com.techlab.business.*;

@Repository("repository")
public class AccountRepository {

	private static List<Account> accountList;
	private Connection connection;

	private AccountRepository() throws SQLException, ClassNotFoundException {
		accountList = new ArrayList<Account>();
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
	}

	public static AccountRepository getInstance() throws ClassNotFoundException, SQLException {
		AccountRepository repository=null;
		if(repository==null) {
			repository = new AccountRepository();
		}
		return repository;
	}
	
//	public boolean addAccount(Account account) throws SQLException {
//		if(account!=null) {
//			PreparedStatement statement1 = connection.prepareStatement("insert into account values(?,?,?)");
//			statement1.setString(1, account.getName());
//			statement1.setInt(2, account.getBalance());
//			statement1.setString(3, account.getPassword());
//			return statement1.execute();
//		} else {
//			return false;
//		}
//	}

	public boolean register(Account account) throws SQLException {
		if(account!=null) {
			connection.setAutoCommit(false);
			PreparedStatement statement1 = connection.prepareStatement("insert into account values(?,?,?)");
			statement1.setString(1, account.getName());
			statement1.setInt(2, account.getBalance());
			statement1.setString(3, account.getPassword());
			
			Date date = new Date();  
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");  
		    String stringDate = formatter.format(date); 
		    
		    PreparedStatement statement2 = connection.prepareStatement("insert into transaction values(?,?,?,?)");
		    statement2.setString(1, account.getName());
		    statement2.setInt(2, account.getBalance());
		    statement2.setString(3, "Deposit");
		    statement2.setString(4, stringDate);
		    try {
		    	statement1.execute();
			    statement2.execute();
			    connection.commit();
		    } catch (Exception e) {
		    	connection.rollback();
		    	System.out.println("Transaction Rollback");
		    }
			return true;
		} else {
			return false;
		}
	}
	
	public List<Account> getAccountList() throws SQLException {

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from account");
		accountList.clear();
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			int balance = resultSet.getInt("balance");
			String password = resultSet.getString("password");
			Account account = new Account(name, balance, password);
			accountList.add(account);
		}
		return accountList;
	}

	public void deposite(Account account,int amount) throws SQLException {

		if(account!=null) {
			connection.setAutoCommit(false);
			PreparedStatement statement1 = connection.prepareStatement("update account set balance=? where name=?");
			statement1.setInt(1, account.getBalance()+amount);
			statement1.setString(2, account.getName());
			Date date = new Date();  
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");  
		    String stringDate = formatter.format(date);  
		    PreparedStatement statement2 = connection.prepareStatement("insert into transaction values(?,?,?,?)");
			statement2.setString(1, account.getName());
			statement2.setInt(2, account.getBalance()+amount);
			statement2.setString(3, "Deposite");
			statement2.setString(4, stringDate);
			try {
				statement1.execute();
				statement2.execute();
				connection.commit();
			} catch (Exception e) {
				connection.rollback();
				System.out.println("Transaction Rollback");
			}
		}
	}

	public void withdraw(Account account, int amount) throws SQLException {

		if(account!=null) {
			connection.setAutoCommit(false);
			PreparedStatement statement1 = connection.prepareStatement("update account set balance=? where name=?");
			statement1.setInt(1, account.getBalance()-amount);
			statement1.setString(2, account.getName());
			Date date = new Date();  
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");  
		    String stringDate = formatter.format(date);  
		    PreparedStatement statement2 = connection.prepareStatement("insert into transaction values(?,?,?,?)");
			statement2.setString(1, account.getName());
			statement2.setInt(2, account.getBalance()-amount);
			statement2.setString(3, "Withdraw");
			statement2.setString(4, stringDate);
			try {
				statement1.executeUpdate();
				statement2.execute();
				connection.commit();
			} catch (Exception e) {
				connection.rollback();
				System.out.println("Transaction Rollback");
			}
		}
	}
	
	public Account getAccount(String name) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("select * from account where name=?");
		statement.setString(1, name);
		ResultSet resultSet = statement.executeQuery();
		System.out.println(resultSet);
		Account account=null;
		while(resultSet.next()) {
			account = new Account(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3));
		}
		return account;
	}
	
	public List<Transaction> getTransactions(String name) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("select * from transaction where name=?");
		statement.setString(1, name);
		ResultSet resultSet = statement.executeQuery();
		Transaction transaction = null;
		List<Transaction> transactionList = new ArrayList<Transaction>();
		while(resultSet.next()) {
			transaction = new Transaction(resultSet.getString(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getString(4));
			transactionList.add(transaction);
		}
		return transactionList;
	}
	
	
}
