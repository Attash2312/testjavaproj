package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController {
    @FXML private ComboBox<String> carComboBox;
    @FXML private ComboBox<String> environmentComboBox;
    @FXML private Button startButton;
    @FXML private Label resultLabel;

    private Car[] cars = new Car[10];
    private Environment[] environments = {
            new Environment("Subway"),
            new Environment("Autumn"),
            new Environment("Night"),
            new Environment("Snowy"),
            new Environment("Desert"),
            new Environment("Mountain"),
            new Environment("City"),
            new Environment("Forest"),
            new Environment("Beach"),
            new Environment("Rainy")
    };

    @FXML
    public void initialize() {
        // Initialize cars
        initializeCars();

        // Populate the car combo box
        for (Car car : cars) {
            carComboBox.getItems().add(car.name + " - " + car.color);
        }

        // Populate the environment combo box
        for (Environment environment : environments) {
            environmentComboBox.getItems().add(environment.name);
        }

        resultLabel.setText("");
    }

    private void initializeCars() {
        cars[0] = new SportsCar("Red");
        cars[1] = new Truck("Blue");
        cars[2] = new MuscleCar("Black");
        cars[3] = new Convertible("Yellow");
        cars[4] = new SUV("Green");
        cars[5] = new ElectricCar("White");
        cars[6] = new RacingCar("Orange");
        cars[7] = new ClassicCar("Brown");
        cars[8] = new MiniVan("Silver");
        cars[9] = new HybridCar("Purple");
    }

    @FXML
    private void onStartRace() {
        int carIndex = carComboBox.getSelectionModel().getSelectedIndex();
        int envIndex = environmentComboBox.getSelectionModel().getSelectedIndex();

        if (carIndex >= 0 && envIndex >= 0) {
            Car selectedCar = cars[carIndex];
            Environment selectedEnvironment = environments[envIndex];
            selectedEnvironment.displayEnvironment();

            String resultText = "Current Environment: " + selectedEnvironment.name + "\n" +
                    selectedCar.name + " used " + selectedCar.specialAbility + "!";
            resultLabel.setText(resultText);
        } else {
            resultLabel.setText("Please select both a car and an environment.");
        }
    }
}
