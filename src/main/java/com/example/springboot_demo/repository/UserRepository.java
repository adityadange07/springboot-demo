package com.example.springboot_demo.repository;

import com.example.springboot_demo.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
