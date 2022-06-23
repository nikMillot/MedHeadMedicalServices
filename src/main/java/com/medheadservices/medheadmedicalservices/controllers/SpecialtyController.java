package com.medheadservices.medheadmedicalservices.controllers;


import com.medheadservices.medheadmedicalservices.services.Specialty;
import com.medheadservices.medheadmedicalservices.services.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SpecialtyController {
    @Autowired private SpecialtyService service;

    @GetMapping("/specialties-ui")
    public String showSpecialtyListUI(Model model){
        List<Specialty> listSpecialties = service.listAll();
        model.addAttribute("listSpecialties", listSpecialties);


        return "specialties-ui";
    }
}
