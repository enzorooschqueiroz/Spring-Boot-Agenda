package com.agenda.contact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.contact.entities.Contact;
import com.agenda.contact.repositories.ContactRepository;

@Service
public class ContactService {
    
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> geContacts(){
        return contactRepository.findAll();
    }
    
    
}
