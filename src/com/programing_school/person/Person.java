package com.programing_school.person;

public abstract class Person {

    private final String name;
    private final String birthDate;
    private final String phoneNumber;

    public Person(String name, String birthDate, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
