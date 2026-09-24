package br.edu.univag.contas.main.cap12;

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaPoupanca;

public class TestaDepositoInvalido {
    public static void main(String[] args) {
        try {
        Conta conta = new ContaPoupanca();
        conta.depositar(0.0);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
