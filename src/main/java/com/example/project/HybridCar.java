package com.example.project;

public class HybridCar extends Car {
    public HybridCar(String color) {
        super("Hybrid Car", color, "Eco Mode");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
