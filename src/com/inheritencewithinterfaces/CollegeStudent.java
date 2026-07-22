package com.inheritencewithinterfaces;

class CollegeStudent implements Student {
    private String name;

    CollegeStudent(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dinner.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void study() {
        System.out.println(name + " is studying for exams.");
    }
    
    public static void main(String[] args) {
        Worker employee = new Employee("Mohan");
        studentActivity(new CollegeStudent("Asha"));

        employee.eat();
        employee.work();
        employee.sleep();
    }

    static void studentActivity(Student student) {
        student.eat();
        student.study();
        student.sleep();
    }
}
