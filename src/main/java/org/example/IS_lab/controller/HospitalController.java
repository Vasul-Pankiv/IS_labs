package org.example.IS_lab.controller;

import org.example.IS_lab.domains.Hospital;
import org.example.IS_lab.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @GetMapping
    public String getHospital(@RequestParam(name = "id") Hospital hospital, Model model){
        model.addAttribute("id",hospital);
        return "hospital";
    }
    @GetMapping("/delete")
    public String deleteHospital(
            @RequestParam("id") Hospital hospital
    ) {
        hospitalService.delete(hospital);

        return "redirect:/";
    }
    @GetMapping("/add")
    public String addHospitalForm(){
        return "hospitalForm";
    }
    @PostMapping("/add")
    public String addHospital(@Valid Hospital hospital){
        hospitalService.addHospital(hospital);
        return "redirect:/hospital";
    }
}
