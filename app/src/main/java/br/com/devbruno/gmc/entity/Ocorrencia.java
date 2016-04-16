package br.com.devbruno.gmc.entity;

import java.io.Serializable;

public class Ocorrencia implements Serializable {

    private String descricao;
    private int total;

    public Ocorrencia(String descricao, int total) {
        this.descricao = descricao;
        this.total = total;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTotal() {
        return total;
    }

    public String getTotalOcorrenciasFormatado() {
        return "Total: " + this.getTotal();
    }
}
