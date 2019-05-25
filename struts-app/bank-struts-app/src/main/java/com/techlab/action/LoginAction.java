package com.techlab.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Login;
import com.techlab.repository.AccountsRepository;

public class LoginAction extends ActionSupport {

	private Login login = new Login();
	private static boolean firstTime;

	static {
		firstTime = true;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String execute() throws Exception {
		System.out.println("login execute called");
		System.out.println();
		return SUCCESS;
	}

	public String executeDo() throws SQLException, ClassNotFoundException {

		System.out.println("login executeDo called");
		System.out.println(login.getUsername() + "..." + login.getPassword());
		System.out.println();
		AccountsRepository repository = AccountsRepository.getInstance();
		if(login.getUsername().equals(login.getPassword())) {
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("accountList", repository.getAccountList());
			firstTime = true;
			return SUCCESS;
		} else {
			return LOGIN;
		}
	}
	
	public void validate() {
		System.out.println("validating " + login.getUsername() + " "+login.getPassword());
		if (firstTime == false) {
			System.out.println("validate called");
			if (login.getUsername() == null) {
				if (("").equals(login.getUsername())) {
					addFieldError("login.username", "Username is required");
				}
			}
			if (login.getPassword() == null) {
				if (("").equals(login.getPassword())) {
					addFieldError("login.password", "Password is required");
				}
			}
		}
		firstTime = false;
	}
	
}
