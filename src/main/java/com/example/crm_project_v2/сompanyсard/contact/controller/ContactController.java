package com.example.crm_project_v2.сompanyсard.contact.controller;

import com.example.crm_project_v2.сompanyсard.contact.Contact;
import com.example.crm_project_v2.сompanyсard.contact.service.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactController {

    public final ContactService service;

    @PostMapping
    public void save(@RequestBody Contact contact)  {
        this.service.save(contact);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Contact>> getAllCompany() {
        return ResponseEntity.ok(this.service.getAllContact());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

    @GetMapping("/getId/{id}")
    public ResponseEntity<Optional<Contact>> getId(@PathVariable Long id){
        return ResponseEntity.ok(this.service.findById(id));
    }
    @GetMapping("/getName")
    public ResponseEntity<List<Contact>> getName(@RequestParam String name) {
        return ResponseEntity.ok(this.service.findByName(name));
    }



}
