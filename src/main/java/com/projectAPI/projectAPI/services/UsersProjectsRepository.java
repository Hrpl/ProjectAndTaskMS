package com.projectAPI.projectAPI.services;

import com.projectAPI.projectAPI.models.UsersProjects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersProjectsRepository extends JpaRepository<UsersProjects, Long> {
    Optional<List<UsersProjects>> findAllByUserId(Long id);
}
