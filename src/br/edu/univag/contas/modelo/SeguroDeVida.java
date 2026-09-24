package br.edu.univag.contas.modelo;

public class SeguroDeVida implements Tributavel {
    private double valor;
    private String titular;
    private int numeroApolice;
    
    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return "Seguro de Vida";
    }
    
    public double getValorImposto() {
        return 42 + (valor * 0.02);
    }
}