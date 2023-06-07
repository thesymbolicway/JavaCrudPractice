package com.example.emp.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Student {
    private Long id;
    private String studentname;
    private String course;
    private int fee;

    // Getters and setters

    // Constructors

    public static void main(String[] args) {
        SpringApplication.run(Student.class, args);
    }
}
