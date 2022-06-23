package com.medheadservices.medheadmedicalservices.services;

import javax.persistence.*;

@Entity
@Table(name = "hospitals")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "hosp_ID")
    private Integer hospID;

    @Column(nullable = false, name = "hosp_Name")
    private String hospName;

    @Column(nullable = false, unique = true, length = 40, name = "hosp_Email")
    private String hospEmail;

    @Column(nullable = false, name = "hosp_Lat")
    private Float hospLat;

    @Column(nullable = false, name = "hosp_Long")
    private Float hospLong;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHospID() {
        return hospID;
    }

    public void setHospID(Integer specID) {
        this.hospID = specID;
    }

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String specName) {
        this.hospName = specName;
    }

    public String getSpecEmail() {
        return hospEmail;
    }

    public void setSpecEmail(String specEmail) {
        this.hospEmail = specEmail;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", hospID=" + hospID +
                ", hospName='" + hospName + '\'' +
                ", hospEmail='" + hospEmail + '\'' +
                '}';
    }
}
