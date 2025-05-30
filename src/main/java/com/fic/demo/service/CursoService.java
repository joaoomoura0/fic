package com.fic.demo.service;

import com.fic.demo.models.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @PersistenceContext
    private EntityManager entityManager;

    public CursoService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void inserirCurso(Curso curso) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(curso);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;  // ou tratar o erro como preferir
        }
    }
}
