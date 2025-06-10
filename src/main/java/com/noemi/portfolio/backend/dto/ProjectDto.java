package com.noemi.portfolio.backend.dto;

public class ProjectDto {
    private int id;
    private String title;
    private String description;
    private String imageUrl;
    private String demoUrl;
    private String repoUrl;
    private String technologies;

    public ProjectDto() {
    }

    public ProjectDto(int id, String title, String description, String imageUrl, String demoUrl, String repoUrl, String technologies) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.demoUrl = demoUrl;
        this.repoUrl = repoUrl;
        this.technologies = technologies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDemoUrl() {
        return demoUrl;
    }

    public void setDemoUrl(String demoUrl) {
        this.demoUrl = demoUrl;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }
}
