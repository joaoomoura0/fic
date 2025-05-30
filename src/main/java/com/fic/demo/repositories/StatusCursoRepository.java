package com.fic.demo.repositories;

import com.fic.demo.models.StatusCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusCursoRepository extends JpaRepository<StatusCurso, Integer> {
}
