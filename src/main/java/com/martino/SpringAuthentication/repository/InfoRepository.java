package com.martino.SpringAuthentication.repository;

import com.martino.SpringAuthentication.domain.Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<Info,Long> {
}
