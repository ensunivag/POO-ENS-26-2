package br.edu.univag.contas;

import br.edu.univag.contas.modelo.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {
    private SeguroDeVida seguroDeVida;

    public SeguroDeVida getSeguroDeVida() {
        return seguroDeVida;
    }

    public void setSeguroDeVida(SeguroDeVida seguroDeVida) {
        this.seguroDeVida = seguroDeVida;
    }

    public void criaSeguro(int numeroApolice, String titular, double valor) {
        this.seguroDeVida = new SeguroDeVida();
        this.seguroDeVida.setNumeroApolice(numeroApolice);
        this.seguroDeVida.setTitular(titular);
        this.seguroDeVida.setValor(valor);
    }
}
