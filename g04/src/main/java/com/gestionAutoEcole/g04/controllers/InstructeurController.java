package com.gestionAutoEcole.g04.controllers;

import com.gestionAutoEcole.g04.entities.Instructeur;
import com.gestionAutoEcole.g04.services.InstructeurService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class InstructeurController {
    @Autowired
    InstructeurService instructeurService;


    @RequestMapping("/createInstructeur")
    public String createInstructeur(){
        return  "CreateInstructeur";
    }



    @RequestMapping("/saveInstructeur")
    public String saveInstructeur(@Valid Instructeur instructeur , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateInstructeur";
        instructeurService.saveInstructeur(instructeur);
        return "CreateInstructeur";
    }

    @RequestMapping("/instructeurList")
    public String instructeurList(ModelMap modelMap){
        List<Instructeur> instructeurController = instructeurService.getAllInstructeurs();
        modelMap.addAttribute("instructeurJsp",instructeurController);
        return "InstructeurList";
    }

    @RequestMapping("/deleteInstructeur")
    public String deleteInstructeur(@RequestParam("id") Long id, ModelMap modelMap){
        instructeurService.deleteInstructeurById(id);
        List<Instructeur> instructeurController = instructeurService.getAllInstructeurs();
        modelMap.addAttribute("instructeurJsp",instructeurController);
        return "InstructeurList";
    }

    @RequestMapping("/showInstructeur")
    public String showInstructeur(@RequestParam("id") Long id, ModelMap modelMap){
        Instructeur instructeurController = instructeurService.getInstructeur(id);
        modelMap.addAttribute("instructeurJsp", instructeurController);
        return "EditInstructeur";
    }

    @RequestMapping("/updateInstructeur")
    public String updateInstructeur(@ModelAttribute("instructeur") Instructeur instructeur) {
        instructeurService.saveInstructeur(instructeur);
        return "CreateInstructeur";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/instructeurList";
    }
}
