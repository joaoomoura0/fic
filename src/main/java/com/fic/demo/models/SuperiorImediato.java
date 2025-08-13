package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "superiorimediato") // Adicionando o nome da tabela
public class SuperiorImediato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codsupimediato") // Sendo explícito no nome da coluna
    private Integer codsupimediato;

    @Column(name = "descsupimediato", length = 40, nullable = false) // Mapeando as restrições
    private String descsupimediato;

    // Getters e Setters
    public Integer getCodsupimediato() {
        return codsupimediato;
    }

    public void setCodsupimediato(Integer codsupimediato) {
        this.codsupimediato = codsupimediato;
    }

    public String getDescsupimediato() {
        return descsupimediato;
    }

    public void setDescsupimediato(String descsupimediato) {
        this.descsupimediato = descsupimediato;
    }
}