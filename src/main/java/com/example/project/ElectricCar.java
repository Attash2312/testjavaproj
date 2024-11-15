package com.example.project;

public class ElectricCar extends Car {
    public ElectricCar(String color) {
        super("Electric Car", color, "Instant Acceleration");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
