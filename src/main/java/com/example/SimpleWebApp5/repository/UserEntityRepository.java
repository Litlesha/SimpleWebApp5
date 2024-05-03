package com.example.SimpleWebApp5.repository;

import com.example.SimpleWebApp5.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserEntityRepository extends JpaRepository<User,Long> {
    User findByName(String username);
}
