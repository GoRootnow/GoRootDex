package com.root.rootdex.Response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "name"
})
public class PokemonResponse {
    private int id;
    private String name;
    public PokemonResponse(){

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId (int id){this.id=id;}
}
