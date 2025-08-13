package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Funcao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codfuncao")
    private Integer codfuncao;  // Tudo minúsculo para match exato com o banco

    @Column(name = "descfuncao", length = 50, nullable = false)
    private String descfuncao;  // Tudo minúsculo para match exato com o banco

    // Getters e Setters seguindo padrão Java mas com nomes minúsculos
    public Integer getCodfuncao() {
        return codfuncao;
    }

    public void setCodfuncao(Integer codfuncao) {
        this.codfuncao = codfuncao;
    }

    public String getDescfuncao() {
        return descfuncao;
    }

    public void setDescfuncao(String descfuncao) {
        this.descfuncao = descfuncao;
    }
}