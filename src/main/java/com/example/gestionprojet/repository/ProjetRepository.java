package com.example.gestionprojet.repository;

import com.example.gestionprojet.entity.Projet;
import com.example.gestionprojet.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,Integer> {
    public List<Projet> findByTitreContainingOrderById(String name);
    public List<Projet> findAllByUtilisateurId(int id);
}
