package com.abstraction;

abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double area();
    abstract double perimeter();

    void describe() {
        System.out.println("Shape: " + name);
    }
}

