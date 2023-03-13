package com.example.gestionprojet.service;

import com.example.gestionprojet.dto.ProjetDto;
import com.example.gestionprojet.entity.Projet;

import java.util.List;

public interface ProjetService {
    public List<ProjetDto> chercherProjetBy(String titre);
    public ProjetDto persistProjet(ProjetDto projetDto);
}
