package br.com.minhaempresa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String endereco;
    private String nome;
    private String email;
    private String setor;
    private LocalDate dataDeAdmissao;
    private LocalDate dataDeDemissao;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.admitir();
    }

    private List<Ferias> historicoFerias = new ArrayList<>();
    private List<Trabalhar> trabalhoDiario = new ArrayList<>();

//    private double bonificacao;
//
//    public Funcionario() {
//        this.bonificacao = 0;
//    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public LocalDate getDataDeDemissao() {
        return dataDeDemissao;
    }

    public void setDataDeDemissao(LocalDate dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double consultarContraCheque() {
        return getSalarioBase();
    }

    public List<Ferias> getHistoricoFerias() {
        return historicoFerias;
    }

    public void setHistoricoFerias(List<Ferias> historicoFerias) {
        this.historicoFerias = historicoFerias;
    }

    public void solicitarFerias(LocalDate dataInicial, LocalDate dataFinal) throws Exception {
        Ferias ferias = new Ferias();

        if (this.dataDeAdmissao.isAfter(LocalDate.now().minusMonths(11))) {
            throw new Exception("Periodo de férias inválido.");
        }

        if (historicoFerias.size() > 0) {
            Ferias ultimasFerias = historicoFerias.get(historicoFerias.size() - 1);

            if (ultimasFerias.getDataFinal() == null) {
                throw new Exception(this.nome + " já está de férias.");
            }

            if (LocalDate.now().minusMonths(4).isBefore(ultimasFerias.getDataFinal())) {
                throw new Exception("Fora de período para soliciação de férias.");
            }
        }

        ferias.setDataInicial(dataInicial);
        ferias.setDataFinal(dataFinal);

        this.historicoFerias.add(ferias);
    }

    //Como registrar data e hora do funcionário trabalhando
    public void trabalhador(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) {
        Trabalhar trabalhar = new Trabalhar();
    }

    public void solicitarDemissao() {
        this.setDataDeDemissao(LocalDate.now());
    }

    public void solicitarAumentos(double valor) {
    }

    public void admitir() {
        setDataDeAdmissao(LocalDate.now());
    }

//    protected void setBonificacao(double bonificacao) {
//        this.bonificacao = bonificacao;
//    }
}
