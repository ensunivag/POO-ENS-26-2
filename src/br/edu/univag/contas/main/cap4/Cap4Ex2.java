// Comentado para funcionar nos exercicios posteriores
/*
class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;
    
    void sacar(double quantia) {
        saldo = saldo - quantia;
    }

    void depositar(double quantia) {
        saldo += quantia;
    }

    double calcularRendimento() {
        return saldo * 0.1;
    }
}
*/

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;

class Cap4Ex2 {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente();
        conta.setSaldo(1500);

        conta.depositar(50);
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacar(45);
        System.out.println("Saldo atual: " + conta.getSaldo());

        double rendimento = conta.calcularRendimento();
        System.out.println("Rendimento: " + rendimento);
    }
}