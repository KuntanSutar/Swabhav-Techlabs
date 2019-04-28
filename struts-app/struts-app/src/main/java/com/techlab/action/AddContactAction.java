package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class AddContactAction extends ActionSupport implements Action {

	private Contact contact = new Contact();;
	private String post = "false";

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
		if(post.equals("true")) {
			
		}
		System.out.println("Execute called");
		return this.SUCCESS;
	}

	public String executeDo() {
		System.out.println(contact.getEmail() + "..." + contact.getName());
		ContactService service = new ContactService();
		service.addContact(contact);
		return this.INPUT;
	}

	public void validate() {
		System.out.println("validate method");
		if (contact.getName() == null) {
			addFieldError("contact.name", "Username is required");
		} 
		if (contact.getEmail() == null) {
			addFieldError("contact.email", "Email is required");
		}
	}
}
