package com.fic.demo.service;

import com.fic.demo.models.SuperiorImediato;
import com.fic.demo.repositories.SuperiorImediatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperiorImediatoService {

    @Autowired
    private SuperiorImediatoRepository repository;

    public SuperiorImediato inserir(SuperiorImediato superiorImediato) {
        return repository.save(superiorImediato);
    }

    public List<SuperiorImediato> listarTodos() {
        return repository.findAll();
    }

    public SuperiorImediato buscarPorId(Integer codSupImediato) {
        return repository.findById(codSupImediato).orElse(null);
    }

    public void excluir(Integer codSupImediato) {
        repository.deleteById(codSupImediato);
    }
}
