package org.example;

import java.util.ArrayList;
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

        Teacher teacher1 = new Teacher("t1","Thomas","Math");
        Teacher teacher2 = new Teacher("t2","Marie","Music");

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

    }
}