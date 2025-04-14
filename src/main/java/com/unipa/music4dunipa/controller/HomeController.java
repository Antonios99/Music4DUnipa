package com.unipa.music4dunipa.controller;

import com.unipa.music4dunipa.model.Voto;
import com.unipa.music4dunipa.service.VotoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @Autowired
    private VotoService votoService;


    @PostMapping(value = "/home", consumes = "application/json")
    public String setVoto(@RequestBody Voto votoRequest, Model model) {
        Integer piacevolezza = votoRequest.getPiacevolezza();
        Integer energia = votoRequest.getEnergia();
        Integer age = votoRequest.getAge();
        String utenteId = votoRequest.getUtente_id();
        String genere = votoRequest.getGenere();
        String tipo_strumento = votoRequest.getTipo_strumento();

        if (piacevolezza != null && energia != null && utenteId != null && genere != null && tipo_strumento != null && age != null) {
            model.addAttribute("piacevolezza", piacevolezza);
            model.addAttribute("energia", energia);
            model.addAttribute("id_utente", utenteId);
            model.addAttribute("genere", genere);
            model.addAttribute("tipo_strumento", tipo_strumento);
            model.addAttribute("age", age);

            System.out.println("ID Utente: " + utenteId);
            System.out.println("Età: " + age);
            System.out.println("Genere: " + genere);
            System.out.println("Tipo strumento: " + tipo_strumento);
            System.out.println("Valore energia: " + energia);
            System.out.println("Valore piacevolezza: " + piacevolezza);

            votoService.insertVoto(utenteId, piacevolezza, energia, genere, tipo_strumento, age );
        }
        return "index";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}

