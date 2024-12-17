package ca.javau11.services;

import org.springframework.stereotype.Service;

import ca.javau11.entities.Student;

@Service
public class StudentService {

    public Student getDummyStudent() {
        return new Student("Alice", "Cooper");
    }

    public Student getStudent(String name) {
        return new Student(name, "Wonderland");
    }
}

