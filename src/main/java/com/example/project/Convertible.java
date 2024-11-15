package com.example.project;

public class Convertible extends Car {
    public Convertible(String color) {
        super("Convertible", color, "Roof Open");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
