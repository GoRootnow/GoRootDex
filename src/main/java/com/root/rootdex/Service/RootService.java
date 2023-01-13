package com.root.rootdex.Service;

public class RootService {

    private String name;

    public RootService(String name){
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
}
