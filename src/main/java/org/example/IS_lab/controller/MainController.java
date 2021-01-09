package org.example.IS_lab.controller;

import org.example.IS_lab.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("hospitals",hospitalService.findAll());
        return "main";
    }


}
