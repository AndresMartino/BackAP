package com.martino.SpringAuthentication.repository;

import com.martino.SpringAuthentication.domain.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRespository extends JpaRepository<Education,Long> {
}
