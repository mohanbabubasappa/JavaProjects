package com.finalkeyword;

class Car extends Vehicle {
    Car(String model) {
        super(model);
    }

    // Cannot override displayModel() because it's final in Vehicle
    // @Override
    // void displayModel() { ... } // compile error

    public static void main(String[] args) {
        final int maxSpeed = 120;
        System.out.println("Max speed: " + maxSpeed);

        Car car = new Car("Tesla");
        car.displayModel();
    }
}
