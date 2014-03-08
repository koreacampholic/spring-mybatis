package com.apress.prospring3.ch11.service.mybatis;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apress.prospring3.ch11.domain.Contact;
import com.apress.prospring3.ch11.persistence.ContactMapper;
import com.apress.prospring3.ch11.service.ContactService;

@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {
	private Log log = LogFactory.getLog(ContactServiceImpl.class);
	
	@Autowired
	private ContactMapper contactMapper;

	@Transactional(readOnly = true)
	public List<Contact> findAll() {
		List<Contact> contacts = contactMapper.findAll();
		return contacts;
	}
	// Other code omitted

	public List<Contact> findAllWithDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact save(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	public List<Contact> findByFirstNameAndLastName(String firstName,
			String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
}