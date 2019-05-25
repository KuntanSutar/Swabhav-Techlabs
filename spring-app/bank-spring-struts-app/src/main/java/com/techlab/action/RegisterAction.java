package com.techlab.action;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Account;
import com.techlab.repository.AccountRepository;
import com.techlab.service.AccountService;

public class RegisterAction extends ActionSupport {

	private Account account = new Account();
	@Autowired
	private AccountService service;
	private static boolean firstTime;
	private int totalAccounts;
	
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
		service.register(account);
		System.out.println();
		List<Account> accountList = service.getAccountList();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("accountList", accountList);
		totalAccounts=accountList.size();
		firstTime = true;
		return SUCCESS;
	}
	
	public void validate() {
		System.out.println("validating " + account.getName() + " " + account.getBalance() + " "+account.getPassword());
		if (firstTime == false) {
			System.out.println("validate called");
			if (("").equals(account.getName()) | account.getName()==null) {
				addFieldError("account.name", "Name is required");
			}
			if (account.getBalance()==0) {
				addFieldError("account.balance", "Balance is required");
			}
			if (("").equals(account.getPassword()) | account.getPassword()==null) {
				addFieldError("account.password", "Password is required");
			}	
		}
		firstTime = false;
	}
}
