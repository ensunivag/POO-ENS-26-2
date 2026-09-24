package br.edu.univag.contas.modelo;

import br.edu.univag.contas.main.cap12.SaldoInsuficienteException;

/**
 * Clase que representa uma conta bancária.
 * @author Shimo
 * @since 1.0
 */
public abstract class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;
    
    /**
     * Construtor padrão.
     */
    public Conta() {}
    
    public Conta(String titular) {
        setTitular(titular);
    }
    
    public abstract String getTipo();
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getAgencia() {
        return agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getDataAbertura() {
        return dataAbertura;
    }
    
    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public boolean sacar(double quantia) {
        if (quantia <= 0) {
            System.out.println("O valor a sacar deve ser maior que zero.");
            return false;
        }

        if (saldo < quantia) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }

        saldo = saldo - quantia;
        return true;
    }

    public void depositar(double quantia) {
        if (quantia <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior do que zero.");
        }

        saldo += quantia;
    }
    
    public void transferir(Conta destino, double quantia) {
        if (this.sacar(quantia)) {
            destino.depositar(quantia);
        }
    }

    public double calcularRendimento() {
        return saldo * 0.1;
    }
    
    public String recuperarDadosParaImpressao() {
        String formato = "Titular: %S%nNúmero: %d%nAgência: %s%nSaldo: %.2f%n" +
            "Data de abertura: %s%n";
        return String.format(formato, titular, numero, agencia, saldo,
            dataAbertura);
    }
}