package com.fic.demo.repositories;

import com.fic.demo.models.ModalidadeDN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeDNRepository extends JpaRepository<ModalidadeDN, Integer> {
}
