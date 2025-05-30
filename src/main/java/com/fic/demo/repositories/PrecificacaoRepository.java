package com.fic.demo.repositories;

import com.fic.demo.models.Precificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecificacaoRepository extends JpaRepository<Precificacao, Integer> {
}
