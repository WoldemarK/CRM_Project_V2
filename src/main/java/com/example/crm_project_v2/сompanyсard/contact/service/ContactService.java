package com.example.crm_project_v2.сompanyсard.contact.service;

import com.example.crm_project_v2.сompanyсard.contact.Contact;
import com.example.crm_project_v2.сompanyсard.contact.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository repository;

    public void save(Contact contact) {
        repository.save(contact);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    public Optional<Contact> findById(Long id) {
        return repository.findById(id);

    }

    public List<Contact> findByName(String name) {
        return repository.findByName(name);
    }

    public List<Contact> getAllContact() {
        return repository.findAll();
    }

}
