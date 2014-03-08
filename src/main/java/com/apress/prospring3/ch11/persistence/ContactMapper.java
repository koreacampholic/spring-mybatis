package com.apress.prospring3.ch11.persistence;

import java.util.List;

import com.apress.prospring3.ch11.domain.Contact;

public interface ContactMapper {
	public List<Contact> findAll();
}