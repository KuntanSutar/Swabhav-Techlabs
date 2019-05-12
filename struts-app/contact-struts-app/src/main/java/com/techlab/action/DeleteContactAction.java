package com.techlab.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

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
		System.out.println("delete execute "+name);
		ContactService service = ContactService.getInstance();
		service.delete(name);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("contactList", service.getContactList());
		return SUCCESS;
	}
	
}
