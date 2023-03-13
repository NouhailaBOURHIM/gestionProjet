package com.example.gestionprojet.controller;

import com.example.gestionprojet.dto.ProjetDto;
import com.example.gestionprojet.dto.TacheDto;
import com.example.gestionprojet.entity.Tache;
import com.example.gestionprojet.repository.TacheRepository;
import com.example.gestionprojet.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TacheController {
    @Autowired
    TacheService tacheService;
    @Autowired
    TacheRepository tacheRepository;

     @GetMapping("/chercherTache")
    public List<TacheDto> chercherTaches(@RequestBody String titre)
     {
         return tacheService.chercherTacheBy(titre);
     }

     @PostMapping("/ajouterTache")
    public TacheDto ajouterTache(@RequestBody TacheDto tacheDto, @RequestBody ProjetDto projetDto)
     {
         return tacheService.addTacheToprojet(tacheDto,projetDto);
     }
     @DeleteMapping("/SupprimerTachesProjet")
    public String SupprimerTachesProjet(@RequestParam int id)
     {
         tacheService.deleteTachesOfProjet(id);
         return "tous les taches du projet sont suprimées";
     }

     @GetMapping("/getAllTaches")
    public List<Tache> getTaches()
     {
         return tacheRepository.findAll();
     }

}
