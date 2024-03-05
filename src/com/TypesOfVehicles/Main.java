package com.TypesOfVehicles;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Car and Motorcycle classes and setting their attributes
        Car car1 = new Car("BMW", "7 Series Sedan", 1977, 4);
        Motorcycle motorCycle1 = new Motorcycle("Harley-Davidson", "Honda Rebel 500", 2017, 2);

        // Displaying car1 information
        System.out.println("Car Information:");
        car1.displayInfo(); // Calling displayInfo method for car1

        car1.start(); // Calling start method for car1

        // Displaying car1 information
        System.out.println("\nMotorcycle Information:");
        motorCycle1.displayInfo(); // Calling displayInfo method for motorCycle1

        motorCycle1.wheelie(); // Calling wheelie method for motorCycle1
    }
}
