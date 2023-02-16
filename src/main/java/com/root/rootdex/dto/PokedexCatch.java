package com.root.rootdex.dto;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PokedexCatch {

    private PokemonDto pokemon;
    private GameDto game;
    private int pokedexNumber;
    private boolean isCaught;
    private Instant caughtDate;

    public PokedexCatch(PokemonDto pokemon, GameDto game,
                        int pokedexNumber, boolean isCaught, Instant caughtDate) {
        this.pokemon = pokemon;
        this.game = game;
        this.pokedexNumber = pokedexNumber;
        this.isCaught= isCaught;
        this.caughtDate = caughtDate;
    }
}