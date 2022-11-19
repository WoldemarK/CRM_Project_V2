package com.example.crm_project_v2.сompanyсard.company.repository;

import com.example.crm_project_v2.сompanyсard.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findByName(String name);
}
