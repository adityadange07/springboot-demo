package com.example.springboot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentRepository,Long> {
}
