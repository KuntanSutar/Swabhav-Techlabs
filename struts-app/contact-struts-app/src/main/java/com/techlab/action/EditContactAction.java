package com.techlab.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class EditContactAction extends ActionSupport {

	private Contact contact = new Contact();
	private String name;
	private String email;
	private static boolean firstTime;
	private int totalContacts;
	
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String execute() throws Exception {
		// contact.setName("Kuntan Sutar");
		// contact.setEmail("sutarkuntan@gmail.com");
		System.out.println("edit execute called");
		System.out.println("edit execute "+name+" "+email);
		contact.setName(name);
		contact.setEmail(email);
		return SUCCESS;
	}
	
	public String executeDo() {

		System.out.println("edit executeDo called");
		System.out.println("edit executeDo "+contact.getName() + "..." + contact.getEmail());
		ContactService service = ContactService.getInstance();
		service.edit(contact);
		List<Contact> contactList=service.getContactList();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("contactList", contactList);
		totalContacts=contactList.size();
		return SUCCESS;
	}
	
	public void validate() {
		System.out.println("edit validating " + contact.getName() + " " + contact.getEmail());
		if (firstTime == false) {
			System.out.println("edit validate called");
			if (("").equals(contact.getEmail())) {
				addFieldError("contact.email", "Email is required");
			}
		}
		firstTime = false;
	}

}
