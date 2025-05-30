package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Precificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codPrecificacao;

    private String descPrecificacao;

    // Getters e Setters
    public Integer getCodPrecificacao() {
        return codPrecificacao;
    }

    public void setCodPrecificacao(Integer codPrecificacao) {
        this.codPrecificacao = codPrecificacao;
    }

    public String getDescPrecificacao() {
        return descPrecificacao;
    }

    public void setDescPrecificacao(String descPrecificacao) {
        this.descPrecificacao = descPrecificacao;
    }
}
