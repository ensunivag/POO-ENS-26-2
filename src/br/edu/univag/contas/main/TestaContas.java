package br.edu.univag.contas.main;

import br.edu.univag.contas.ManipuladorDeContas;
import br.edu.univag.contas.ManipuladorDeSeguroDeVida;
import br.edu.univag.contas.ManipuladorDeTributaveis;
import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.tela.SistemaBancario;

public class TestaContas {
    public static void main(String[] args) {
        criaEListaContas();
        criaEListaSeguros();

        listaImpostos();
    }

    private static void criaEListaContas() {
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

        mdc.setConta(conta1);
        mdc.transfere(conta2, 20);
        mdc.transfere(conta2, 229.80);

        SistemaBancario.listarContas();
    }

    private static void criaEListaSeguros() {
        ManipuladorDeSeguroDeVida mdsv = new ManipuladorDeSeguroDeVida();

        mdsv.criaSeguro(5001, "Patolino", 10_000);
        SistemaBancario.adicionarSeguro(mdsv.getSeguroDeVida());

        mdsv.criaSeguro(5002, "Kara Kent", 18_000);
        SistemaBancario.adicionarSeguro(mdsv.getSeguroDeVida());

        SistemaBancario.listarSeguros();
    }

    private static void listaImpostos() {
        SistemaBancario.listarTributaveis();
        ManipuladorDeTributaveis mdt = new ManipuladorDeTributaveis();
        SistemaBancario.exibeTotalImpostos(mdt);
    }
}
