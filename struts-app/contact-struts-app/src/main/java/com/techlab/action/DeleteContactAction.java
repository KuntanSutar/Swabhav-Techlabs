package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.business.Contact;
import com.techlab.service.ContactService;

public class DeleteContactAction extends ActionSupport {

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
		System.out.println("delete execute called");
		System.out.println("delete execute "+name+" "+email);
		ContactService service = new ContactService();
		service.delete(name);
//		name=contact.getName();
//		email=contact.getEmail();
		return SUCCESS;
	}
	
}
