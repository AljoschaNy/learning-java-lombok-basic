package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
