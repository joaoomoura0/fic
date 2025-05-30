package com.fic.demo.repositories;

import com.fic.demo.models.DiaCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaCursoRepository extends JpaRepository<DiaCurso, Integer> {
}
