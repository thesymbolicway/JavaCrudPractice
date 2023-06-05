package com.example.emp.service;

import com.example.emp.domain.Student;
import com.example.emp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> listAll() {
        return repository.findAll();
    }

    public void save(Student student) {
        repository.save(student);
    }

    public Student get(long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
