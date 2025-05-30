package com.fic.demo.service;

import com.fic.demo.models.Feriado;
import com.fic.demo.repositories.FeriadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeriadoService {

    @Autowired
    private FeriadoRepository feriadoRepository;

    public Feriado inserirFeriado(Feriado feriado) {
        return feriadoRepository.save(feriado);
    }

    public List<Feriado> listarFeriados() {
        return feriadoRepository.findAll();
    }

    public Feriado buscarPorId(Integer id) {
        return feriadoRepository.findById(id).orElse(null);
    }

    public void excluirFeriado(Integer id) {
        feriadoRepository.deleteById(id);
    }
}
