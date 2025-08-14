package com.fic.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Classe para representar a chave primária composta da entidade Curso.
 * É marcada com @Embeddable para ser incorporada na entidade principal.
 */
@Embeddable
public class CursoId implements Serializable {

    @Column(name = "codcurso")
    private Integer codCurso;

    @Column(name = "versaocurso", length = 3)
    private String versaoCurso;

    // Construtor padrão necessário para o JPA
    public CursoId() {}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursoId cursoId = (CursoId) o;
        return Objects.equals(codCurso, cursoId.codCurso) &&
                Objects.equals(versaoCurso, cursoId.versaoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso, versaoCurso);
    }
}
