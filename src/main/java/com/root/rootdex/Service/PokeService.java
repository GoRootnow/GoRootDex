package com.root.rootdex.Service;

import com.root.rootdex.dto.PokemonDto;
import com.root.rootdex.entity.PokemonEntity;
import java.util.Optional;

public interface PokeService {

    PokemonDto findPokemonById(Integer id);

    /*
    private String name;

    public PokeService(String name){
        this.name=name;
    }

    // Core Classes

    // Strings

    public String concatString(String name1, String name2){
        String name3 = name1.concat(name2);

        return name3;
    }

    // String Builder
    // String Buffer
    */

}
