package com.TypesOfVehicles;

class Motorcycle extends Vehicle {
    int numWheels;

    // Motorcycle constructor for initializing the attribute and invoking Vehicle class constructor
    Motorcycle(String make, String model, int year, int numWheels) {
        super(make, model, year);
        this.numWheels = numWheels;
    }

    // Method for displaying a message indicating that the motorcycle is performing a wheelie
    void wheelie() {
        System.out.println("The motorcycle is performing a wheelie.");
    }
}
