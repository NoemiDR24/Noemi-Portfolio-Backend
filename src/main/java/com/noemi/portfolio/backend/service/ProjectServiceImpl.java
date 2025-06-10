package com.noemi.portfolio.backend.service;

import com.noemi.portfolio.backend.dto.ProjectDto;
import com.noemi.portfolio.backend.exception.ResourceNotFoundException;
import com.noemi.portfolio.backend.model.Project;
import com.noemi.portfolio.backend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<ProjectDto> getAllProjects() {
        List<Project> projects = projectRepository.findAll();
        return  projects.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProjectDto getProjectById(Integer id) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found"));
        return convertToDto(project);
    }

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {
        Project project = convertToEntity(projectDto);
        Project savedProject = projectRepository.save(project);
        return convertToDto(savedProject);
    }

    @Override
    public ProjectDto updateProject(Integer id, ProjectDto projectDto) {
        return null;
    }

    @Override
    public void deleteProject(Integer id) {
        projectRepository.deleteById(id);
    }

    private ProjectDto convertToDto(Project project) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(project.getId());
        projectDto.setTitle(project.getTitle());
        projectDto.setDescription(project.getDescription());
        projectDto.setImageUrl(project.getImageUrl());
        projectDto.setDemoUrl(project.getDemoUrl());
        projectDto.setRepoUrl(project.getRepoUrl());
        projectDto.setTechnologies(project.getTechnologies());
        return projectDto;
    }

    private Project convertToEntity(ProjectDto projectDto) {
        Project project = new Project();
        project.setId(projectDto.getId());
        project.setTitle(projectDto.getTitle());
        project.setDescription(projectDto.getDescription());
        project.setImageUrl(projectDto.getImageUrl());
        project.setDemoUrl(projectDto.getDemoUrl());
        project.setRepoUrl(projectDto.getRepoUrl());
        project.setTechnologies(projectDto.getTechnologies());
        return project;
    }
}
