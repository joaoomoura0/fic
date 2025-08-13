package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Precificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codprecificacao")
    private Integer codprecificacao;

    // Adicionado 'length = 40' e 'nullable = false' para mapear as restrições
    // do banco de dados.
    @Column(name = "descprecificacao", length = 40, nullable = false)
    private String descprecificacao;

    // Getters e Setters
    public Integer getCodprecificacao() {
        return codprecificacao;
    }

    public void setCodprecificacao(Integer codprecificacao) {
        this.codprecificacao = codprecificacao;
    }

    public String getDescprecificacao() {
        return descprecificacao;
    }

    public void setDescprecificacao(String descprecificacao) {
        this.descprecificacao = descprecificacao;
    }
}