package com.martino.SpringAuthentication.repository;

import com.martino.SpringAuthentication.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
