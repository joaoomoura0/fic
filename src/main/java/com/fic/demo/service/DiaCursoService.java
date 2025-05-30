package com.fic.demo.service;

import com.fic.demo.models.DiaCurso;
import com.fic.demo.repositories.DiaCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaCursoService {

    @Autowired
    private DiaCursoRepository diaCursoRepository;

    public DiaCurso inserirDiaCurso(DiaCurso diaCurso) {
        return diaCursoRepository.save(diaCurso);
    }

    public List<DiaCurso> listarDiasCurso() {
        return diaCursoRepository.findAll();
    }

    public DiaCurso buscarPorId(Integer id) {
        return diaCursoRepository.findById(id).orElse(null);
    }

    public void excluirDiaCurso(Integer id) {
        diaCursoRepository.deleteById(id);
    }
}
