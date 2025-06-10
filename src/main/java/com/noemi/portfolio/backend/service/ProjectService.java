package com.noemi.portfolio.backend.service;

import com.noemi.portfolio.backend.dto.ProjectDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getAllProjects();
    ProjectDto getProjectById(Integer id);
    ProjectDto createProject(ProjectDto projectDto);
    ProjectDto updateProject(Integer id, ProjectDto projectDto);
    void deleteProject(Integer id);
}
