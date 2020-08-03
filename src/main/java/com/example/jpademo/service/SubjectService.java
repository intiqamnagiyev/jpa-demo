package com.example.jpademo.service;

import com.example.jpademo.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public interface SubjectService {
    List<Subject> findAll();
}
