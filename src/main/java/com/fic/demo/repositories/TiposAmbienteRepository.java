package com.fic.demo.repositories;

import com.fic.demo.models.TiposAmbiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposAmbienteRepository extends JpaRepository<TiposAmbiente, Integer> {
}
