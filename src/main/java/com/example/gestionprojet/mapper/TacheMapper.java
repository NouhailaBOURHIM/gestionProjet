package com.example.gestionprojet.mapper;

import com.example.gestionprojet.dto.TacheDto;
import com.example.gestionprojet.dto.UtilisateurDto;
import com.example.gestionprojet.entity.Tache;
import com.example.gestionprojet.entity.Utilisateur;
import org.modelmapper.ModelMapper;

public class TacheMapper {
    public static final ModelMapper MODEL_MAPPER=new ModelMapper();

    public static TacheDto toDto(Tache tache)
    {
        return MODEL_MAPPER.map(tache,TacheDto.class);
    }

    public static Tache toEntity(TacheDto tacheDto)
    {
        return MODEL_MAPPER.map(tacheDto,Tache.class);
    }
}
