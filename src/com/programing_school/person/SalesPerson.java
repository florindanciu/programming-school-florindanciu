package com.programing_school.person;

import com.programing_school.Module;

public class SalesPerson extends Employee {

    public SalesPerson(String name, String birthDate, String phoneNumber, int salary) {
        super(name, birthDate, phoneNumber, salary);
    }

    public void canStudentBeHired(Student student) {
        if (student.getProgression() == 100 && student.getModule() == Module.ADVANCED)
            System.out.println(student.getName() + " got a job.");
        System.out.println(student.getName() + ", you did not finish your " + student.getModule() + " module yet! - you need to finish the Advance module to get a job.");
    }
}
