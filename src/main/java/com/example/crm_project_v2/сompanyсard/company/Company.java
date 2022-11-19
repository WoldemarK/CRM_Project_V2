package com.example.crm_project_v2.сompanyсard.company;


import com.example.crm_project_v2.сompanyсard.contact.Contact;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String phoneNumber;
    private String city;
    private String country;
    private String address;
    private String email;
    private String website;

    private String comment;
    private LocalDateTime creation;
    private LocalDateTime update;

    private String typeCompany;
    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contactId;


    public Company() {
        LocalDateTime date = LocalDateTime.now();
        this.creation = date;
        this.update = date;
        this.country = "Россия";
    }
}

