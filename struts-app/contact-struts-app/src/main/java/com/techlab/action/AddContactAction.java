package com.techlab.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class AddContactAction extends ActionSupport {

	private Contact contact = new Contact();
	private String name;
	private String email;
	private static boolean firstTime;
	private int totalContacts;
	
	public int getTotalContacts() {
		return totalContacts;
	}

	public void setTotalContacts(int totalContacts) {
		this.totalContacts = totalContacts;
	}

	static {
		firstTime = true;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String execute() throws Exception {
		// contact.setName("Kuntan Sutar");
		// contact.setEmail("sutarkuntan@gmail.com");
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
		System.out.println("validating " + name + " " + email);
		System.out.println("validating " + contact.getName() + " " + contact.getEmail());
		if (firstTime == false) {
//			System.out.println(
//					"in validate " + name.hashCode() + " " + name.length() + " " + email.hashCode() + " " + email.length());
			System.out.println("validate called");
			if (name == null) {
				if (contact.getName().equals("")) {
					addFieldError("contact.name", "Name is required");
				}
			}
			if (email == null) {
				if (contact.getEmail().equals("")) {
					addFieldError("contact.email", "Email is required");
				}
			}
		}
		firstTime = false;
	}
}
