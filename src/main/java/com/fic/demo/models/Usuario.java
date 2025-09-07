package com.fic.demo.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor; // Adicione esta importação
import lombok.AllArgsConstructor; // Adicione esta importação

@Entity
@Table(name = "usuario")
@NoArgsConstructor // Adicione esta anotação
@AllArgsConstructor // Adicione esta anotação (opcional, mas boa prática com Lombok)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "password_hash", nullable = false, length = 255)
    private String passwordHash;

    @Column(name = "tipo_usuario", nullable = false, length = 20)
    private String tipoUsuario;

    @Column(name = "ativo")
    private Boolean ativo;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    // Getters e Setters (se você estiver usando Lombok, pode remover estes
    // e adicionar @Data ou @Getter/@Setter no topo da classe)
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}