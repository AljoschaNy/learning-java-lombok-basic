package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {

    private String id;
    private String name;
    private String address;
    @With
    private double grade;
}
