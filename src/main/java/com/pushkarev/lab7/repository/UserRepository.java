package com.pushkarev.lab7.repository;

import com.pushkarev.lab7.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
