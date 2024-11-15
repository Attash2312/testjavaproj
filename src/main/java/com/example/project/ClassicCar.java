package com.example.project;

public class ClassicCar extends Car {
    public ClassicCar(String color) {
        super("Classic Car", color, "Vintage Charm");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
