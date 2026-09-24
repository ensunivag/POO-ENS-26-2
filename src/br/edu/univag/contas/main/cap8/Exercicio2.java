package br.edu.univag.contas.main.cap8;

import br.edu.univag.contas.ManipuladorDeContas;
import br.edu.univag.contas.modelo.Conta;

public class Exercicio2 {
    public static void main(String[] args) {
        ManipuladorDeContas mdc = new ManipuladorDeContas();
        mdc.criaConta();
        Conta conta = mdc.getConta();
        System.out.println(conta.recuperarDadosParaImpressao());
    }
}