package br.edu.univag.contas.main.cap12;

import br.edu.univag.contas.modelo.ContaPoupanca;

public class TestaSaldoSaqueSaldoInsuficiente {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(100);
        cp.sacar(101);
    }
}
