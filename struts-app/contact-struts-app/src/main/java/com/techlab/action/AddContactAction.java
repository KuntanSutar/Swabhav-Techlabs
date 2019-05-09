package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class AddContactAction extends ActionSupport {

	private Contact contact = new Contact();
	private String name = new String();
	private String email = new String();

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
		return SUCCESS;
	}

	public String executeDo() {

		System.out.println("add executeDo called");
		System.out.println(contact.getName() + "..." + contact.getEmail());
		ContactService service = new ContactService();
		service.add(contact);
		return SUCCESS;
	}

	public void validate() {
		System.out.println(
				"In validate " + name.hashCode() + " " + name.length() + " " + email.hashCode() + " " + email.length());
		System.out.println("validate called");
		if (name==null) {
			addFieldError("contact.name", "name is required");
		}
		if (email==null) {
			addFieldError("contact.email", "email is required");
		}
	}
}
