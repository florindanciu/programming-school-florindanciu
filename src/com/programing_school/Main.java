package com.programing_school;

import com.programing_school.person.*;
import com.programing_school.person.Module;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        School school = new School();

        List<Student> students = new ArrayList<>();
        List<Mentor> mentors = new ArrayList<>();
        List<SalesPerson> salesPeople = new ArrayList<>();

        Student student1 = new Student("Florin", new Date(), "0788566878");
        Student student2 = new Student("Fred", new Date(), "0888437734");

        student1.setModule(Module.ADVANCED);
        student1.setProgression(100);
        students.add(student1);

        student2.setModule(Module.WEB);
        student2.setProgression(80);
        students.add(student2);

        students.forEach(student -> {
            System.out.println(student.getName() + " - " + student.getModule() + " - " + student.getProgression() + "% progression.");
        });
        System.out.println("");

        SalesPerson salesPerson1 = new SalesPerson("Moni", new Date(), "067363473", 3000, students);
        salesPeople.add(salesPerson1);
        salesPerson1.isHired();
        System.out.println("");

        Mentor mentor1 = new Mentor("Alex", new Date(), "09378547838", 4000);
        Mentor mentor2 = new Mentor("Adam", new Date(), "02432347838", 4000);

        mentor1.setKnowledge(Language.PYTHON);
        mentor1.setModule();
        mentors.add(mentor1);
        mentor2.setKnowledge(Language.JAVA_EE);
        mentor2.setModule();
        mentors.add(mentor2);

        System.out.println(mentor1.getName() + " has knowledge in " + mentor1.getKnowledge() +
                " and it will teach in " + mentor1.getModule());
        System.out.println(mentor2.getName() + " has knowledge in " + mentor2.getKnowledge() +
                " and it will teach in " + mentor2.getModule());

        school.setStudents(students);
        school.setMentors(mentors);
        school.setSalesPeople(salesPeople);

        System.out.println("");
        System.out.println("---All persons in this school---");
        System.out.println("Students: ");
        school.getStudents().forEach(student -> System.out.println(student.getName()));
        System.out.println("");
        System.out.println("Mentors:");
        school.getMentors().forEach(mentor -> System.out.println(mentor.getName()));
        System.out.println("");
        System.out.println("Sales people:");
        school.getSalesPeople().forEach(salesPerson -> System.out.println(salesPerson.getName()));

    }
}
