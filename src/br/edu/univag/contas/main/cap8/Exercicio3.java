package br.edu.univag.contas.main.cap8;

import br.edu.univag.contas.ManipuladorDeContas;
import br.edu.univag.contas.modelo.Conta;

public class Exercicio3 {
    public static void main(String[] args) {
        ManipuladorDeContas mdc = new ManipuladorDeContas();

        mdc.criaConta();

        Conta conta = mdc.getConta();

        mdc.deposita(1_000_000_000);
        
        System.out.println(conta.recuperarDadosParaImpressao());
    }
}