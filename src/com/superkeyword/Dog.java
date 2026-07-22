package com.superkeyword;

class Dog extends Animal {
    Dog(String name) {
        super(name); // call parent constructor
    }

    @Override
    void speak() {
        super.speak(); // call parent method
        System.out.println(name + " barks.");
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.speak();
    }
}
