package com.medheadservices.medheadmedicalservices;

import com.medheadservices.medheadmedicalservices.repository.SpecialtyRepository;
import com.medheadservices.medheadmedicalservices.services.Specialty;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(true)
public class SpecialtyRepositoryTests {
    @Autowired private SpecialtyRepository repo;

    @Test
    public void testAddNew(){
        Specialty specialty = new Specialty();
        specialty.setSpecName("Specialty3");
        specialty.setSpecEmail("specialty3-hospital@hospital2.com");
        specialty.setSpecID(4);

        Specialty savedSpecialty = repo.save(specialty);

        Assertions.assertThat(savedSpecialty).isNotNull();
        Assertions.assertThat(savedSpecialty.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll(){
        Iterable<Specialty> specialties = repo.findAll();
        Assertions.assertThat(specialties).hasSizeGreaterThan(0);

        for (Specialty specialty: specialties) {
            System.out.println(specialty);
        }
    }

    @Test
    public void testUpdate(){
        Integer specialtyId = 1;
        Optional<Specialty> optionalSpecialty = repo.findById(specialtyId);
        Specialty specialty = optionalSpecialty.get();
        specialty.setSpecEmail("updatetest-specialty4-hospital@hospital.com");
        repo.save(specialty);

        Specialty updatedSpecialty = repo.findById(specialtyId).get();
        Assertions.assertThat(updatedSpecialty.getSpecEmail()).isEqualTo("updatetest-specialty4-hospital@hospital.com");
    }

    @Test
    public void TestGet(){
        Integer specialtyId = 1;
        Optional<Specialty> optionalSpecialty = repo.findById(specialtyId);
        Assertions.assertThat(optionalSpecialty).isPresent();
        System.out.println(optionalSpecialty.get());
    }

    @Test
    public void TestDelete(){
        Integer specialtyId = 1;
        repo.deleteById(specialtyId);

        Optional<Specialty> optionalSpecialty = repo.findById(specialtyId);
        Assertions.assertThat(optionalSpecialty).isNotPresent();
    }

}
