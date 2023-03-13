package com.example.gestionprojet.mapper;

import com.example.gestionprojet.dto.ProjetDto;
import com.example.gestionprojet.entity.Projet;
import org.modelmapper.ModelMapper;

public class ProjetMapper {
    public static final ModelMapper MODEL_MAPPER=new ModelMapper();

    public static ProjetDto toDto(Projet projet)
    {
        return MODEL_MAPPER.map(projet,ProjetDto.class);
    }

    public static Projet toEntity(ProjetDto projetDto)
    {
        return MODEL_MAPPER.map(projetDto,Projet.class);
    }
}
