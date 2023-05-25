package com.gestionAutoEcole.g04.controllers;

import com.gestionAutoEcole.g04.entities.Paiement;
import com.gestionAutoEcole.g04.services.PaiementService;
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
public class PaiementController {
    @Autowired
    PaiementService paiementService;


    @RequestMapping("/createPaiement")
    public String createPaiement(){
        return  "CreatePaiement";
    }



    @RequestMapping("/savePaiement")
    public String savePaiement(@Valid Paiement paiement , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreatePaiement";
        paiementService.savePaiement(paiement);
        return "CreatePaiement";
    }

    @RequestMapping("/paiementList")
    public String paiementList(ModelMap modelMap){
        List<Paiement> paiementController = paiementService.getAllPaiements();
        modelMap.addAttribute("paiementJsp",paiementController);
        return "PaiementList";
    }

    @RequestMapping("/deletePaiement")
    public String deletePaiement(@RequestParam("id") Long id, ModelMap modelMap){
        paiementService.deletePaiementById(id);
        List<Paiement> paiementController = paiementService.getAllPaiements();
        modelMap.addAttribute("paiementJsp",paiementController);
        return "PaiementList";
    }

    @RequestMapping("/showPaiement")
    public String showPaiement(@RequestParam("id") Long id, ModelMap modelMap){
        Paiement paiementController = paiementService.getPaiement(id);
        modelMap.addAttribute("paiementJsp", paiementController);
        return "EditPaiement";
    }

    @RequestMapping("/updatePaiement")
    public String updatePaiement(@ModelAttribute("paiement") Paiement paiement) {
        paiementService.savePaiement(paiement);
        return "CreatePaiement";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/paiementList";
    }
}
