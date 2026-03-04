package com.panchajanya.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panchajanya.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
