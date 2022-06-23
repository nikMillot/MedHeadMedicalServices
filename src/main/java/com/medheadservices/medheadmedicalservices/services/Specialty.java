package com.medheadservices.medheadmedicalservices.services;

import javax.persistence.*;

// Specialty = user
@Entity
@Table(name = "specialties")
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "spec_ID")
    private Integer specID;

    @Column(nullable = false, name = "spec_Name")
    private String specName;

    @Column(nullable = false, unique = true, length = 40, name = "spec_Email")
    private String specEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecID() {
        return specID;
    }

    public void setSpecID(Integer specID) {
        this.specID = specID;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getSpecEmail() {
        return specEmail;
    }

    public void setSpecEmail(String specEmail) {
        this.specEmail = specEmail;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", specID=" + specID +
                ", specName='" + specName + '\'' +
                ", specEmail='" + specEmail + '\'' +
                '}';
    }
}
