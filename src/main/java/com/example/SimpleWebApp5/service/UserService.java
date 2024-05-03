package com.example.SimpleWebApp5.service;

import com.example.SimpleWebApp5.entity.User;

import java.util.List;

public interface UserService {
    User findByUserName(String userName);
    User addUser(User user);
    List<User> findAllUsers();
}
