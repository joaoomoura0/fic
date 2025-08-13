package com.fic.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codturma")
    private Integer codturma;

    @Column(name = "descturma", nullable = false, length = 30)
    private String descturma;

    // Getters e Setters
    public Integer getCodturma() {
        return codturma;
    }

    public void setCodturma(Integer codturma) {
        this.codturma = codturma;
    }

    public String getDescturma() {
        return descturma;
    }

    public void setDescturma(String descturma) {
        this.descturma = descturma;
    }
}
