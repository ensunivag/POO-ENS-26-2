package br.edu.univag.contas.modelo;

public interface Tributavel {
    String getTitular();
    double getValorImposto();
    String getTipo();
}