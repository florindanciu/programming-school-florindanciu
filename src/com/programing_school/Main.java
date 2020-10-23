package com.programing_school;

import com.programing_school.person.*;

public class Main {

    public static void main(String[] args) {

        School school = new School();

        Student student1 = new Student("Florin", "1984-01-07", "0788566878");
        Student student2 = new Student("Fred", "1994-08-11", "0888437734");
        Student student3 = new Student("Bill", "1999-10-26", "0788437345");
        Student student4 = new Student("George", "2001-04-18", "0888437674");
        Student student5 = new Student("Mike", "1990-08-22", "0888437877");

        System.out.println();
        student1.advanceToNextModule();
        student2.advanceToNextModule();
        student3.advanceToNextModule();
        student4.advanceToNextModule();
        student5.advanceToNextModule();

        Mentor mentor1 = new Mentor("JillTheMentor", "1980-10-23", "09378547838", 4000);
        Mentor mentor2 = new Mentor("MikeTheMentor", "1984-08-12", "02432347838", 4000);
        Mentor mentor3 = new Mentor("BillTheMentor", "1984-02-09", "02432347838", 4000);

        mentor1.addKnowledge(Language.PYTHON);
        mentor2.addKnowledge(Language.PYTHON);
        mentor2.addKnowledge(Language.WEB);
        mentor3.addKnowledge(Language.PYTHON);
        mentor3.addKnowledge(Language.JAVA_SE);
        mentor3.addKnowledge(Language.JAVA_EE);

        System.out.println();
        mentor1.setModule(Module.PROGRAMING_BASICS);
        mentor1.setModule(Module.WEB);
        mentor2.setModule(Module.WEB);
        mentor2.setModule(Module.PROGRAMING_BASICS);
        mentor3.setModule(Module.PROGRAMING_BASICS);
        mentor3.setModule(Module.OOP);
        mentor3.setModule(Module.ADVANCED);

        SalesPerson salesPerson1 = new SalesPerson("Amy", "1990-10-12", "0673634743", 3000);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);

        school.addMentor(mentor1);
        school.addMentor(mentor2);
        school.addMentor(mentor3);

        school.addSalesPerson(salesPerson1);

        System.out.println();
        for (Student student : school.getStudents()) {
            salesPerson1.canStudentBeHired(student);
        }

        System.out.println();
        for (Mentor mentor : school.getMentors()) {
            System.out.println(mentor.getName() + " has knowledge in: " + mentor.getKnowledge());
            System.out.println(mentor.getName() + " teaches in " + mentor.getModules());
            System.out.println();
        }

        System.out.println();
        System.out.println("---All persons in this school---");
        System.out.println("Students: ");
        for (Module module : Module.values()) {
            System.out.println(module.name() + ":");
            school.getStudentsByModule(module).forEach(student -> System.out.println(student.getName() +
                    " - " + student.getBirthDate() +
                    " - " + student.getPhoneNumber()));
            System.out.println();
        }
        System.out.println();
        System.out.println("Mentors:");
        school.getMentors().forEach(mentor -> System.out.println(mentor.getName() +
                " - " + mentor.getBirthDate() +
                " - " + mentor.getPhoneNumber() +
                " - $" + mentor.getSalary()));
        System.out.println();
        System.out.println("Sales people:");
        school.getSalesPeople().forEach(salesPerson -> System.out.println(salesPerson.getName() +
                " - " + salesPerson.getBirthDate() +
                " - " + salesPerson.getPhoneNumber() +
                " - $" + salesPerson.getSalary()));

    }
}
