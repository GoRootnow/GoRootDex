package com.root.rootdex.Response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@JsonPropertyOrder({
        "id",
        "name"
})
public class PokemonResponse {
     Integer id;
     String name;


     public String getName() {
          return name;
     }

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public void setName(String name) {
          this.name = name;
     }
}
