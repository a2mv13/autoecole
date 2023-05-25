package com.gestionAutoEcole.g04.controllers;

import com.gestionAutoEcole.g04.entities.Lecon;
import com.gestionAutoEcole.g04.services.LeconService;
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
public class LeconController {
    @Autowired
    LeconService leconService;


    @RequestMapping("/createLecon")
    public String createLecon(){
        return  "CreateLecon";
    }



    @RequestMapping("/saveLecon")
    public String saveLecon(@Valid Lecon lecon , BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateLecon";
        leconService.saveLecon(lecon);
        return "CreateLecon";
    }

    @RequestMapping("/leconList")
    public String leconList(ModelMap modelMap){
        List<Lecon> leconController = leconService.getAllLecons();
        modelMap.addAttribute("leconJsp",leconController);
        return "LeconList";
    }

    @RequestMapping("/deleteLecon")
    public String deleteLecon(@RequestParam("id") Long id, ModelMap modelMap){
        leconService.deleteLeconById(id);
        List<Lecon> leconController = leconService.getAllLecons();
        modelMap.addAttribute("leconJsp",leconController);
        return "LeconList";
    }

    @RequestMapping("/showLecon")
    public String showLecon(@RequestParam("id") Long id, ModelMap modelMap){
        Lecon leconController = leconService.getLecon(id);
        modelMap.addAttribute("leconJsp", leconController);
        return "EditLecon";
    }

    @RequestMapping("/updateLecon")
    public String updateLecon(@ModelAttribute("lecon") Lecon lecon) {
        leconService.saveLecon(lecon);
        return "CreateLecon";
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/leconList";
    }
}
