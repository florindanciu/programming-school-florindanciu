package com.programing_school.person;

import com.programing_school.Module;
import java.util.Random;

public class Student extends Person {

    private Module module;
    private int progression;

    public Student(String name, String birthDate, String phoneNumber) {
        super(name, birthDate, phoneNumber);
        this.module = Module.PROGRAMING_BASICS;
        setProgression();
    }

    private void setProgression() {
        Random random = new Random();
        this.progression = random.ints(80, 101).findFirst().getAsInt();
    }

    public int getProgression() {
        return progression;
    }

    public void advanceToNextModule() {
        if (progression == 100 && module == Module.PROGRAMING_BASICS) {
            module = Module.WEB;
            progression = 0;
            System.out.println("Welcome in " + module.name() + " module, " + this.getName() + ".");
        } else if (progression == 100 && module == Module.WEB) {
            module = Module.OOP;
            progression = 0;
            System.out.println("Welcome in " + module.name() + " module, " + this.getName() + ".");
        } else if (progression == 100 && module == Module.OOP) {
            module = Module.ADVANCED;
            System.out.println("Welcome in " + module.name() + " module, " + this.getName() + ".");
        }
        System.out.println(this.getName() + " your progression in " + module.name() + " is: " + progression);
    }

    public Module getModule() {
        return module;
    }
}
