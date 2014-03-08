package com.apress.prospring3.ch11.domain;

import java.util.Date;

public class Contact {

	private Long id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	// Getter/setter methods omitted
	public String toString() {
	return "Contact - Id: " + id + ", First name: " + firstName
	+ ", Last name: " + lastName + ", Birthday: " + birthDate;
	}
}
