package com.fic.demo.repositories;

import com.fic.demo.models.Curso2Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Curso2Repository extends JpaRepository<Curso2, Curso2Id> {
}