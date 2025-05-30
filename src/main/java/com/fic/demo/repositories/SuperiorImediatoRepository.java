package com.fic.demo.repositories;

import com.fic.demo.models.SuperiorImediato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperiorImediatoRepository extends JpaRepository<SuperiorImediato, Integer> {
}
