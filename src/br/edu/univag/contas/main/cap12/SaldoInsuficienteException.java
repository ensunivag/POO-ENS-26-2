package br.edu.univag.contas.main.cap12;

/**
 * Exceção personalizada.
 */
public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
