package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> index() {
        return List.of(new Student("Amir",
                "amir.amir@gmail.com",
                LocalDate.of(2000, 1, 31),
                22));
    }
}
