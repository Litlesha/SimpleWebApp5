package com.example.SimpleWebApp5.repository;

import com.example.SimpleWebApp5.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
