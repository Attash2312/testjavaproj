package com.example.project;

public class MiniVan extends Car {
    public MiniVan(String color) {
        super("MiniVan", color, "Family Mode");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
