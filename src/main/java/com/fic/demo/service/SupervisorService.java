package com.fic.demo.service;

import com.fic.demo.models.Supervisor;
import com.fic.demo.repositories.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorService {

    @Autowired
    private SupervisorRepository repository;

    public Supervisor inserir(Supervisor supervisor) {
        return repository.save(supervisor);
    }

    public List<Supervisor> listarTodos() {
        return repository.findAll();
    }

    public Supervisor buscarPorId(Integer codSupervisor) {
        return repository.findById(codSupervisor).orElse(null);
    }

    public void excluir(Integer codSupervisor) {
        repository.deleteById(codSupervisor);
    }
}
