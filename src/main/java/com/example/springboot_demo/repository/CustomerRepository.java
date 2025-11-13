package com.example.springboot_demo.repository;

import com.example.springboot_demo.entitiy.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
