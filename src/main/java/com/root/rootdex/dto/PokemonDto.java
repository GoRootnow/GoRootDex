package com.root.rootdex.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;



public class PokemonDto {
     Integer id;
     String name;

     public Integer getId() {
          return id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setId(Integer id) {
          this.id = id;
     }
}