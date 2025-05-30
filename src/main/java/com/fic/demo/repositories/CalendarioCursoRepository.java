package com.fic.demo.repositories;

import com.fic.demo.models.CalendarioCurso;
import com.fic.demo.models.CalendarioCursoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioCursoRepository extends JpaRepository<CalendarioCurso, CalendarioCursoId> {
}


    // classe auxiliar para chave composta