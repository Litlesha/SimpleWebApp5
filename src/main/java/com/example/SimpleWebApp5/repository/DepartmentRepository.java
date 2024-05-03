package com.example.SimpleWebApp5.repository;

import com.example.SimpleWebApp5.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
