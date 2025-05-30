package com.fic.demo.service;

import com.fic.demo.models.Docente;
import com.fic.demo.repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public Docente inserirDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public List<Docente> listarDocentes() {
        return docenteRepository.findAll();
    }

    public Docente buscarPorId(Integer id) {
        return docenteRepository.findById(id).orElse(null);
    }

    public void excluirDocente(Integer id) {
        docenteRepository.deleteById(id);
    }
}
