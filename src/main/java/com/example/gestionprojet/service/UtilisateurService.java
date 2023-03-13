package com.example.gestionprojet.service;

import com.example.gestionprojet.dto.UtilisateurDto;
import com.example.gestionprojet.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    public List<UtilisateurDto> chercherUtilisateurBy(String name);
    public void deleteUtilisateur(int id);
}
