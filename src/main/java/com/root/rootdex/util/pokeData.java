package com.root.rootdex.util;

import static com.root.rootdex.util.elementData.ELECTRIC;
import static com.root.rootdex.util.elementData.FIRE;
import static com.root.rootdex.util.elementData.GRASS;
import static com.root.rootdex.util.elementData.WATER;

import com.root.rootdex.dto.GameDto;
import com.root.rootdex.dto.PokedexCatch;
import com.root.rootdex.dto.PokemonDto;
import java.time.Instant;

public class pokeData {



    PokemonDto pikachu = new PokemonDto(25,"Pikachu", ELECTRIC,null);
    PokemonDto bulbasaur = new PokemonDto(01,"Bulbasaur", GRASS,null);
    PokemonDto charmander = new PokemonDto(04,"Charmander", FIRE,null);
    PokemonDto squirtle = new PokemonDto(07,"Squirtle", WATER,null);

    GameDto pokemonRed = new GameDto(1,"Pokemon Red", Instant.now(),
            1 , 151 );
    PokedexCatch tracker = new PokedexCatch(pikachu,pokemonRed, 25,true, Instant.now());


}