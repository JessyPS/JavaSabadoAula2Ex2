package br.com.minhaempresa.domain.view;

import br.com.minhaempresa.domain.Funcionario;
import br.com.minhaempresa.domain.Gerente;
import br.com.minhaempresa.domain.Supervisor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Jesica", 7000);
        Funcionario supervisor = new Supervisor("José", 4000);
        Funcionario funcionario = new Funcionario("Fernando", 2000);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(supervisor);
        funcionarios.add(funcionario);

        funcionarios.forEach(f -> System.out.println(f.consultarContraCheque()));

        funcionario.setDataDeAdmissao(LocalDate.now().minusMonths(3));
        try {
            funcionario.solicitarFerias(LocalDate.now(), LocalDate.now().plusMonths(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        funcionario.setDataDeAdmissao(LocalDate.now().minusMonths(12));
        try {
            funcionario.solicitarFerias(LocalDate.now(), LocalDate.now().plusMonths(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Férias do funcioário");
        funcionario.getHistoricoFerias().forEach(System.out::println);
    }
}



/*...................Outras formas..........................

        for(Funcionario f : funcionarios) {
            System.out.println(f.consultarContraCheque());
        }

        funcionarios.stream().map(Funcionario::consultarContraCheque).forEach(System.out::println);

.....................Outras formas.......................... */
