package com.example.jpademo.controller;

import com.example.jpademo.entity.Student;
import com.example.jpademo.entity.Teacher;
import com.example.jpademo.repository.StudentRepository;
import com.example.jpademo.repository.TeacherRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @GetMapping
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @GetMapping("id/{id}")
    public Teacher getById(@PathVariable("id") long id) {
        return teacherRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
