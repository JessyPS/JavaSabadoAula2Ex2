package br.com.minhaempresa.domain;

import java.time.LocalDate;

public class Trabalhar {

    private LocalDate dataHoraInicio;
    private LocalDate dataHoraFim;

    public LocalDate getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDate dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDate getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDate dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

}
