package com.fic.demo.service;

import com.fic.demo.models.Ambiente;
import com.fic.demo.repositories.AmbienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmbienteService {

    @Autowired
    private AmbienteRepository ambienteRepository;

    public Ambiente inserirAmbiente(Ambiente ambiente) {
        return ambienteRepository.save(ambiente);
    }

    public List<Ambiente> listarAmbientes() {
        return ambienteRepository.findAll();
    }

    public Ambiente buscarPorId(Integer id) {
        return ambienteRepository.findById(id).orElse(null);
    }

    public void excluirAmbiente(Integer id) {
        ambienteRepository.deleteById(id);
    }
}
