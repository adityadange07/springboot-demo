package com.example.springboot_demo.repository;

import com.example.springboot_demo.entitiy.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
}
