package com.projectAPI.projectAPI.services;

import com.projectAPI.projectAPI.models.Project;
import com.projectAPI.projectAPI.models.Users;
import com.projectAPI.projectAPI.models.UsersProjects;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRerository extends CrudRepository<Project, Integer> {
}
