package br.com.minhaempresa.domain;

import java.time.LocalDate;

public class Ferias {

    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "Ferias: " + "dataInicial= " + dataInicial + ", dataFinal= " + dataFinal ;
    }
}
