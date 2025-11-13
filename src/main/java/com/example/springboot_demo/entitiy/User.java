package com.example.springboot_demo.entitiy;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

}
