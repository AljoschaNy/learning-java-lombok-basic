package org.example;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    @With
    private List<Student> students;
}
