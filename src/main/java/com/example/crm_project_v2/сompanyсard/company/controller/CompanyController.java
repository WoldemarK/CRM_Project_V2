package com.example.crm_project_v2.сompanyсard.company.controller;
import com.example.crm_project_v2.сompanyсard.company.Company;
import com.example.crm_project_v2.сompanyсard.company.service.CompanyService;
import com.example.crm_project_v2.сompanyсard.contact.Contact;
import com.example.crm_project_v2.сompanyсard.contact.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/com")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService service;

    @PostMapping
    public void save(@RequestBody Company company) {
        service.save(company);
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompany(){
        return ResponseEntity.ok(this.service.getAll());
    }

    @GetMapping("/getId/{id}")
    private ResponseEntity<Optional<Company>> finById(@PathVariable Long id)  {
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)  {
        this.service.delete(id);
    }

    @GetMapping("/getName")
    private ResponseEntity<Optional<Company>> finByName(@RequestParam String name) {
        return ResponseEntity.ok(service.findByName(name));
    }
}
