package com.example.h2_database_demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<com.example.h2databasedemo.User, Long> {
}
