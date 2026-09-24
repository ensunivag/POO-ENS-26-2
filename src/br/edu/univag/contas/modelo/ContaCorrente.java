package br.edu.univag.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
    public String getTipo() {
        return "Conta Corrente";
    }
    
    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor + 0.10);
    }
    
    public double getValorImposto() {
        return getSaldo() * 0.01;
    }
}