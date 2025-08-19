package com.fic.demo.service;

import com.fic.demo.models.Curso;
import com.fic.demo.models.CursoId;
import com.fic.demo.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    // Injeta o repositório para acesso aos dados
    @Autowired
    private CursoRepository cursoRepository;

    public Curso salvarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> buscarPorId(CursoId id) {
        return cursoRepository.findById(id);
    }

    public void excluirCurso(CursoId id) {
        cursoRepository.deleteById(id);
    }

    public Page<Curso> listarCursosPaginados(Pageable pageable) {
        return cursoRepository.findAll(pageable);
    }
}
