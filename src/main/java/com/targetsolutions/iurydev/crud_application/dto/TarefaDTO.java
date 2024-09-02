/*
package com.targetsolutions.iurydev.crud_application.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class TarefaDTO {
    private Long id;

    @NotNull(message = "A data de criação é obrigatória.")
    private Date dataCriacao;

    @NotBlank(message = "O título é obrigatório.")
    private String titulo;

    private String descricao;

    @NotBlank(message = "O status é obrigatório.")
    private String status;

    // Construtor padrão
    public TarefaDTO() {
    }

    // Construtor completo
    public TarefaDTO(Long id, Date dataCriacao, String titulo, String descricao, String status) {
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

    @Override
    public String toString() {
        return "TarefaDTO{" +
                "id=" + id +
                ", dataCriacao=" + dataCriacao +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarefaDTO tarefaDTO = (TarefaDTO) o;
        return Objects.equals(id, tarefaDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}   */
