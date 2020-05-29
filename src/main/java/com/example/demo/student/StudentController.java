package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static  final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James"),
            new Student(2, "Sahil"),
            new Student(3, "Anna")
            );

    @GetMapping("/{studentid}")
    public Student getStudent(@PathVariable("studentid") Integer studentid) {
        return  STUDENTS.stream()
                .filter(student ->  studentid.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentid + " does not exists!"));
    }
}
