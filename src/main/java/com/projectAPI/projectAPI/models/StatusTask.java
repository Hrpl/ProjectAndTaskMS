package com.projectAPI.projectAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class StatusTask {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String Name;

    private String colorHex;


    @OneToMany(mappedBy = "statusTask")
    @JsonBackReference
    List<Task> tasks;
}
