package com.martino.SpringAuthentication.repository;

import com.martino.SpringAuthentication.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Long> {
}
