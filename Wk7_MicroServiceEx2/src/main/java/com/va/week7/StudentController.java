package com.va.week7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(
            "S101",
            "Avinash",
            "Chaudhary",
            "647-111-2222",
            "2001-08-20",
            "Queen Street",
            "Brampton",
            "22"
        );
    }
}
