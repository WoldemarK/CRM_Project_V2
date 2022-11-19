package com.example.crm_project_v2.сompanyсard.company.service;

import com.example.crm_project_v2.сompanyсard.company.Company;
import com.example.crm_project_v2.сompanyсard.company.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository repository;

    public void save(Company company) {
        repository.save(company);
    }


    public Optional<Company> findById(Long id) {
        return repository.findById(id);
    }

    public Optional<Company> findByName(String name) {
        return repository.findByName(name);
    }


    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Company> getAll() {
        return repository.findAll();
    }
}
