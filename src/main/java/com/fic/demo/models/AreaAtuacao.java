package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AreaAtuacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codAreaAtuacao;

    private String descAreaAtuacao;

    // Getters e Setters
    public Integer getCodAreaAtuacao() {
        return codAreaAtuacao;
    }

    public void setCodAreaAtuacao(Integer codAreaAtuacao) {
        this.codAreaAtuacao = codAreaAtuacao;
    }

    public String getDescAreaAtuacao() {
        return descAreaAtuacao;
    }

    public void setDescAreaAtuacao(String descAreaAtuacao) {
        this.descAreaAtuacao = descAreaAtuacao;
    }
}
