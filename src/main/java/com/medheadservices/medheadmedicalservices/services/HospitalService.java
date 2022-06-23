package com.medheadservices.medheadmedicalservices.services;

import com.medheadservices.medheadmedicalservices.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    @Autowired private HospitalRepository repo;

    public List<Hospital> listAll(){
        return (List<Hospital>) repo.findAll();

    }
}
