package com.medheadservices.medheadmedicalservices.services;

import com.medheadservices.medheadmedicalservices.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyService {
    @Autowired private SpecialtyRepository repo;

    public List<Specialty> listAll(){
        return (List<Specialty>) repo.findAll();

    }
}
