package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import com.techlab.business.Contact;

public class ContactService {

	private static List<Contact> contactList = new ArrayList<Contact>();
	
	public ContactService() {
//		Contact contact1 = new Contact("ABC", "abc@gmail.com");
//		Contact contact2 = new Contact("XYZ", "xyz@gmail.com");
//		contactList.add(contact1);
//		contactList.add(contact2);
	}
	
	public void add(Contact contact) {
		contactList.add(contact);
		System.out.println("contact added");
	}

	public void edit(Contact contact) {
		Contact cntct = getByName(contact.getName());
		cntct.setEmail(contact.getEmail());
	}
	
	public void delete(String name) {
		Contact cntct = getByName(name);
		contactList.remove(cntct);
	}
	
	public static Contact getByName(String name) {
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
