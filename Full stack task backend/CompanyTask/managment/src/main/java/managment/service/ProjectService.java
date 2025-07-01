package managment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import managment.entity.Project;
import managment.repo.ProjectRepository;
import managment.requestModel.ProjectRequest;

@Service
public class ProjectService {
    @Autowired private ProjectRepository repo;

    public List<Project> getAll() { return repo.findAll(); }
    public Project save(ProjectRequest request) {
        Project p = new Project();
        p.setName(request.getName());
        p.setDescription(request.getDescription());
        p.setImageUrl(request.getImageUrl());
        return repo.save(p);
    }
}