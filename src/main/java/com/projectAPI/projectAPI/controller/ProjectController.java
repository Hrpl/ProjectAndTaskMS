package com.projectAPI.projectAPI.controller;

import com.projectAPI.projectAPI.models.Project;
import com.projectAPI.projectAPI.services.ProjectRerository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    private final ProjectRerository projectRerository;

    public ProjectController(ProjectRerository projectRerository){
        this.projectRerository = projectRerository;
    }

    @GetMapping("/ps")
    Iterable<Project> findAll(){
        var proj = projectRerository.findAll();
        return proj;
    }
}
