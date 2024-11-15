package com.example.project;

public class SportsCar extends Car {
    public SportsCar(String color) {
        super("Sports Car", color, "Nitro Boost");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
