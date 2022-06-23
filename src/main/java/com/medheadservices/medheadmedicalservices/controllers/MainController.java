package com.medheadservices.medheadmedicalservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // servicesPage = showHomePage
    @GetMapping("")
    public String servicesPage(){
        System.out.println("main controller refreshed");
        return "index";
    }
}
