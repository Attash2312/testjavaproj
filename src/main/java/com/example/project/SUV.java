package com.example.project;

public class SUV extends Car {
    public SUV(String color) {
        super("SUV", color, "All-Wheel Drive");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
