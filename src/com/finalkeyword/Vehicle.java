package com.finalkeyword;

class Vehicle {
    final String model;

    Vehicle(String model) {
        this.model = model;
    }

    final void displayModel() {
        System.out.println("Model: " + model);
    }
}
