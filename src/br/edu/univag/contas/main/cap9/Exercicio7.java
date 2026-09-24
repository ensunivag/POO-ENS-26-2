package br.edu.univag.contas.main.cap9;

import br.edu.univag.contas.ManipuladorDeContas;
import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.tela.SistemaBancario;

public class Exercicio7 {
    public static void main(String[] args) {
        ManipuladorDeContas mdc = new ManipuladorDeContas();

        mdc.criaConta("Duke", 1234, "6789-X", "ContaCorrente");
        Conta conta1 = mdc.getConta();
        SistemaBancario.adicionarConta(conta1);
        
        mdc.deposita(500);
        mdc.saca(250);

        mdc.criaConta("Pernalonga", 4562, "5524-3", "ContaPoupanca");
        Conta conta2 = mdc.getConta();
        SistemaBancario.adicionarConta(conta2);
        
        mdc.deposita(300);
        mdc.saca(100);

        conta1.sacar(20);

        SistemaBancario.listarContas();
        
        conta1.sacar(229.80);
        SistemaBancario.listarContas();
    }
}