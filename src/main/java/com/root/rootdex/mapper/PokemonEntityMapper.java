package com.root.rootdex.mapper;

import com.root.rootdex.dto.PokemonDto;
import com.root.rootdex.entity.PokemonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PokemonEntityMapper {

    PokemonEntityMapper MAPPER = Mappers.getMapper(PokemonEntityMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    PokemonDto map(PokemonEntity pokemon);
}
