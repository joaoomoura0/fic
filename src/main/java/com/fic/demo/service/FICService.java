package com.fic.demo.service;

import com.fic.demo.models.FIC;
import com.fic.demo.repositories.FICRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FICService {

    @Autowired
    private FICRepository ficRepository;

    public FIC inserirFIC(FIC fic) {
        return ficRepository.save(fic);
    }

    public List<FIC> listarFICs() {
        return ficRepository.findAll();
    }

    public FIC buscarPorId(Integer id) {
        return ficRepository.findById(id).orElse(null);
    }

    public void excluirFIC(Integer id) {
        ficRepository.deleteById(id);
    }
}
