package com.techlab.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class DeleteContactAction extends ActionSupport {

	private Contact contact = new Contact();
	private String name = new String();
	private String email = new String();
	private int totalContacts;
	private static boolean firstTime;

	static {
		firstTime = true;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int getTotalContacts() {
		return totalContacts;
	}

	public void setTotalContacts(int totalContacts) {
		this.totalContacts = totalContacts;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String execute() throws Exception {
		if(firstTime=true) {
			System.out.println("delete execute called");
			System.out.println("delete execute " + name);
			ContactService service = ContactService.getInstance();
			List<Contact> contactList = service.getContactList();
			service.delete(name);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("contactList", contactList);
			totalContacts = contactList.size();
			firstTime=false;
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

}
