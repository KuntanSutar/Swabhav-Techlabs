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
	
	public void addContact(Contact contact) {
		contactList.add(contact);
		System.out.println("Contact added");
	}

	public List<Contact> getContactList() {
//		System.out.println("Got contact list");
		return contactList;
	}
	
}
