package com.techlab.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class DisplayContactAction implements Action {

	private ContactService service = new ContactService();
	private List<Contact> contactList;
	private int totalContacts;

	@Override
	public String execute() throws Exception {
		contactList = service.getContactList();
		System.out.println("Display Action");
		totalContacts=contactList.size();
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
