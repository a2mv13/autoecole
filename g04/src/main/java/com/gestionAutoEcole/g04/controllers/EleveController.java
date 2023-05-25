package com.gestionAutoEcole.g04.controllers;

import com.gestionAutoEcole.g04.entities.Eleve;
import com.gestionAutoEcole.g04.services.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.Valid;

import java.util.List;

@Controller
public class EleveController {
    @Autowired
    EleveService eleveService;


    @RequestMapping("/createEleve")
    public String createEleve(){
        return  "CreateEleve";
    }



    @RequestMapping("/saveEleve")
    public String saveEleve(@Valid Eleve eleve , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateEleve";
        eleveService.saveEleve(eleve);
        return "CreateEleve";
    }

    @RequestMapping("/eleveList")
    public String eleveList(ModelMap modelMap){
        List<Eleve> eleveController = eleveService.getAllEleves();
        modelMap.addAttribute("eleveJsp",eleveController);
        return "EleveList";
    }

    @RequestMapping("/deleteEleve")
    public String deleteEleve(@RequestParam("id") Long id, ModelMap modelMap){
        eleveService.deleteEleveById(id);
        List<Eleve> eleveController = eleveService.getAllEleves();
        modelMap.addAttribute("eleveJsp",eleveController);
        return "EleveList";
    }

    @RequestMapping("/showEleve")
    public String showEleve(@RequestParam("id") Long id, ModelMap modelMap){
        Eleve eleveController = eleveService.getEleve(id);
        modelMap.addAttribute("eleveJsp", eleveController);
        return "EditCours";
    }

    @RequestMapping("/updateEleve")
    public String updateEleve(@ModelAttribute("eleve") Eleve eleve) {
        eleveService.saveEleve(eleve);
        return "CreateEleve";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/eleveList";
    }

}
