package com.targetsolutions.iurydev.crud_application.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "tarefa")
@Getter
@Setter
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "datacriacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    @Column(name = "titulo", length = 100, nullable = true)
    private String titulo;

    @Column(name = "descricao", columnDefinition = "TEXT", nullable = true)
    private String descricao;

    @Column(name = "status", length = 20, nullable = true)
    private String status;

    public Tarefa() {
        this.dataCriacao = new Date();
    }

    public Tarefa(Long id, Date dataCriacao, String titulo, String descricao, String status) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Date getDataCriacao() {

        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {

        this.dataCriacao = dataCriacao;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
}
