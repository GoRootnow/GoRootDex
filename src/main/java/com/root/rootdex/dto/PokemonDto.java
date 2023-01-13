package com.root.rootdex.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PokemonDto {


    int pokedexNumber;
    String name;
    ElementDto type1;
    ElementDto type2;

    public PokemonDto(int pokedexNumber, String name,
                      ElementDto type1, ElementDto type2) {
        this.pokedexNumber = pokedexNumber;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }
}