package com.programing_school;

import com.programing_school.person.Mentor;
import com.programing_school.person.SalesPerson;
import com.programing_school.person.Student;

import java.util.ArrayList;
import java.util.List;

public class School {

    private final List<Student> students;
    private final List<Mentor> mentors;
    private final List<SalesPerson> salesPeople;

    public School() {
        students = new ArrayList<>();
        mentors = new ArrayList<>();
        salesPeople = new ArrayList<>();
    }

    public List<Student> getStudentsByModule(Module module) {
        List<Student> studentsByModule = new ArrayList<>();
        for (Student student : students) {
            if (student.getModule() == module) {
                studentsByModule.add(student);
            }
        }
        return studentsByModule;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void addSalesPerson(SalesPerson salesPerson) {
        salesPeople.add(salesPerson);

    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public List<SalesPerson> getSalesPeople() {
        return salesPeople;
    }
}
