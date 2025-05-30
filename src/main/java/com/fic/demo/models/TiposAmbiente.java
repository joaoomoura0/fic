package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class TiposAmbiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codTipoAmbiente;

    private String descTipoAmbiente;

    // Getters e Setters
    public Integer getCodTipoAmbiente() {
        return codTipoAmbiente;
    }

    public void setCodTipoAmbiente(Integer codTipoAmbiente) {
        this.codTipoAmbiente = codTipoAmbiente;
    }

    public String getDescTipoAmbiente() {
        return descTipoAmbiente;
    }

    public void setDescTipoAmbiente(String descTipoAmbiente) {
        this.descTipoAmbiente = descTipoAmbiente;
    }
}
