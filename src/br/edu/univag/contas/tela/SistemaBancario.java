package br.edu.univag.contas.tela;

import java.util.List;
import java.util.ArrayList;

import br.edu.univag.contas.modelo.Conta;

public class SistemaBancario {
    private static List<Conta> contas = new ArrayList<>();
    
    public static void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    
    public static void listarContas() {
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
}