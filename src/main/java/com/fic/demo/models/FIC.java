package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;
import java.sql.Time;

@Entity
public class FIC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // id gerado automaticamente

    private Date dataAbertura;

    private int codCurso;

    private int codSupervisor;

    private int numEdital;

    private int codAmbiente;

    private Date dataInicio;

    private Date dataTermino;

    private Time horaInicioPrevista;

    private Time horaFimPrevista;

    private int codDocente1;

    private int codDocente2;

    private int nrMinimoAlunos;

    private int nrMaximoAlunos;

    private int qtdParcelas;

    private int codMatriculaRegular;

    private double vlrTotalCurso;

    private double vlrParcela;

    private double vlrProvisionamento;

    private int codStatusCurso;

    // Getters e Setters (vou colocar só alguns, você replica para os outros)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public int getCodSupervisor() {
        return codSupervisor;
    }

    public void setCodSupervisor(int codSupervisor) {
        this.codSupervisor = codSupervisor;
    }

    // ... e assim por diante para todos os campos

}
