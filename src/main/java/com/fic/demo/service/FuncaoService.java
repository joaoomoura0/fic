package com.fic.demo.service;

import com.fic.demo.models.Funcao;
import com.fic.demo.repositories.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncaoService {

    @Autowired
    private FuncaoRepository funcaoRepository;

    public Funcao inserirFuncao(Funcao funcao) {
        return funcaoRepository.save(funcao);
    }

    public List<Funcao> listarFuncoes() {
        return funcaoRepository.findAll();
    }

    public Funcao buscarPorId(Integer codFuncao) {
        return funcaoRepository.findById(codFuncao).orElse(null);
    }

    public void excluirFuncao(Integer codFuncao) {
        funcaoRepository.deleteById(codFuncao);
    }
}
