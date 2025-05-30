package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ambiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codAmbiente;

    private String descAmbiente;

    private Integer codTipoAmbiente;

    // Getters e Setters
    public Integer getCodAmbiente() {
        return codAmbiente;
    }

    public void setCodAmbiente(Integer codAmbiente) {
        this.codAmbiente = codAmbiente;
    }

    public String getDescAmbiente() {
        return descAmbiente;
    }

    public void setDescAmbiente(String descAmbiente) {
        this.descAmbiente = descAmbiente;
    }

    public Integer getCodTipoAmbiente() {
        return codTipoAmbiente;
    }

    public void setCodTipoAmbiente(Integer codTipoAmbiente) {
        this.codTipoAmbiente = codTipoAmbiente;
    }
}
