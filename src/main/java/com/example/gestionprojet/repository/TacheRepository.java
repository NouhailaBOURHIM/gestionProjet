package com.example.gestionprojet.repository;

import com.example.gestionprojet.entity.Tache;
import com.example.gestionprojet.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TacheRepository extends JpaRepository<Tache,Integer> {
    public List<Tache> findByTitreContainingOrderById(String name);
}
