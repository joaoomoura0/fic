package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;

@Entity
public class Feriado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codferiado")  // Sugestão de nome conforme padrão das outras tabelas
    private Integer codferiado;

    @Column(name = "dataevento", nullable = false)
    private LocalDate dataevento;  // Usando LocalDate (mais moderno que Date)

    @Column(name = "descevento", length = 100, nullable = false)
    private String descevento;

    // Getters e Setters
    public Integer getCodferiado() {
        return codferiado;
    }

    public void setCodferiado(Integer codferiado) {
        this.codferiado = codferiado;
    }

    public LocalDate getDataevento() {
        return dataevento;
    }

    public void setDataevento(LocalDate dataevento) {
        this.dataevento = dataevento;
    }

    public String getDescevento() {
        return descevento;
    }

    public void setDescevento(String descevento) {
        this.descevento = descevento;
    }
}