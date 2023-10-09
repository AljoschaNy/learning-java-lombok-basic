package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class UniversityService {
    University university;

    public double getCourseMedian(Course course) {
        int courseIndex = university.courses().indexOf(course);
        Course searchedCourse = university.courses().get(courseIndex);
        double totalGrade = 0;
        double numStudents = searchedCourse.getStudents().size();
        for(Student student : searchedCourse.getStudents()) {
            totalGrade += student.getGrade();
        }
        return totalGrade/numStudents;
    }

}
