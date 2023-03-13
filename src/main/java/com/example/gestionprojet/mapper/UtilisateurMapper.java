package com.example.gestionprojet.mapper;

import com.example.gestionprojet.dto.UtilisateurDto;
import com.example.gestionprojet.entity.Utilisateur;
import org.modelmapper.ModelMapper;

public class UtilisateurMapper {
    public static final ModelMapper MODEL_MAPPER=new ModelMapper();

    public static UtilisateurDto toDto(Utilisateur utilisateur)
    {
        return MODEL_MAPPER.map(utilisateur,UtilisateurDto.class);
    }

    public static Utilisateur toEntity(UtilisateurDto utilisateurDto)
    {
        return MODEL_MAPPER.map(utilisateurDto,Utilisateur.class);
    }
}
