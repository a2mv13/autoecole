package com.gestionAutoEcole.g04.controllers;

import com.gestionAutoEcole.g04.entities.Administrateur;
import com.gestionAutoEcole.g04.services.AdministrateurService;
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
public class AdministrateurController {
    @Autowired
    AdministrateurService adminService;


    @RequestMapping("/createAdmin")
    public String createAdmin(){
        return  "CreateAdmin";
    }



    @RequestMapping("/saveAdmin")
    public String saveAdmin(@Valid Administrateur admin , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateAdmin";
        adminService.saveAdmin(admin);
        return "CreateAdmin";
    }

    @RequestMapping("/adminList")
    public String adminList(ModelMap modelMap){
        List<Administrateur> adminController = adminService.getAllAdmin();
        modelMap.addAttribute("adminJsp",adminController);
        return "AdminList";
    }

    @RequestMapping("/deleteAdmin")
    public String deleteAdmin(@RequestParam("id") Long id, ModelMap modelMap){
        adminService.deleteAdminById(id);
        List<Administrateur> adminController = adminService.getAllAdmin();
        modelMap.addAttribute("adminJsp",adminController);
        return "AdminList";
    }

    @RequestMapping("/showAdmin")
    public String showAdmin(@RequestParam("id") Long id, ModelMap modelMap){
        Administrateur adminController = adminService.getAdmin(id);
        modelMap.addAttribute("adminJsp", adminController);
        return "EditAdmin";
    }

    @RequestMapping("/updateAdmin")
    public String updateAdmin(@ModelAttribute("admin") Administrateur admin) {
        adminService.saveAdmin(admin);
        return "CreateAdmin";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/adminList";
    }
}
