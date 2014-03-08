package com.apress.prospring3.ch11;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring3.ch11.domain.Contact;
import com.apress.prospring3.ch11.service.ContactService;

public class MyBatisSample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context.xml");
		ctx.refresh();
		ContactService contactService = ctx.getBean("contactService",
				ContactService.class);
		List<Contact> contacts;
		// Find all contacts
		contacts = contactService.findAll();
		listContacts(contacts);
	}

	private static void listContacts(List<Contact> contacts) {
		System.out.println("");
		System.out.println("Listing contacts without details:");
		for (Contact contact : contacts) {
			System.out.println(contact);
			System.out.println();
		}
	}
}
