package com.martino.SpringAuthentication.repository;


import com.martino.SpringAuthentication.domain.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRespository extends JpaRepository<Experience,Long> {
}
