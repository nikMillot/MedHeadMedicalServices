package com.medheadservices.medheadmedicalservices;

import com.medheadservices.medheadmedicalservices.repository.HospitalRepository;
import com.medheadservices.medheadmedicalservices.services.Hospital;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class HospitalRepositoryTests {
    @Autowired private HospitalRepository repo;

    @Test
    public void testAddNew(){
        Hospital specialty = new Hospital();
        specialty.setHospName("Hospital2");
        specialty.setSpecEmail("hospital2@hospital2.com");
        specialty.setHospID(3);


        Hospital savedHospital = repo.save(specialty);

        Assertions.assertThat(savedHospital).isNotNull();
        Assertions.assertThat(savedHospital.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll(){
        Iterable<Hospital> hospitals = repo.findAll();
        Assertions.assertThat(hospitals).hasSizeGreaterThan(0);

        for (Hospital specialty: hospitals) {
            System.out.println(specialty);
        }
    }

    @Test
    public void testUpdate(){

    }

    @Test
    public void TestGet(){

    }

    @Test
    public void TestDelete(){

    }

}
