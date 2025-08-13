package com.fic.demo.models;

import jakarta.persistence.*;

@Entity
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coddocente")
    private Integer coddocente;

    @Column(name = "nomedocente", length = 50, nullable = false)
    private String nomedocente;

    @ManyToOne
    @JoinColumn(name = "codfuncao", nullable = false)
    private Funcao funcao;

    @ManyToOne
    @JoinColumn(name = "codcategoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "codentidade", nullable = false)
    private Entidade entidade;

    @ManyToOne
    @JoinColumn(name = "codfilial", nullable = false)
    private Filial filial;

    @ManyToOne
    @JoinColumn(name = "codsupimediato", nullable = false)
    private SuperiorImediato superiorImediato;

    @Column(name = "instatus", length = 1, nullable = false)
    private String instatus;

    // Getters e Setters
    public Integer getCoddocente() {
        return coddocente;
    }

    public void setCoddocente(Integer coddocente) {
        this.coddocente = coddocente;
    }

    public String getNomedocente() {
        return nomedocente;
    }

    public void setNomedocente(String nomedocente) {
        this.nomedocente = nomedocente;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public SuperiorImediato getSuperiorImediato() {
        return superiorImediato;
    }

    public void setSuperiorImediato(SuperiorImediato superiorImediato) {
        this.superiorImediato = superiorImediato;
    }

    public String getInstatus() {
        return instatus;
    }

    public void setInstatus(String instatus) {
        this.instatus = instatus;
    }
}