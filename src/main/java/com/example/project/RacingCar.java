package com.example.project;

public class RacingCar extends Car {
    public RacingCar(String color) {
        super("Racing Car", color, "Speed Boost");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
