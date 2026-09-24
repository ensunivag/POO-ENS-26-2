package br.edu.univag.contas.main.cap9;

import br.edu.univag.contas.ManipuladorDeContas;
import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.tela.SistemaBancario;

public class Exercicio4 {
    public static void main(String[] args) {
        ManipuladorDeContas mdc = new ManipuladorDeContas();

        mdc.criaConta("Duke", 1234, "6789-X", "ContaCorrente");
        Conta conta1 = mdc.getConta();
        SistemaBancario.adicionarConta(conta1);

        mdc.criaConta("Pernalonga", 4562, "5524-3", "ContaPoupanca");
        Conta conta2 = mdc.getConta();
        SistemaBancario.adicionarConta(conta2);

        SistemaBancario.listarContas();
    }
}