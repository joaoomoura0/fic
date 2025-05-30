package com.fic.demo.service;

import com.fic.demo.models.Turma;
import com.fic.demo.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository repository;

    public Turma inserir(Turma turma) {
        return repository.save(turma);
    }

    public List<Turma> listarTodos() {
        return repository.findAll();
    }

    public Turma buscarPorId(Integer codTurma) {
        return repository.findById(codTurma).orElse(null);
    }

    public void excluir(Integer codTurma) {
        repository.deleteById(codTurma);
    }
}
