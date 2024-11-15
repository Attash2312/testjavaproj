package com.example.project;

public class Environment {
    String name;

    public Environment(String name) {
        this.name = name;
    }

    public void displayEnvironment() {
        System.out.println("Current Environment: " + name);
    }
}
