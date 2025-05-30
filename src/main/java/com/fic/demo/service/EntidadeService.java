package com.fic.demo.service;

import com.fic.demo.models.Entidade;
import com.fic.demo.repositories.EntidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadeService {

    @Autowired
    private EntidadeRepository entidadeRepository;

    public Entidade inserirEntidade(Entidade entidade) {
        return entidadeRepository.save(entidade);
    }

    public List<Entidade> listarEntidades() {
        return entidadeRepository.findAll();
    }

    public Entidade buscarPorId(Integer id) {
        return entidadeRepository.findById(id).orElse(null);
    }

    public void excluirEntidade(Integer id) {
        entidadeRepository.deleteById(id);
    }
}
