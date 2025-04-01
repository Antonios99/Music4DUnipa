package com.unipa.music4dunipa.controller;

import com.unipa.music4dunipa.model.Voto;
import com.unipa.music4dunipa.service.VotoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private VotoService votoService;



    @PostMapping("/home")
    public String setVoto(@RequestParam(name = "emotion", required = false) String emotion,  @RequestParam(name = "ipAddress", required = false) String ipAddress, Model model) {
        if (emotion != null) {
            model.addAttribute("emozione", emotion);
            model.addAttribute("id_utente", ipAddress);
            System.out.println("Indirizzo IP: " + ipAddress);
            System.out.println("Classe del bottone premuto: " + emotion);
            votoService.insertVoto(ipAddress, emotion);

        }
        return "index"; // Assicurati di avere un file home.html in templates
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}

