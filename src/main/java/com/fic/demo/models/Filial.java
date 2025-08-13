package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codfilial")
    private Integer codfilial;  // Nome em minúsculo para match com banco

    @Column(name = "descfilial", length = 30, nullable = false)
    private String descfilial;  // Nome em minúsculo para match com banco

    // Getters e Setters
    public Integer getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(Integer codfilial) {
        this.codfilial = codfilial;
    }

    public String getDescfilial() {
        return descfilial;
    }

    public void setDescfilial(String descfilial) {
        this.descfilial = descfilial;
    }
}