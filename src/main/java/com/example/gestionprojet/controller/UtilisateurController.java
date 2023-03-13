package com.example.gestionprojet.controller;

import com.example.gestionprojet.dto.UtilisateurDto;
import com.example.gestionprojet.entity.Utilisateur;
import com.example.gestionprojet.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping("/chercherUtilisateur")
    public List<UtilisateurDto> chercherUtilisateurs(@RequestBody String name)
    {
        return utilisateurService.chercherUtilisateurBy(name);
    }

}
