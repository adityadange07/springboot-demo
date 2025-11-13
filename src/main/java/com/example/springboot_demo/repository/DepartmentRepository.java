package com.example.springboot_demo.repository;

import com.example.springboot_demo.entitiy.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
