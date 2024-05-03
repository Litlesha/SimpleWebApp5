package com.example.SimpleWebApp5.service.Imlp;

import com.example.SimpleWebApp5.entity.Department;
import com.example.SimpleWebApp5.repository.DepartmentRepository;
import com.example.SimpleWebApp5.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImlp implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();

    }
}
