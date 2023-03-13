package com.example.gestionprojet.controller;

import com.example.gestionprojet.dto.ProjetDto;
import com.example.gestionprojet.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjetController {
    @Autowired
    ProjetService projetService;

    @GetMapping("/chercherProjet")
    public List<ProjetDto> chercherProjet(@RequestParam String titre)
    {
        return projetService.chercherProjetBy(titre);
    }
     @PostMapping("/persisterProjet")
    public ProjetDto persisterProjet(@RequestBody ProjetDto projetDto)
     {
         return projetService.persistProjet(projetDto);
     }
}
