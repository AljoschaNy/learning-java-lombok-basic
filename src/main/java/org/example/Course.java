package org.example;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Value
@Builder
public class Course {
    String id;
    String name;
    Teacher teacher;
    @With
    List<Student> students;
}
