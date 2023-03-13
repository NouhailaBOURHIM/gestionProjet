package com.example.gestionprojet.dto;

import com.example.gestionprojet.entity.Projet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TacheDto {
    private int id;
    private String titre;
    private String description;
}
