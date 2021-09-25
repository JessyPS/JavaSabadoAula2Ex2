package br.com.minhaempresa.domain;

public class FuncionarioPessoaFisica extends Funcionario {

    private String CPF;
    private String nit;

    public FuncionarioPessoaFisica(String nome, double salarioBase) {
        super(nome, salarioBase);
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }


}
