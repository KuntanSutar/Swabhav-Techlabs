package com.techlab.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class ContactsAction extends ActionSupport {

	private ContactService service = ContactService.getInstance();
	private List<Contact> contactList;
	private int totalContacts;

	@Override
	public String execute() throws Exception {
		System.out.println("Display Action");
		contactList = service.getContactList();
		totalContacts=contactList.size();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("contactList", contactList);
		return SUCCESS;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	public int getTotalContacts() {
		return totalContacts;
	}

	public void setTotalContacts(int totalContacts) {
		this.totalContacts = totalContacts;
	}
	
}
