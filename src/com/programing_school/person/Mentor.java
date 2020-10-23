package com.programing_school.person;

import com.programing_school.Language;
import com.programing_school.Module;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends Employee {

    private final List<Module> modules;
    private final List<Language> knowledge;

    public Mentor(String name, String birthDate, String phoneNumber, int salary) {
        super(name, birthDate, phoneNumber, salary);
        this.knowledge = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    public List<Language> getKnowledge() {
        return knowledge;
    }

    public void addKnowledge(Language language) {
        knowledge.add(language);
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModule(Module module) {

        if (!knowledge.contains(module.getLanguage())) {
            System.out.println("Sorry " + this.getName() + ", your knowledge does not match the " + module + " module");
        }
        modules.add(module);
    }
}
