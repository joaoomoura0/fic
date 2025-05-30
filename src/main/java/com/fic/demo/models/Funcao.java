package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Funcao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codFuncao;

    private String descFuncao;

    // Getters e Setters
    public Integer getCodFuncao() {
        return codFuncao;
    }

    public void setCodFuncao(Integer codFuncao) {
        this.codFuncao = codFuncao;
    }

    public String getDescFuncao() {
        return descFuncao;
    }

    public void setDescFuncao(String descFuncao) {
        this.descFuncao = descFuncao;
    }
}
