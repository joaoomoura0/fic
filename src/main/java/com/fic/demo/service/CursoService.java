package com.fic.demo.service;

import com.fic.demo.models.Curso2Id;
import com.fic.demo.repositories.Curso2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Curso2Service {

    @Autowired
    private Curso2Repository curso2Repository;

    public Curso2 salvarCurso(Curso2 curso2) {
        return curso2Repository.save(curso2);
    }

    public List<Curso2> listarCursos() {
        return curso2Repository.findAll();
    }

    public Optional<Curso2> buscarPorId(Curso2Id id) {
        return curso2Repository.findById(id);
    }

    public void excluirCurso(Curso2Id id) {
        curso2Repository.deleteById(id);
    }
}