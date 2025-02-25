package com.projectAPI.projectAPI.services;

import com.projectAPI.projectAPI.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findFirstByLogin(String login);
}
