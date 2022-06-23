package com.medheadservices.medheadmedicalservices.repository;

import com.medheadservices.medheadmedicalservices.services.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientsRepository extends CrudRepository<Patient, Integer> {
}
