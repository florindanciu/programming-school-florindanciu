package com.programing_school.person;

import java.util.Date;

public abstract class Person {
    private String name;
    private Date birthDate;
    private String phoneNumber;

    public Person(String name, Date birthDate, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
