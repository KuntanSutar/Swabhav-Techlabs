package com.techlab.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Transaction;
import com.techlab.repository.AccountsRepository;

public class TransactionAction extends ActionSupport {

	private Transaction transaction = new Transaction();
	private String name;
	private int amount;
	private String type;
	private String date;
	private static boolean firstTime;

	static {
		firstTime = true;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("transaction execute called");
		System.out.println();
		return SUCCESS;
	}

	public String executeDo() throws SQLException, ClassNotFoundException {

		System.out.println("trasaction executeDo called");
		System.out.println(transaction.getName() + "..." + transaction.getAmount() + "..." + transaction.getType()
				+ "..." + transaction.getDate());
		AccountsRepository repository = AccountsRepository.getInstance();
		if(transaction.getType().equalsIgnoreCase("Deposite")) {
			repository.deposite(repository.getAccount(transaction.getName()), transaction.getAmount());
		} 
		if(transaction.getType().equalsIgnoreCase("Withdraw")) {
			repository.withdraw(repository.getAccount(transaction.getName()), transaction.getAmount());
		}
		System.out.println();
		firstTime = true;
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("transactionList", repository.getTransactions(transaction.getName()));
		return SUCCESS;
	}
	
	public void validate() {
		System.out.println("validating " + amount + " "+type);
		System.out.println("validating " + transaction.getAmount() + " " + transaction.getType());
		if (firstTime == false) {
			System.out.println("validate called");
			if (transaction.getAmount()==0) {
				addFieldError("transaction.amount", "Amount is required");
			}
			if (type==null) {
				addFieldError("transaction.type", "Type is required");
			}
		}
		firstTime = false;
	}
}
