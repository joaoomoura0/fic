package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@IdClass(CalendarioCursoId.class)
public class CalendarioCurso {

    @Id
    private Integer codCurso;

    @Id
    private Integer codCalendario;

    private Integer codTurma;

    // Getters e Setters

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public Integer getCodCalendario() {
        return codCalendario;
    }

    public void setCodCalendario(Integer codCalendario) {
        this.codCalendario = codCalendario;
    }

    public Integer getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(Integer codTurma) {
        this.codTurma = codTurma;
    }
}



    // classe auxiliar para chave composta