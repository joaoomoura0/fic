package com.fic.demo.service;

import com.fic.demo.models.Filial;
import com.fic.demo.repositories.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialService {

    @Autowired
    private FilialRepository filialRepository;

    public Filial inserirFilial(Filial filial) {
        return filialRepository.save(filial);
    }

    public List<Filial> listarFiliais() {
        return filialRepository.findAll();
    }

    public Filial buscarPorId(Integer codFilial) {
        return filialRepository.findById(codFilial).orElse(null);
    }

    public void excluirFilial(Integer codFilial) {
        filialRepository.deleteById(codFilial);
    }
}
