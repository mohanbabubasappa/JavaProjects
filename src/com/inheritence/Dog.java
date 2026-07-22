package com.inheritence;

class Dog extends Animal {
	String name="Dog";
	void speak() {
        System.out.println(name+" barks.");
    }
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        System.out.println(animal.name);
        animal.sound(); // Creature makes a sound.
        
        System.out.println(dog.name);
        dog.speak();     // Dog barks.
    }
}
