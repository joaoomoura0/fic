package com.fic.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

    @Entity
    public class Curso {

        @Id
        private Integer codCurso;
        private String versaoCurso;
        private String descCurso;
        private Integer codAreaAtuacao;
        private Double cargaHoraria;
        private Integer codModalidadeDN;
        private Integer codPrecificacao;
        private Double valorCurso;
        private Double novoValorCurso;

        // Getters e Setters
        public Integer getCodCurso() {
            return codCurso;
        }

        public void setCodCurso(Integer codCurso) {
            this.codCurso = codCurso;
        }

        public String getVersaoCurso() {
            return versaoCurso;
        }

        public void setVersaoCurso(String versaoCurso) {
            this.versaoCurso = versaoCurso;
        }

        public String getDescCurso() {
            return descCurso;
        }

        public void setDescCurso(String descCurso) {
            this.descCurso = descCurso;
        }

        public Integer getCodAreaAtuacao() {
            return codAreaAtuacao;
        }

        public void setCodAreaAtuacao(Integer codAreaAtuacao) {
            this.codAreaAtuacao = codAreaAtuacao;
        }

        public Double getCargaHoraria() {
            return cargaHoraria;
        }

        public void setCargaHoraria(Double cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

        public Integer getCodModalidadeDN() {
            return codModalidadeDN;
        }

        public void setCodModalidadeDN(Integer codModalidadeDN) {
            this.codModalidadeDN = codModalidadeDN;
        }

        public Integer getCodPrecificacao() {
            return codPrecificacao;
        }

        public void setCodPrecificacao(Integer codPrecificacao) {
            this.codPrecificacao = codPrecificacao;
        }

        public Double getValorCurso() {
            return valorCurso;
        }

        public void setValorCurso(Double valorCurso) {
            this.valorCurso = valorCurso;
        }

        public Double getNovoValorCurso() {
            return novoValorCurso;
        }

        public void setNovoValorCurso(Double novoValorCurso) {
            this.novoValorCurso = novoValorCurso;
        }
    }
