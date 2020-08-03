package com.example.jpademo.repository;

import com.example.jpademo.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Predicate;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
