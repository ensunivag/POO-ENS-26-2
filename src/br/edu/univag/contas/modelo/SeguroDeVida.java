package br.edu.univag.contas.modelo;

public class SeguroDeVida implements Tributavel {
    private double valor;
    private String titular;
    private int numeroApolice;
    
    public String getTipo() {
        return "Seguro de Vida";
    }
    
    public double getValorImposto() {
        return valor * 0.01;
    }
}