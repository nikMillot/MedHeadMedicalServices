package com.medheadservices.medheadmedicalservices.repository;

import com.medheadservices.medheadmedicalservices.services.Hospital;
import org.springframework.data.repository.CrudRepository;


public interface HospitalRepository extends CrudRepository<Hospital, Integer> {
}
