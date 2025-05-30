package com.fic.demo.service;

import com.fic.demo.models.TiposAmbiente;
import com.fic.demo.repositories.TiposAmbienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposAmbienteService {

    @Autowired
    private TiposAmbienteRepository repository;

    public TiposAmbiente inserir(TiposAmbiente tiposAmbiente) {
        return repository.save(tiposAmbiente);
    }

    public List<TiposAmbiente> listarTodos() {
        return repository.findAll();
    }

    public TiposAmbiente buscarPorId(Integer codTipoAmbiente) {
        return repository.findById(codTipoAmbiente).orElse(null);
    }

    public void excluir(Integer codTipoAmbiente) {
        repository.deleteById(codTipoAmbiente);
    }
}
