package com.example.project;

public abstract class Car {
    String name;
    String color;
    String specialAbility;

    public Car(String name, String color, String specialAbility) {
        this.name = name;
        this.color = color;
        this.specialAbility = specialAbility;
    }

    public abstract void useSpecialAbility();

    public void displayInfo() {
        System.out.println("Car Name: " + name + ", Color: " + color + ", Special Ability: " + specialAbility);
    }
}
