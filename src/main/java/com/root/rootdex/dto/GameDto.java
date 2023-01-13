package com.root.rootdex.dto;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GameDto {

    int id;
    String name;
    Instant releaseDate;
    int generation;
    int numberOfPokemon;

    public GameDto(int id, String name, Instant releaseDate,
                   int generation, int numberOfPokemon) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.generation = generation;
        this.numberOfPokemon = numberOfPokemon;
    }
}