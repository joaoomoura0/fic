package com.fic.demo.service;

import com.fic.demo.models.CalendarioCurso;
import com.fic.demo.models.CalendarioCursoId;
import com.fic.demo.repositories.CalendarioCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarioCursoService {

    @Autowired
    private CalendarioCursoRepository calendarioCursoRepository;

    public CalendarioCurso inserirCalendarioCurso(CalendarioCurso calendarioCurso) {
        return calendarioCursoRepository.save(calendarioCurso);
    }

    public List<CalendarioCurso> listarCalendariosCurso() {
        return calendarioCursoRepository.findAll();
    }

    public CalendarioCurso buscarPorId(CalendarioCursoId id) {
        return calendarioCursoRepository.findById(id).orElse(null);
    }

    public void excluirCalendarioCurso(CalendarioCursoId id) {
        calendarioCursoRepository.deleteById(id);
    }
}


        // classe auxiliar para chave composta