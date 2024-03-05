package com.TypesOfVehicles;

class Car extends Vehicle {
    int numDoors;

    // Car constructor for initializing the attribute and invoking Vehicle class constructor
    Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    // Method for displaying a message indicating that the car is starting
    void start() {
        System.out.println("The car is starting.");
    }
}