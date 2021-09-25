package br.com.minhaempresa.domain;

import java.time.LocalDate;

public class Gerente extends FuncionarioPessoaFisica implements Demitidor{

    private static final double BONIFICACAO = 1.12;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

//    public Gerente(){
//        super ();
//        this.setBonificacao(BONIFICACAO);
//    }

    @Override
    public void demitir(Funcionario funcionario) throws Exception {
        if(funcionario instanceof Gerente) {
            throw new Exception("Você não pode demitir este funcionário");
        } else {
            funcionario.setDataDeDemissao(LocalDate.now());
        }
    }

    @Override
    public double consultarContraCheque(){
        return super.consultarContraCheque() * BONIFICACAO;
    }

    public void reajustarSalario(Funcionario funcionario, double novoSalario) throws Exception{
        if(funcionario instanceof Gerente){
            throw new Exception("Você não pode reajustar o salário de um gerente");
        }

        if(novoSalario <= funcionario.getSalarioBase()){
            throw new Exception("Novo valor de salário menor ou igual ao salário atual");
        }

        funcionario.setSalarioBase(novoSalario);
    }
}
