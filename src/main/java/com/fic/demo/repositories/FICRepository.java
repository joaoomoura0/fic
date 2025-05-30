package com.fic.demo.repositories;

import com.fic.demo.models.FIC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FICRepository extends JpaRepository<FIC, Integer> {
}
