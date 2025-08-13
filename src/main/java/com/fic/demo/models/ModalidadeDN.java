package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class ModalidadeDN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codmodalidadedn")
    private Integer codmodalidadeDN;

    // Adicionado 'nullable = false' para corresponder à restrição do banco de dados.
    @Column(name = "escmodalidadedn", length = 80, nullable = false)
    private String escmodalidadeDN;

    // Getters e Setters
    // Os nomes dos métodos foram ajustados para seguir o padrão Java (camelCase)
    public Integer getCodmodalidadeDN() {
        return codmodalidadeDN;
    }

    public void setCodmodalidadeDN(Integer codmodalidadeDN) {
        this.codmodalidadeDN = codmodalidadeDN;
    }

    public String getEscmodalidadeDN() {
        return escmodalidadeDN;
    }

    public void setEscmodalidadeDN(String escmodalidadeDN) {
        this.escmodalidadeDN = escmodalidadeDN;
    }
}