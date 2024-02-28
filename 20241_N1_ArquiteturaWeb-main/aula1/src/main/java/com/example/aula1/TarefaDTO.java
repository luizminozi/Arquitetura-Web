package com.example.aula1;

import java.time.LocalDateTime;


public class TarefaDTO {

    private String nome;
    private LocalDateTime dataHora;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}