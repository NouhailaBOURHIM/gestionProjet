package com.example.gestionprojet.service;

import com.example.gestionprojet.dto.ProjetDto;
import com.example.gestionprojet.entity.Projet;
import com.example.gestionprojet.mapper.ProjetMapper;
import com.example.gestionprojet.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProjetServiceImpl implements ProjetService{
    @Autowired
    ProjetRepository projetRepository;

    @Override
    public List<ProjetDto> chercherProjetBy(String titre) {
        return projetRepository.findByTitreContainingOrderById(titre)
                .stream()
                .map(projet -> ProjetMapper.toDto(projet))
                .collect(Collectors.toList());
    }
    @Override
    public ProjetDto persistProjet(ProjetDto projetDto)
    {
        Projet projet=ProjetMapper.toEntity(projetDto);
        Projet savedProject=projetRepository.save(projet);
        return ProjetMapper.toDto(savedProject);

    }
}
