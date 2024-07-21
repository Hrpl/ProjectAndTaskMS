package com.projectAPI.projectAPI.services;

import com.projectAPI.projectAPI.models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRerository extends CrudRepository<Project, Integer> {
}
