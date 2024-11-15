package com.example.project;

public class MuscleCar extends Car {
    public MuscleCar(String color) {
        super("Muscle Car", color, "Turbo Charge");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
