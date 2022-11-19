package com.example.crm_project_v2.сompanyсard.contact;


import com.example.crm_project_v2.сompanyсard.company.Company;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String post;
    private String comment;
    private LocalDateTime creation;
    private LocalDateTime update;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company companyId;

    public Contact() {
        LocalDateTime date = LocalDateTime.now();
        this.creation = date;
        this.update = date;
    }
}
