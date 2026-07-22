package com.methodoverriding;

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks.");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.speak(); // Animal makes a sound.
        dog.speak();    // Dog barks.
    }
}
