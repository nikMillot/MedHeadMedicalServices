package com.medheadservices.medheadmedicalservices.controllers;


import com.medheadservices.medheadmedicalservices.services.Hospital;
import com.medheadservices.medheadmedicalservices.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HospitalController {
    @Autowired private HospitalService service;

    @GetMapping("/hospitals-ui")
    public String showHospitalListUI(Model model){
        List<Hospital> listHospitals = service.listAll();
        model.addAttribute("listHospitals", listHospitals);

        return "hospitals-ui";
    }
}
