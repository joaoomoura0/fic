package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class DiaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // Criar um id único para a tabela

    private Integer codCalendario;

    private String codTurno;

    private Float horasDiarias;

    // Getters e Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodCalendario() {
        return codCalendario;
    }

    public void setCodCalendario(Integer codCalendario) {
        this.codCalendario = codCalendario;
    }

    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    public Float getHorasDiarias() {
        return horasDiarias;
    }

    public void setHorasDiarias(Float horasDiarias) {
        this.horasDiarias = horasDiarias;
    }
}
