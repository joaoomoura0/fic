package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codDocente;

    private String nomeDocente;

    private Integer codFuncao;

    private Integer codCategoria;

    private Integer codEntidade;

    private Integer codFilial;

    private Integer codSupImediato;

    private String inStatus;

    // Getters e Setters

    public Integer getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(Integer codDocente) {
        this.codDocente = codDocente;
    }

    public String getNomeDocente() {
        return nomeDocente;
    }

    public void setNomeDocente(String nomeDocente) {
        this.nomeDocente = nomeDocente;
    }

    public Integer getCodFuncao() {
        return codFuncao;
    }

    public void setCodFuncao(Integer codFuncao) {
        this.codFuncao = codFuncao;
    }

    public Integer getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    public Integer getCodEntidade() {
        return codEntidade;
    }

    public void setCodEntidade(Integer codEntidade) {
        this.codEntidade = codEntidade;
    }

    public Integer getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(Integer codFilial) {
        this.codFilial = codFilial;
    }

    public Integer getCodSupImediato() {
        return codSupImediato;
    }

    public void setCodSupImediato(Integer codSupImediato) {
        this.codSupImediato = codSupImediato;
    }

    public String getInStatus() {
        return inStatus;
    }

    public void setInStatus(String inStatus) {
        this.inStatus = inStatus;
    }
}
