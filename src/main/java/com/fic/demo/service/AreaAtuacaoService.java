package com.fic.demo.service;

import com.fic.demo.models.AreaAtuacao;
import com.fic.demo.repositories.AreaAtuacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaAtuacaoService {

    @Autowired
    private AreaAtuacaoRepository areaAtuacaoRepository;

    public AreaAtuacao inserirAreaAtuacao(AreaAtuacao areaAtuacao) {
        return areaAtuacaoRepository.save(areaAtuacao);
    }

    public List<AreaAtuacao> listarAreasAtuacao() {
        return areaAtuacaoRepository.findAll();
    }

    public AreaAtuacao buscarPorId(Integer id) {
        return areaAtuacaoRepository.findById(id).orElse(null);
    }

    public void excluirAreaAtuacao(Integer id) {
        areaAtuacaoRepository.deleteById(id);
    }
}
