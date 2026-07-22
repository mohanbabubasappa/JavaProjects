package com.interfaces;

class Car implements Vehicle {
    private String make;
    private double maxSpeed;

    Car(String make, double maxSpeed) {
        this.make = make;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println(make + " car is starting.");
    }

    @Override
    public void stop() {
        System.out.println(make + " car is stopping.");
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }
}