package com.noemi.portfolio.backend.controller;

import com.noemi.portfolio.backend.dto.ProjectDto;
import com.noemi.portfolio.backend.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*") // Permitir acceso desde tu frontend React, http://localhost:8080/api/projects
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProjectDto> getAll() {
        return service.getAllProjects();
    }

    @GetMapping("/{id}")
    public ProjectDto getById(@PathVariable Integer id) {
        return service.getProjectById(id);
    }

    @PostMapping
    public ResponseEntity<ProjectDto> create(@RequestBody ProjectDto projectdto) {
        return new ResponseEntity<>(service.createProject(projectdto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ProjectDto update(@PathVariable Integer id, @RequestBody ProjectDto projectDto) {
        return service.updateProject(id, projectDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteProject(id);
        return ResponseEntity.noContent().build();
    }
}
