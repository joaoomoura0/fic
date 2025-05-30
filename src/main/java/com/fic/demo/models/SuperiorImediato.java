package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class SuperiorImediato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codSupImediato;

    private String nomSuperiorImediato;

    // Getters e Setters
    public Integer getCodSupImediato() {
        return codSupImediato;
    }

    public void setCodSupImediato(Integer codSupImediato) {
        this.codSupImediato = codSupImediato;
    }

    public String getNomSuperiorImediato() {
        return nomSuperiorImediato;
    }

    public void setNomSuperiorImediato(String nomSuperiorImediato) {
        this.nomSuperiorImediato = nomSuperiorImediato;
    }
}
