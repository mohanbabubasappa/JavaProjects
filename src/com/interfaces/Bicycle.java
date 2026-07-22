package com.interfaces;

class Bicycle implements Vehicle {
    private String brand;
    private double maxSpeed;

    Bicycle(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println(brand + " bicycle ride begins.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " bicycle ride ends.");
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180);
        Vehicle bike = new Bicycle("Giant", 35);

        car.start();
        System.out.println("Max speed: " + car.getMaxSpeed() + " km/h");
        car.stop();

        System.out.println();

        bike.start();
        System.out.println("Max speed: " + bike.getMaxSpeed() + " km/h");
        bike.stop();
    }
}


