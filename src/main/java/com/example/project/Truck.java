package com.example.project;

public class Truck extends Car {
    public Truck(String color) {
        super("Truck", color, "Heavy Cargo Lift");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " used " + specialAbility + "!");
    }
}
