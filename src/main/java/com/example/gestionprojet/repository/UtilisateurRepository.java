package com.example.gestionprojet.repository;

import com.example.gestionprojet.entity.Utilisateur;
import org.springframework.data.annotation.Reference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
    public List<Utilisateur> findByNomContainingOrderById(String name);

}
