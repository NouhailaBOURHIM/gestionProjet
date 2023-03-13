package com.example.gestionprojet.service;

import com.example.gestionprojet.dto.ProjetDto;
import com.example.gestionprojet.dto.TacheDto;
import com.example.gestionprojet.entity.Tache;

import java.util.List;

public interface TacheService {
    public List<TacheDto> chercherTacheBy(String titre);
    public TacheDto addTacheToprojet(TacheDto tacheDto, ProjetDto projetDto);
    public void deleteTachesOfProjet(int id);
}
