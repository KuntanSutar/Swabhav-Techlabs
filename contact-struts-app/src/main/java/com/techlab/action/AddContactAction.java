package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class AddContactAction extends ActionSupport {

	private Contact contact = new Contact();
	private String name = "dummy";
	private String email = "dummy";

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
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String execute() throws Exception {
//		contact.setName("Kuntan Sutar");
//		contact.setEmail("sutarkuntan@gmail.com");
		System.out.println("execute called");
		return SUCCESS;
	}

	public String executeDo() {
		System.out.println("executeDo called");
		System.out.println(contact.getName() + "..." + contact.getEmail());
		ContactService service = new ContactService();
		service.addContact(contact);
		return SUCCESS;
	}

	public void validate() {
		System.out.println("validate called");
		if (name == null || name.trim().equals("")) {
			addFieldError("name", "name is required");
		}
		if (email == null || email.trim().equals("")) {
			addFieldError("email", "email is required");
		}
	}
}
