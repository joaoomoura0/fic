package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class ModalidadeDN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codModalidadeDN;

    private String descModalidadeDN;

    // Getters e Setters
    public Integer getCodModalidadeDN() {
        return codModalidadeDN;
    }

    public void setCodModalidadeDN(Integer codModalidadeDN) {
        this.codModalidadeDN = codModalidadeDN;
    }

    public String getDescModalidadeDN() {
        return descModalidadeDN;
    }

    public void setDescModalidadeDN(String descModalidadeDN) {
        this.descModalidadeDN = descModalidadeDN;
    }
}
