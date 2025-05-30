package com.fic.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fic.demo.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
