package com.fic.demo.service;

import com.fic.demo.models.Curso;
import com.fic.demo.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso salvarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> buscarPorId(Integer id) {
        return cursoRepository.findById(id);
    }

    public void deletarCurso(Integer id) {
        cursoRepository.deleteById(id);
    }
}
