package com.medheadservices.medheadmedicalservices.services;

import javax.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "pat_ID")
    private Integer patID;

    @Column(nullable = false, name = "pat_Name")
    private String patName;

    @Column(nullable = false, name = "pat_Surname")
    private String patSurname;

    @Column(nullable = false, name = "pat_Pathology")
    private String patPathology;

    @Column(nullable = false, name = "pat_PhNumber")
    private Integer patPhNumber;

    @Column(nullable = false, unique = true, length = 40, name = "pat_Email")
    private String patEmail;

    @Column(nullable = false, name = "pat_emerg_contact_name")
    private String patEmergContactName;

    @Column(nullable = false, name = "pat_emerg_contact_surname")
    private String patEmergContactSurname;

    @Column(nullable = false, name = "pat_emerg_contact_PhNumber")
    private Integer patEmergContactPhNumber;



}
