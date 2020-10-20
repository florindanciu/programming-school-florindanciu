package com.programing_school.person;

import java.util.Date;

public class Mentor extends Person {
    private Module module;
    private int salary;
    private Language knowledge;

    public Mentor(String name, Date birthDate, String phoneNumber, int salary) {
        super(name, birthDate, phoneNumber);
        this.salary = salary;
    }

    public void setKnowledge(Language knowledge) {
        this.knowledge = knowledge;
    }

    public Language getKnowledge() {
        return knowledge;
    }

    public void setModule() {
        if (this.getKnowledge().equals(Language.PYTHON))
            this.module = Module.PROGRAMING_BASICS;
        else if (this.getKnowledge().equals(Language.WEB))
            this.module = Module.WEB;
        else if (this.getKnowledge().equals(Language.JAVA_SE))
            this.module = Module.OOP;
        else if (this.getKnowledge().equals(Language.JAVA_EE))
            this.module = Module.ADVANCED;
    }

    public Module getModule() {
        return module;
    }
}
