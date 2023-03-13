package com.example.gestionprojet.service;

import com.example.gestionprojet.dto.UtilisateurDto;
import com.example.gestionprojet.entity.Utilisateur;
import com.example.gestionprojet.mapper.ProjetMapper;
import com.example.gestionprojet.mapper.UtilisateurMapper;
import com.example.gestionprojet.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public List<UtilisateurDto> chercherUtilisateurBy(String name) {
        return utilisateurRepository.findByNomContainingOrderById(name)
                .stream()
                .map(utilisateur -> UtilisateurMapper.toDto(utilisateur))
                .collect(Collectors.toList());
    }
}
