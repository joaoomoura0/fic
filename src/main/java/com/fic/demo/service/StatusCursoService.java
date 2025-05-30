package com.fic.demo.service;

import com.fic.demo.models.StatusCurso;
import com.fic.demo.repositories.StatusCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusCursoService {

    @Autowired
    private StatusCursoRepository statusCursoRepository;

    public StatusCurso inserirStatusCurso(StatusCurso statusCurso) {
        return statusCursoRepository.save(statusCurso);
    }

    public List<StatusCurso> listarStatusCursos() {
        return statusCursoRepository.findAll();
    }

    public StatusCurso buscarPorId(Integer codStatus) {
        return statusCursoRepository.findById(codStatus).orElse(null);
    }

    public void excluirStatusCurso(Integer codStatus) {
        statusCursoRepository.deleteById(codStatus);
    }
}
