package com.example.jpademo.controller;

import com.example.jpademo.entity.Student;
import com.example.jpademo.repository.StudentRepository;
import com.example.jpademo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping("id/{id}")
    public Student getById(@PathVariable("id") long id) {
        return studentService.getById(id);
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
       return studentService.saveStudent(student);
    }
}
