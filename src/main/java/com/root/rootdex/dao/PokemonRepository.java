package com.root.rootdex.dao;

import com.root.rootdex.entity.PokemonEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer> {
    PokemonEntity findAllById(Integer id);
}
