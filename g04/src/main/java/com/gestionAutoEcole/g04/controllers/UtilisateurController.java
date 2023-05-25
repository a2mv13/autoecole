package com.gestionAutoEcole.g04.controllers;

import com.gestionAutoEcole.g04.entities.Utilisateur;
import com.gestionAutoEcole.g04.services.UtilisateurService;
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
public class UtilisateurController {
    @Autowired
    UtilisateurService utilService;


    @RequestMapping("/createUtil")
    public String createUtil(){
        return  "CreateUtil";
    }



    @RequestMapping("/saveUtil")
    public String saveUtil(@Valid Utilisateur util , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateUtil";
        utilService.saveUtil(util);
        return "CreateUtil";
    }

    @RequestMapping("/utilList")
    public String utilList(ModelMap modelMap){
        List<Utilisateur> utilController = utilService.getAllUtils();
        modelMap.addAttribute("utilJsp",utilController);
        return "UtilList";
    }

    @RequestMapping("/deleteUtil")
    public String deleteUtil(@RequestParam("id") Long id, ModelMap modelMap){
        utilService.deleteUtilById(id);
        List<Utilisateur> utilController = utilService.getAllUtils();
        modelMap.addAttribute("utilJsp",utilController);
        return "UtilList";
    }

    @RequestMapping("/showUtil")
    public String showUtil(@RequestParam("id") Long id, ModelMap modelMap){
        Utilisateur utilController = utilService.getUtil(id);
        modelMap.addAttribute("utilJsp", utilController);
        return "EditUtil";
    }

    @RequestMapping("/updateUtil")
    public String updateUtil(@ModelAttribute("util") Utilisateur util) {
        utilService.saveUtil(util);
        return "CreateUtil";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/utilList";
    }
}
