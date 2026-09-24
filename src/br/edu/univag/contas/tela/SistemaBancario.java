package br.edu.univag.contas.tela;

import java.util.List;
import java.util.ArrayList;

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.SeguroDeVida;

public class SistemaBancario {
    private static List<Conta> contas = new ArrayList<>();
    private static List<SeguroDeVida> seguros = new ArrayList<>();
    
    public static void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    
    public static void listarContas() {
        System.out.println();
        System.out.printf("%-20s%7s%8s%15s %s%n", "Titular", "Número", "Agência", "Saldo", "Tipo");

        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada");
        }
        else {
            for(Conta conta : contas) {
                System.out.printf("%-20S%7s%8s%15.2f %s%n", conta.getTitular(),
                    conta.getNumero(), conta.getAgencia(), conta.getSaldo(), conta.getTipo());
            }
        }
    }

    public static void adicionarSegur(SeguroDeVida seguro) {
        seguros.add(seguro);
    }
    
    public static void listarSeguros() {
        System.out.println();
        System.out.printf("%-20s%8s%15s %s%n", "Titular", "Apólice", "Valor", "Tipo");

        if (seguros.isEmpty()) {
            System.out.println("Nenhum seguro cadastrada");
        }
        else {
            for(SeguroDeVida seguro : seguros) {
                System.out.printf("%-20S%8s%15.2f %s%n", seguro.getTitular(),
                    seguro.getNumeroApolice(),  seguro.getValor(), seguro.getTipo());
            }
        }
    }
}