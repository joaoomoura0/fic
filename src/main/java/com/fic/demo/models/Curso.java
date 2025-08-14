package com.fic.demo.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

    @EmbeddedId
    private CursoId id;

    @Column(name = "desccurso", nullable = false, length = 200)
    private String descCurso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codareaatuacao", nullable = false)
    private AreaAtuacao areaAtuacao;

    @Column(name = "cargahoraria", nullable = false, precision = 6, scale = 2)
    private BigDecimal cargaHoraria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codmodalidadeDN", nullable = false)
    private ModalidadeDN modalidadeDN;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codprecificacao", nullable = false)
    private Precificacao precificacao;

    @Column(name = "valorcurso", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorCurso;

    @Column(name = "datainicio", nullable = false)
    private Date dataInicio;

    @Column(name = "tipoacao", nullable = false, length = 50)
    private String tipoAcao;

    // Construtor padrão e Getters/Setters

    public Curso() {
        this.id = new CursoId();
    }

    public CursoId getId() {
        return id;
    }

    public void setId(CursoId id) {
        this.id = id;
    }

    public String getDescCurso() {
        return descCurso;
    }

    public void setDescCurso(String descCurso) {
        this.descCurso = descCurso;
    }

    public AreaAtuacao getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public BigDecimal getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(BigDecimal cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ModalidadeDN getModalidadeDN() {
        return modalidadeDN;
    }

    public void setModalidadeDN(ModalidadeDN modalidadeDN) {
        this.modalidadeDN = modalidadeDN;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public void setPrecificacao(Precificacao precificacao) {
        this.precificacao = precificacao;
    }

    public BigDecimal getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(BigDecimal valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getTipoAcao() {
        return tipoAcao;
    }

    public void setTipoAcao(String tipoAcao) {
        this.tipoAcao = tipoAcao;
    }
}
