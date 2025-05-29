package com.fic.demo.service;

import com.fic.demo.models.cursos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class cursoservice {

    private EntityManager entityManager;

    public cursoservice(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void inserirCurso(cursos curso) {
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
