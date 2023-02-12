package com.root.rootdex.controller;

import com.root.rootdex.Response.PokemonResponse;
import com.root.rootdex.Service.PokeService;
import com.root.rootdex.dto.PokemonDto;
import com.root.rootdex.entity.PokemonEntity;
import com.root.rootdex.mapper.PokemonDtoMapper;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pokemon")

public class Controller {

    private final PokeService pokeService;

    public Controller(PokeService pokeService) {
        this.pokeService = pokeService;
    }


    @GetMapping("/search/{id}")
    public ResponseEntity<PokemonResponse> getPokeName(@PathVariable Integer id){

        PokemonDto pokemonDto = pokeService.findPokemonById(id);
        PokemonResponse pokemonResponse = PokemonDtoMapper.MAPPER.map(pokemonDto);
        return new ResponseEntity(pokemonResponse, HttpStatus.OK);
    }
}