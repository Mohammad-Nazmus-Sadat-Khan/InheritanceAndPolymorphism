package com.TypesOfVehicles;

class Vehicle {
    String make;
    String model;
    int year;

    // Vehicle constructor for initializing the attributes
    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method for displaying the information about the vehicle.
    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
