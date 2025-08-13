package com.fic.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tiposambiente")
public class TiposAmbiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codtipoambiente")
    private Integer codtipoambiente; // Renomeado para seguir a convenção do banco

    @Column(name = "desctipoambiente", nullable = false, length = 30)
    private String desctipoambiente; // Renomeado para seguir a convenção do banco

    // Getters e Setters
    public Integer getCodtipoambiente() {
        return codtipoambiente;
    }

    public void setCodtipoambiente(Integer codtipoambiente) {
        this.codtipoambiente = codtipoambiente;
    }

    public String getDesctipoambiente() {
        return desctipoambiente;
    }

    public void setDesctipoambiente(String desctipoambiente) {
        this.desctipoambiente = desctipoambiente;
    }
}