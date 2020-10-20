package com.programing_school.person;

import java.util.Date;

public class Student extends Person {

    private Module module;
    private int progression;

    public Student(String name, Date birthDate, String phoneNumber) {
        super(name, birthDate, phoneNumber);
    }

    public void setProgression(int progression) {
        this.progression = progression;
    }

    public int getProgression() {
        return progression;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Module getModule() {
        return module;
    }
}
