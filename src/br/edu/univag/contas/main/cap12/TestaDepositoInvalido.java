package br.edu.univag.contas.main.cap12;

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaPoupanca;

public class TestaDepositoInvalido {
    public static void main(String[] args) {
        Conta conta = new ContaPoupanca();
        conta.depositar(0.0);
    }
}
