package com.programing_school.person;

import java.util.Date;
import java.util.List;

public class SalesPerson extends Person {

    private int salary;
    private final List<Student> students;

    public SalesPerson(String name, Date birthDate, String phoneNumber, int salary, List<Student> students) {
        super(name, birthDate, phoneNumber);
        this.salary = salary;
        this.students = students;
    }

    public void isHired() {
        for (Student student : students) {
            if (student.getProgression() == 100 && student.getModule() == Module.ADVANCED)
                System.out.println(student.getName() + " got a job.");
            else if (student.getProgression() < 100)
                System.out.println(student.getName() + ", you did not finish your " + student.getModule() + " module!");
        }
    }
}
