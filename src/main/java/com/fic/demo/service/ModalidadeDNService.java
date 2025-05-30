package com.fic.demo.service;

import com.fic.demo.models.ModalidadeDN;
import com.fic.demo.repositories.ModalidadeDNRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModalidadeDNService {

    @Autowired
    private ModalidadeDNRepository modalidadeDNRepository;

    public ModalidadeDN inserirModalidadeDN(ModalidadeDN modalidadeDN) {
        return modalidadeDNRepository.save(modalidadeDN);
    }

    public List<ModalidadeDN> listarModalidadesDN() {
        return modalidadeDNRepository.findAll();
    }

    public ModalidadeDN buscarPorId(Integer codModalidadeDN) {
        return modalidadeDNRepository.findById(codModalidadeDN).orElse(null);
    }

    public void excluirModalidadeDN(Integer codModalidadeDN) {
        modalidadeDNRepository.deleteById(codModalidadeDN);
    }
}
