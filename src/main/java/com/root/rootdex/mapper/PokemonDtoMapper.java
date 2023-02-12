package com.root.rootdex.mapper;

import com.root.rootdex.Response.PokemonResponse;
import com.root.rootdex.dto.PokemonDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PokemonDtoMapper {

    PokemonDtoMapper MAPPER = Mappers.getMapper(PokemonDtoMapper.class);

    PokemonResponse map(PokemonDto pokemon);
}
