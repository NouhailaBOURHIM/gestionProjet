package com.example.gestionprojet.service;

import com.example.gestionprojet.dto.ProjetDto;
import com.example.gestionprojet.dto.TacheDto;
import com.example.gestionprojet.entity.Projet;
import com.example.gestionprojet.entity.Tache;
import com.example.gestionprojet.mapper.ProjetMapper;
import com.example.gestionprojet.mapper.TacheMapper;
import com.example.gestionprojet.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class TacheServiceImpl implements TacheService{
    @Autowired
    TacheRepository tacheRepository;

    @Override
    public List<TacheDto> chercherTacheBy(String titre) {
        return tacheRepository.findByTitreContainingOrderById(titre)
                .stream()
                .map(tache -> TacheMapper.toDto(tache))
                .collect(Collectors.toList());
    }

    @Override
    public TacheDto addTacheToprojet(TacheDto tacheDto, ProjetDto projetDto) {
        Projet projet= ProjetMapper.toEntity(projetDto);
        Tache tache=TacheMapper.toEntity(tacheDto);
        tache.setProjet(projet);
        Tache savedTache=tacheRepository.save(tache);
        return TacheMapper.toDto(savedTache);
    }

    @Override
    public void deleteTachesOfProjet(int id) {
        tacheRepository.deleteAllTachesOfProjet(id);
    }

}
