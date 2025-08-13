package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcategoria")  // Nome exato da coluna no banco
    private Integer codcategoria;  // Atributo em minúsculo

    @Column(name = "desccategoria", length = 15, nullable = false)  // Constraints do banco
    private String desccategoria;  // Atributo em minúsculo

    // Getters e Setters
    public Integer getCodcategoria() {
        return codcategoria;
    }

    public void setCodcategoria(Integer codcategoria) {
        this.codcategoria = codcategoria;
    }

    public String getDesccategoria() {
        return desccategoria;
    }

    public void setDesccategoria(String desccategoria) {
        this.desccategoria = desccategoria;
    }
}