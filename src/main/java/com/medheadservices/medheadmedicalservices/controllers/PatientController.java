package com.medheadservices.medheadmedicalservices.controllers;

import com.medheadservices.medheadmedicalservices.services.Patient;
import com.medheadservices.medheadmedicalservices.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientController {
    @Autowired private PatientService service;

    @GetMapping("/patients-ui")
    public String showPatientListUI(Model model){
        List<Patient> listPatients = service.listAll();
        model.addAttribute("listPatients", listPatients);

        return "patients-ui";
    }
}
