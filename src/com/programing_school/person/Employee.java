package com.programing_school.person;

public abstract class Employee extends Person {

    private final int salary;

    public Employee(String name, String birthDate, String phoneNumber, int salary) {
        super(name, birthDate, phoneNumber);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
