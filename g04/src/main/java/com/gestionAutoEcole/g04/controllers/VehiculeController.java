package com.gestionAutoEcole.g04.controllers;

import com.gestionAutoEcole.g04.entities.Vehicule;
import com.gestionAutoEcole.g04.services.VehiculeService;
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
public class VehiculeController {
    @Autowired
    VehiculeService vehiculeService;


    @RequestMapping("/createVehicule")
    public String createVehicule(){
        return  "CreateVehicule";
    }



    @RequestMapping("/saveVehicule")
    public String saveVehicule(@Valid Vehicule vehicule , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateVehicule";
        vehiculeService.saveVehicule(vehicule);
        return "CreateVehicule";
    }

    @RequestMapping("/vehiculeList")
    public String vehiculeList(ModelMap modelMap){
        List<Vehicule> vehiculeController = vehiculeService.getAllVehicules();
        modelMap.addAttribute("vehiculeJsp",vehiculeController);
        return "VehiculeList";
    }

    @RequestMapping("/deleteVehicule")
    public String deleteVehicule(@RequestParam("id") Long id, ModelMap modelMap){
        vehiculeService.deleteVehiculeById(id);
        List<Vehicule> vehiculeController = vehiculeService.getAllVehicules();
        modelMap.addAttribute("vehiculeJsp",vehiculeController);
        return "VehiculeList";
    }

    @RequestMapping("/showVehicule")
    public String showVehicule(@RequestParam("id") Long id, ModelMap modelMap){
        Vehicule vehiculeController = vehiculeService.getVehicule(id);
        modelMap.addAttribute("vehiculeJsp", vehiculeController);
        return "EditVehicule";
    }

    @RequestMapping("/updateVehicule")
    public String updateVehicule(@ModelAttribute("vehicule") Vehicule vehicule) {
        vehiculeService.saveVehicule(vehicule);
        return "CreateVehicule";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/vehiculeList";
    }
}
