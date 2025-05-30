package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codEntidade;

    private String descEntidade;

    // Getters e Setters

    public Integer getCodEntidade() {
        return codEntidade;
    }

    public void setCodEntidade(Integer codEntidade) {
        this.codEntidade = codEntidade;
    }

    public String getDescEntidade() {
        return descEntidade;
    }

    public void setDescEntidade(String descEntidade) {
        this.descEntidade = descEntidade;
    }
}
