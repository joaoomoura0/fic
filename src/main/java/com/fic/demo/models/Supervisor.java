package com.fic.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "supervisor")
public class Supervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codsupervisor")
    private Integer codsupervisor; // Renomeado para seguir a convenção do banco

    @Column(name = "descsupervisor", nullable = false, length = 30)
    private String descsupervisor; // Renomeado para seguir a convenção do banco

    // Getters e Setters
    public Integer getCodsupervisor() {
        return codsupervisor;
    }

    public void setCodsupervisor(Integer codsupervisor) {
        this.codsupervisor = codsupervisor;
    }

    public String getDescsupervisor() {
        return descsupervisor;
    }

    public void setDescsupervisor(String descsupervisor) {
        this.descsupervisor = descsupervisor;
    }
}