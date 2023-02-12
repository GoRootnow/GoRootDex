package com.root.rootdex.Service.impl;

import com.root.rootdex.Service.PokeService;
import com.root.rootdex.dao.PokemonRepository;
import com.root.rootdex.dto.PokemonDto;
import com.root.rootdex.entity.PokemonEntity;
import com.root.rootdex.mapper.PokemonDtoMapper;
import com.root.rootdex.mapper.PokemonEntityMapper;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PokeServiceImpl implements PokeService {

    private final PokemonRepository pokemonRepository;

    public PokeServiceImpl(PokemonRepository pokemonRepository){
        this.pokemonRepository= pokemonRepository;
    }


    @Override
    public PokemonDto findPokemonById(Integer id) {
        PokemonEntity pokemon = pokemonRepository.findAllById(id);
        //log.info("pokemonEntity: {}", pokemon.getName());

        PokemonDto pokemonDto = PokemonEntityMapper.MAPPER.map(pokemon);
        //log.info("pokemonDto: {}", pokemonDto.getName());
        return pokemonDto;
    }
}
