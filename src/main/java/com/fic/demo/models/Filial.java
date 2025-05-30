package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codFilial;

    private String descFilial;

    // Getters e Setters
    public Integer getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(Integer codFilial) {
        this.codFilial = codFilial;
    }

    public String getDescFilial() {
        return descFilial;
    }

    public void setDescFilial(String descFilial) {
        this.descFilial = descFilial;
    }
}
