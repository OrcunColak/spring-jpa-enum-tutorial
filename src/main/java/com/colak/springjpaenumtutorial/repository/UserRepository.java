package com.colak.springjpaenumtutorial.repository;

import com.colak.springjpaenumtutorial.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
