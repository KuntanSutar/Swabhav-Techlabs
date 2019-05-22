package com.techlab.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class AddContactAction extends ActionSupport {

	private Contact contact = new Contact();
	private static boolean firstTime;
	private int totalContacts;
	
	static {
		firstTime = true;
	}
	
	public int getTotalContacts() {
		return totalContacts;
	}

	public void setTotalContacts(int totalContacts) {
		this.totalContacts = totalContacts;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String execute() throws Exception {
		// student.setName("Kuntan Sutar");
		// student.setEmail("sutarkuntan@gmail.com");
		System.out.println("add execute called");
		System.out.println();
		return SUCCESS;
	}

	public String executeDo() {

		System.out.println("add executeDo called");
		System.out.println(contact.getName() + "..." + contact.getEmail());
		ContactService service = ContactService.getInstance();
		service.add(contact);
		System.out.println();
		List<Contact> contactList=service.getContactList();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("contactList", contactList);
		totalContacts=contactList.size();
		firstTime = true;
		return SUCCESS;
	}

	public void validate() {
		System.out.println("add validating " + contact.getName() + " " + contact.getEmail());
		if (firstTime == false) {
			System.out.println("add validate called");
			if (("").equals(contact.getName())) {
				addFieldError("contact.name", "Name is required");
			}
			if (("").equals(contact.getEmail())) {
				addFieldError("contact.email", "Email is required");
			}
		}
		firstTime = false;
	}
}
