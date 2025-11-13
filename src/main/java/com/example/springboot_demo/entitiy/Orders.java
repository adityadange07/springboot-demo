package com.example.springboot_demo.entitiy;

import jakarta.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderDetails;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
