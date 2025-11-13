package com.example.springboot_demo.repository;

import com.example.springboot_demo.entitiy.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
