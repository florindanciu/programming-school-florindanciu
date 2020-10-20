package com.programing_school;

import com.programing_school.person.Mentor;
import com.programing_school.person.Person;
import com.programing_school.person.SalesPerson;
import com.programing_school.person.Student;

import java.util.List;

public class School {
    List<Student> students;
    List<Mentor> mentors;
    List<SalesPerson> salesPeople;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }

    public List<SalesPerson> getSalesPeople() {
        return salesPeople;
    }

    public void setSalesPeople(List<SalesPerson> salesPeople) {
        this.salesPeople = salesPeople;
    }
}
