package com.example.springboot_demo.repository;

import com.example.springboot_demo.entitiy.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
