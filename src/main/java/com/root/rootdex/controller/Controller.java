package com.root.rootdex.controller;

import com.root.rootdex.Response.PokemonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping
    public PokemonResponse getPokeName(){
        PokemonResponse pokemonResponse = new PokemonResponse();
        pokemonResponse.setId(1);
        pokemonResponse.setName("pikachu");
        return pokemonResponse;
    }
}