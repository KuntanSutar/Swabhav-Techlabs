package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class EditContactAction extends ActionSupport {

	private Contact contact = new Contact();
	private String name = new String();
	private String email = new String();
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
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
//		name=contact.getName();
//		email=contact.getEmail();
		return SUCCESS;
	}
	
	public String executeDo() {

		System.out.println("edit executeDo called");
		System.out.println("edit executeDo"+contact.getName() + "..." + contact.getEmail());
		ContactService service = new ContactService();
		service.edit(contact);
		return SUCCESS;
	}

}
