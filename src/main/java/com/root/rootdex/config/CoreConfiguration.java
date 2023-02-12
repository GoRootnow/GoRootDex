package com.root.rootdex.config;


import com.root.rootdex.Service.PokeService;
import com.root.rootdex.Service.impl.PokeServiceImpl;
import com.root.rootdex.dao.PokemonRepository;
import javax.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.root.rootdex.dao")
@EntityScan("com.root.rootdex.entity")
public class CoreConfiguration {

    @Bean
    public PokeService pokeService(final PokemonRepository pokemonRepository){
        return new PokeServiceImpl(pokemonRepository);
    }
}
