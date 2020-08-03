package com.example.jpademo.service;

import com.example.jpademo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
   List<Student> getAll();

   Student getById(long id);

   Student saveStudent(Student student);
}
