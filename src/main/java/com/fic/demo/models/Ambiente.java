package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;

@Entity
public class Ambiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codambiente")
    private Integer codambiente;

    @Column(name = "descambiente", length = 80, nullable = false)
    private String descambiente;

    @ManyToOne
    @JoinColumn(name = "codtipoambiente", nullable = false)
    private TiposAmbiente tipoambiente;

    // Getters e Setters
    public Integer getCodambiente() {
        return codambiente;
    }

    public void setCodambiente(Integer codambiente) {
        this.codambiente = codambiente;
    }

    public String getDescambiente() {
        return descambiente;
    }

    public void setDescambiente(String descambiente) {
        this.descambiente = descambiente;
    }

    public TiposAmbiente getTipoambiente() {
        return tipoambiente;
    }

    public void setTipoambiente(TiposAmbiente tipoambiente) {
        this.tipoambiente = tipoambiente;
    }
}