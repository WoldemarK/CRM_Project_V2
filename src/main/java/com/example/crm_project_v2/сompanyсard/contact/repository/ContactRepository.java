package com.example.crm_project_v2.сompanyсard.contact.repository;

import com.example.crm_project_v2.сompanyсard.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    void delete(Long id);

    List<Contact> findByName(String name);
}
