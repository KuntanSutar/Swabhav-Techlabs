package com.techlab.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Account;
import com.techlab.repository.AccountsRepository;

public class RegisterAction extends ActionSupport {

	private Account account = new Account();
	private static boolean firstTime;
	
	static {
		firstTime = true;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public String execute() throws Exception {
		System.out.println("register execute called");
		System.out.println();
		return SUCCESS;
	}
	
	public String executeDo() throws SQLException, ClassNotFoundException {

		System.out.println("register executeDo called");
		System.out.println(account.getName() + "..." + account.getBalance()+"..."+account.getPassword());
		AccountsRepository repository = AccountsRepository.getInstance();
		repository.register(account);
		System.out.println();
		firstTime = true;
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("accountList", repository.getAccountList());
		return SUCCESS;
	}
	
	public void validate() {
		System.out.println("register validating " + account.getName() + " " + account.getBalance() + " "+account.getPassword());
		if (firstTime == false) {
			System.out.println("register validate called");
			if (("").equals(account.getName())) {
				System.out.println("In validate "+account.getName());
				addFieldError("account.name", "Name is required");
			}
			System.out.println("He bagh balance "+account.getBalance());
			if (account.getBalance()==0) {
				addFieldError("account.balance", "Balance is required");
				System.out.println("In validate balance bagh "+account.getBalance());
			}
			if (("").equals(account.getPassword())) {
				addFieldError("account.password", "Password is required");
				System.out.println("In validate "+account.getPassword());
			}	
		}
		firstTime = false;
	}
}
