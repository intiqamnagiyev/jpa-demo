package com.example.jpademo.service;

import com.example.jpademo.entity.Student;
import com.example.jpademo.repository.StudentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository, SubjectService subjectService) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAll() {
             return studentRepository.findAll();
    }

    @Override
    public Student getById(long id) {
        return studentRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
