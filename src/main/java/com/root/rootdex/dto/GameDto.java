package com.root.rootdex.dto;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GameDto {

    private int id;
    private String name;
    private Instant releaseDate;
    private int generation;
    private int numberOfPokemon;

    public GameDto(int id, String name, Instant releaseDate,
                   int generation, int numberOfPokemon) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.generation = generation;
        this.numberOfPokemon = numberOfPokemon;
    }
}