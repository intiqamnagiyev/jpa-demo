package com.example.jpademo.service;

import com.example.jpademo.entity.Subject;
import com.example.jpademo.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class SubjectServiceImpl implements SubjectService{
private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }
}
