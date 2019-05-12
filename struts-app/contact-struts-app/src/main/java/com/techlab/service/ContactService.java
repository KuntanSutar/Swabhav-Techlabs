package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import com.techlab.business.Contact;

public class ContactService {

	private static List<Contact> contactList = new ArrayList<Contact>();
	private static ContactService service;
	
	static {
		service=null;
	}
	
	private ContactService() {
//		Contact contact1 = new Contact("ABC", "abc@gmail.com");
//		Contact contact2 = new Contact("XYZ", "xyz@gmail.com");
//		contactList.add(contact1);
//		contactList.add(contact2);
	}
	
	public static ContactService getInstance() {
		if(service==null) {
			service = new ContactService();
		}
		return service;
	}
	
	public void add(Contact contact) {
		if(contact.getName()!=null && !contact.getName().equals("") && contact.getEmail()!=null && !contact.getEmail().equals("")) {
			contactList.add(contact);
			System.out.println("contact added");
		}
	}

	public void edit(Contact contact) {
		Contact cntct = getByName(contact.getName());
		System.out.println("editing "+contact.getName()+" "+contact.getEmail());
		if(contact.getEmail()!=null) {
			cntct.setEmail(contact.getEmail());
		}
	}
	
	public void delete(String name) {
		Contact cntct = getByName(name);
		System.out.println("in delete "+cntct.getName()+" "+cntct.getEmail());
		contactList.remove(cntct);
	}
	
	public static Contact getByName(String name) {
//		System.out.println(contactList);
		System.out.println(name);
		Contact contact = null;
		for(Contact cntct:contactList) {
			if(name.equals(cntct.getName())) {
				contact=cntct;
			}
		}
		return contact;
	}
	
	public List<Contact> getContactList() {
		return contactList;
	}
	
}
