package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class AreaAtuacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codareatuacao")  // Nome exato da coluna no banco
    private Integer codareatuacao;  // Atributo em minúsculo

    @Column(name = "descareaatuacao", length = 50, nullable = false)  // Constraints conforme banco
    private String descareaatuacao;  // Atributo em minúsculo

    // Getters e Setters
    public Integer getCodareatuacao() {
        return codareatuacao;
    }

    public void setCodareatuacao(Integer codareatuacao) {
        this.codareatuacao = codareatuacao;
    }

    public String getDescareaatuacao() {
        return descareaatuacao;
    }

    public void setDescareaatuacao(String descareaatuacao) {
        this.descareaatuacao = descareaatuacao;
    }
}