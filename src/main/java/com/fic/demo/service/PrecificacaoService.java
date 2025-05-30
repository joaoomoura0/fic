package com.fic.demo.service;

import com.fic.demo.models.Precificacao;
import com.fic.demo.repositories.PrecificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecificacaoService {

    @Autowired
    private PrecificacaoRepository precificacaoRepository;

    public Precificacao inserirPrecificacao(Precificacao precificacao) {
        return precificacaoRepository.save(precificacao);
    }

    public List<Precificacao> listarPrecificacoes() {
        return precificacaoRepository.findAll();
    }

    public Precificacao buscarPorId(Integer codPrecificacao) {
        return precificacaoRepository.findById(codPrecificacao).orElse(null);
    }

    public void excluirPrecificacao(Integer codPrecificacao) {
        precificacaoRepository.deleteById(codPrecificacao);
    }
}
