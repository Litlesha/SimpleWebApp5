package com.example.SimpleWebApp5.service.Imlp;

import com.example.SimpleWebApp5.entity.Teacher;
import com.example.SimpleWebApp5.repository.TeacherRepository;
import com.example.SimpleWebApp5.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceIml implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> findAllTeacher() {
        return teacherRepository.findAll();
    }
}
