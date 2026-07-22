package com.inheritencewithinterfaces;

class Employee implements Worker {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating lunch.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }
}
