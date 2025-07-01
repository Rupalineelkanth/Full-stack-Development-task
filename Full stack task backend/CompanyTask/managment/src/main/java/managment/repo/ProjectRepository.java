package managment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import managment.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {}