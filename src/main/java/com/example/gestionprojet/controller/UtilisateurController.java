package com.example.gestionprojet.controller;

import com.example.gestionprojet.dto.UtilisateurDto;
import com.example.gestionprojet.entity.Utilisateur;
import com.example.gestionprojet.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     @DeleteMapping("/supprimerUtilisateur")
    public String supprimerUtilisateur(@RequestParam int id)
     {
         utilisateurService.deleteUtilisateur(id);
         return "succès de suppression";
     }

}
