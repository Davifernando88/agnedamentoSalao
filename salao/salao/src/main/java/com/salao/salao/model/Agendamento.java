
package com.salao.salao.model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Agendamento {
     private Long id;
    private String nome;
    private String telefone;
    private String servico;
    private LocalDate data;
    private LocalTime hora;

    // Construtores
    public Agendamento() {}

    public Agendamento(Long id, String nome, String telefone, String servico, LocalDate data, LocalTime hora) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.servico = servico;
        this.data = data;
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getServico() {
        return servico;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

  

   
}
