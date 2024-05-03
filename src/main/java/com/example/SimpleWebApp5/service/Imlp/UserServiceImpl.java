package com.example.SimpleWebApp5.service.Imlp;

import com.example.SimpleWebApp5.entity.User;
import com.example.SimpleWebApp5.repository.UserEntityRepository;
import com.example.SimpleWebApp5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserEntityRepository entityRepository;
    @Override
    public User findByUserName(String userName) {
        return entityRepository.findByName(userName);
    }

    @Override
    public User addUser(User user) {
        return entityRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return  entityRepository.findAll();
    }
}
