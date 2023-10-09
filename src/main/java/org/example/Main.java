package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                .id("s1")
                .name("Josch")
                .address("NRW")
                .grade("1++")
                .build();
        Student student2 = Student.builder()
                .id("s2")
                .name("Tim")
                .address("NRW")
                .build();
        Student student3 = student1.withGrade("2+");
        Student student4 = student2.withGrade("3");

        Teacher teacher1 = new Teacher("t1","Thomas","Math");
        Teacher teacher2 = new Teacher("t2","Marie","Music");
        Teacher teacher3 = teacher1.withSubject("Sport");
        Teacher teacher4 = teacher2.withSubject("Religion");

        Course course1 = Course.builder()
                .id("c1")
                .name("Music Beginner")
                .teacher(teacher2)
                .students(List.of(student1,student2))
                .build();

        Course course2 = Course.builder()
                .id("c2")
                .name("Math Beginner")
                .teacher(teacher1)
                .students(List.of(student1,student2))
                .build();

        Course course3 = course1.withStudents(List.of(student3,student4));
        Course course4 = course2.withStudents(List.of(student3,student4));

        System.out.println("\nTest toString methods");
        System.out.println(course2);
        System.out.println(student1);
        System.out.println(teacher2);
        System.out.println(course3);
        System.out.println(course4);

        System.out.println("\nTest getter methods");
        System.out.println(course2.getId());
        System.out.println(student1.getName());
        System.out.println(teacher2.subject());

        System.out.println("\nTest setter methods");
        System.out.println(course2);
        System.out.println(course2);

    }
}