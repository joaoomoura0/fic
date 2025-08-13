package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class StatusCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Adicionada a anotação @Column para ser explícito e incluir restrições
    @Column(name = "codstatus")
    private Integer codstatus;

    // Adicionada a anotação @Column para ser explícito e incluir restrições
    @Column(name = "descstatus", length = 20, nullable = false)
    private String descstatus;

    // Getters e Setters
    public Integer getCodstatus() {
        return codstatus;
    }

    public void setCodstatus(Integer codstatus) {
        this.codstatus = codstatus;
    }

    public String getDescstatus() {
        return descstatus;
    }

    public void setDescstatus(String descstatus) {
        this.descstatus = descstatus;
    }
}