package com.example.gestionprojet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "projet",fetch = FetchType.LAZY)
    private List<Tache> taches=new ArrayList<>();
}
