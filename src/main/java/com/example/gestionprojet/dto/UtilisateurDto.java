package com.example.gestionprojet.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UtilisateurDto {
    private int id;
    private String nom;
    private String adresse;
    private String email;
}
