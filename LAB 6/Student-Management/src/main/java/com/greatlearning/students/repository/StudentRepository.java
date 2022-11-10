package com.greatlearning.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.students.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
