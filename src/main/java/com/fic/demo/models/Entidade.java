package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codentidade")  // Nome exato da coluna no banco
    private Integer codentidade;  // Atributo em minúsculo

    @Column(name = "descentidade", length = 15, nullable = false)  // Constraints do banco
    private String descentidade;  // Atributo em minúsculo

    // Getters e Setters
    public Integer getCodentidade() {
        return codentidade;
    }

    public void setCodentidade(Integer codentidade) {
        this.codentidade = codentidade;
    }

    public String getDescentidade() {
        return descentidade;
    }

    public void setDescentidade(String descentidade) {
        this.descentidade = descentidade;
    }
}