package com.medheadservices.medheadmedicalservices.services;

import com.medheadservices.medheadmedicalservices.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired private PatientsRepository repo;

    public List<Patient> listAll(){
        return (List<Patient>) repo.findAll();

    }
}
