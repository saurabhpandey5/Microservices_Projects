package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService{

	//fake list of contact
	List<Contact> list=List.of(
			new Contact(1L,"saruabh@gmail.com","saurabh",1311L),
			new Contact(2L,"sachin@gmail.com","sachin",1312L),
			new Contact(1l,"rohit@gmail.com","rohit",1313L));
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
